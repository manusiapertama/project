/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.FutsalModel;

@WebServlet(name = "UserController", urlPatterns = {"/UserController"})
public class UserController extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String proses=request.getParameter("proses");
        String action=request.getParameter("action");
        if (proses.equals("input-booking")){
            response.sendRedirect("user_page.jsp");
            return;
        }else if (proses.equals("edit-booking")){
            response.sendRedirect("edit_boking.jsp?id_booking="+request.getParameter("id_booking"));
            return;
        }else if (proses.equals("hapus-booking")){
            FutsalModel hm=new FutsalModel();
            hm.setId_book(request.getParameter("id_booking"));
            hm.hapus();
            response.sendRedirect("tabel_booking.jsp");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String data = request.getParameter("data");
        String proses = request.getParameter("proses");
        
        if (data != null){
            if(data.equals("user")){
                FutsalModel um=new FutsalModel();
                um.setId_book(request.getParameter("id_booking"));
                um.setId_book(request.getParameter("id_akun"));
                um.setNamaTim(request.getParameter("nama_tim"));
                um.setNoLap(request.getParameter("no_lapangan"));
                um.setHari(request.getParameter("hari"));
                um.setJam(request.getParameter("jam"));
                if (proses.equals("input-booking")){
                    um.simpan();
                }else if (proses.equals("update-booking")){
                    um.update();
                 }else if(proses.equals("hapus-booking")){
                    um.hapus();
                }
                response.sendRedirect("user_page.jsp");
            }
        }
    }

}
