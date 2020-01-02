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

@WebServlet(name = "LapController", urlPatterns = {"/LapController"})
public class LapController extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String proses=request.getParameter("proses");
        String action=request.getParameter("action");
        if (proses.equals("input-lap")){
            response.sendRedirect("tabel_lap.jsp");
            return;
        }else if (proses.equals("edit-lap")){
            response.sendRedirect("edit_lap.jsp?no_lapangan="+request.getParameter("no_lapangan"));
            return;
        }else if (proses.equals("hapus-lap")){
            FutsalModel hm=new FutsalModel();
            hm.setId_book(request.getParameter("no_lapangan"));
            hm.hapus();
            response.sendRedirect("tabel_lap.jsp");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String data = request.getParameter("data");
        String proses = request.getParameter("proses");
        
        if (data != null){
            if(data.equals("user")){
                FutsalModel um=new FutsalModel();
                um.setNoLap(request.getParameter("no_lapangan"));
                um.setJenisLap(request.getParameter("jenis_lapangan"));
                um.setTarif(request.getParameter("tarif"));
                um.setLuas(request.getParameter("luas"));
                if (proses.equals("input-lap")){
                    um.simpan_lap();
                }else if (proses.equals("update-lap")){
                    um.update_lap();
                 }else if(proses.equals("hapus-lap")){
                    um.hapus_lap();
                }
                response.sendRedirect("tabel_lap.jsp");
            }
        }
    }

}
