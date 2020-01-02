package Control;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.FutsalModel;

@WebServlet(name = "RegisController", urlPatterns = {"/RegisController"})
public class RegisController extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String proses=request.getParameter("proses");
        String action=request.getParameter("action");
        if (proses.equals("input-user")){
            response.sendRedirect("login.jsp");
            return;
        }else if (proses.equals("edit-user")){
            response.sendRedirect("edit_akun.jsp?id_akun="+request.getParameter("id_akun"));
            return;
        }else if (proses.equals("hapus-user")){
            FutsalModel hm=new FutsalModel();
            hm.setIdAkun(request.getParameter("id_akun"));
            hm.hapus_akun();
            response.sendRedirect("tabel_akun.jsp");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String data = request.getParameter("data");
        String proses = request.getParameter("proses");
        
        if (data != null){
            if(data.equals("user")){
                FutsalModel am=new FutsalModel();
                am.setIdAkun(request.getParameter("id_akun"));
                am.setNama(request.getParameter("nama"));
                am.setNoTelp(request.getParameter("no_telpon"));
                am.setEmail(request.getParameter("email"));
                am.setPassword(request.getParameter("password"));
                am.setRole(request.getParameter("role"));
                if (proses.equals("input-user")){
                    am.simpan_akun();
                    response.sendRedirect("login.jsp");
                    return;
                }else if (proses.equals("update-user")){
                    am.update_akun();
                 }else if(proses.equals("hapus-user")){
                    am.hapus_akun();
                }
                response.sendRedirect("tabel_akun.jsp"); 
            }
        }
    }

}
