
package com.MunicipalCorporation.Servlets;

import com.MunicipalCorporation.DAO.Birth_RegistrationDao;
import com.MunicipalCorporation.DAO.User_ListDao;
import com.MunicipalCorporation.Model.Birth_Registration;
import com.MunicipalCorporation.Model.Death_Certificate;
import com.MunicipalCorporation.Model.Ganpati_Visarjan;
import com.MunicipalCorporation.Model.Marriage_Registration;
import com.MunicipalCorporation.Model.user;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "Admin_Birth_Certificate_Servlet", urlPatterns = {"/Admin_Birth_Certificate_Servlet"})
public class Admin_Birth_Certificate_Servlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.sql.SQLException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        
        HttpSession session = request.getSession();
        int Admin_MCorp_Id = (int) session.getAttribute("Admin_MCorp_Id");
        
        Birth_RegistrationDao birth = new Birth_RegistrationDao();
        List<Birth_Registration> use = birth.selectBirthCertificateForAdmin(Admin_MCorp_Id);
        request.setAttribute("Birth", use);
        
        List<Death_Certificate> death = birth.selectDeathCertificate(Admin_MCorp_Id);
        request.setAttribute("Death", death);
        
        List<Marriage_Registration> marriage = birth.selectMarriageCertificate(Admin_MCorp_Id);
        request.setAttribute("Marriage", marriage);
        
        List<Ganpati_Visarjan> gan = birth.selectGanapatiImmersionCertificate(Admin_MCorp_Id);
        request.setAttribute("Gan", gan);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Admin_Birth_Certificate_Servlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Admin_Birth_Certificate_Servlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
