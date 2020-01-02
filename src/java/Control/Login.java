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
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {
 
 
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
         
        if (proses.equals("login")) {
            String nama = request.getParameter("nama");
            String no_telpon = request.getParameter("no_telpon");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String role=request.getParameter("role");
            String id_akun=request.getParameter("id_akun");
            
            if (password == null || password.equals("")) {   //validasi apabila field belum diisi
                response.sendRedirect("index.jsp");
            } else {
                FutsalModel pm = new FutsalModel();
                List<FutsalModel> datalogin = new ArrayList<FutsalModel>();
 
                datalogin = pm.LoginUser(email, password);
                if (datalogin.isEmpty()) { //validasi apabila username dan password salah
                        response.sendRedirect("index.jsp");
                } else {
                    HttpSession session = request.getSession(true);
                    session.setAttribute("nama", datalogin.get(0).getNama());
                    session.setAttribute("no_telpon", datalogin.get(0).getNoTelp());
                    session.setAttribute("email", datalogin.get(0).getEmail());
                    session.setAttribute("id_akun", datalogin.get(0).getIdAkun());
                    session.setAttribute("role", datalogin.get(0).getRole());
       
                    if (datalogin.get(0).getRole().equals("admin")) {
                        response.sendRedirect("index_admin.jsp");
                    } 
                    if (datalogin.get(0).getRole().equals("user")){
                        response.sendRedirect("user_page.jsp");
                    }
                }
            }
        }
              
    }
 
}