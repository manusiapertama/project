/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import Model.FutsalModel;

/**
 *
 * @author Anugrah
 */
@WebServlet(name = "History", urlPatterns = {"/History"})
public class history extends HttpServlet {
 
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String proses=request.getParameter("proses");
        if (proses.equals("logout")){
            HttpSession sesi=request.getSession();
            sesi.invalidate();
            response.sendRedirect("index.jsp");
        }
 
    }
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        String proses = request.getParameter("proses");
         
        if (proses.equals("history")) {
            String nama = request.getParameter("nama_tim");
            String no_telpon = request.getParameter("no_lapangan");
            String email = request.getParameter("hari");
            String password = request.getParameter("jam");
            String id_akun=request.getParameter("id_booking");
            
            if (password == null || password.equals("")) {   //validasi apabila field belum diisi
                response.sendRedirect("index.jsp");
            } else {
                FutsalModel pm = new FutsalModel();
                List<FutsalModel> datahistory = new ArrayList<FutsalModel>();
 
                datahistory = pm.LoginUser(email, password);
                if (datahistory.isEmpty()) { //validasi apabila username dan password salah
                        response.sendRedirect("index.jsp");
                } else {
                    HttpSession session = request.getSession(true);
                    session.setAttribute("nama_tim", datahistory.get(0).getNamaTim());
                    session.setAttribute("no_lapangan", datahistory.get(0).getNoLap());
                    session.setAttribute("hari", datahistory.get(0).getHari());
                    session.setAttribute("jam", datahistory.get(0).getJam());
                    session.setAttribute("id_booking", datahistory.get(0).getId_book());
       
                    if (datahistory.get(0).getRole().equals("admin")) {
                        response.sendRedirect("index_admin.jsp");
                    } 
                    if (datahistory.get(0).getRole().equals("user")){
                        response.sendRedirect("user_page.jsp");
                    }
                }
            }
        }
              
    }
 
}