package com.MunicipalCorporation.Servlets;

import com.MunicipalCorporation.DAO.Death_CertificateDao;
import com.MunicipalCorporation.Model.Death_Certificate;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "Death_Registration_Servlet", urlPatterns = {"/Death_Registration_Servlet"})
public class Death_Registration_Servlet extends HttpServlet {

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
        String Municipal_User = (String) session.getAttribute("UserType");
        System.out.println("Municipal_User" + Municipal_User);
        if ("Admin".equals(Municipal_User)) {
            int Admin_MCorp_Id = (int) session.getAttribute("Admin_MCorp_Id");
            String Date = request.getParameter("calender");
            String Address = request.getParameter("address");
            String Name_Of_Deceased = request.getParameter("deceased_name");
            String Residential_Place = request.getParameter("death_place");
            String Hospital_Name = request.getParameter("hospital_name");
            String Date_Of_Death = request.getParameter("date_of_death");
            String Sex = request.getParameter("select_sex");
            String Applicant_Name = request.getParameter("applicant_name");
            String Relation_with_Person = request.getParameter("applicant_relation_with_person");
            String Id_proof = request.getParameter("uploadfile1");
            String Birth_Certificate_Of_Deceased = request.getParameter("uploadfile2");
            String Medical_certificate = request.getParameter("uploadfile3");
            String Adhar_Card_Of_Deceased = request.getParameter("uploadfile4");
            String Copy_of_Ration_Card = request.getParameter("uploadfile5");
            String Residensial_proof = request.getParameter("uploadfile6");
            String Signature = request.getParameter("uploadfile7");
//        Death_Certificate death=new Death_Certificate(Date, Address, Name_Of_Deceased, Residential_Place, Hospital_Name, Date_Of_Death, Sex, Applicant_Name, Relation_with_Person, Id_proof, Birth_Certificate_Of_Deceased, Medical_certificate, Adhar_Card_Of_Deceased, Copy_of_Ration_Card, Residensial_proof, Signature);
            Death_Certificate death = new Death_Certificate(Date, Address, Name_Of_Deceased, Residential_Place, Hospital_Name, Date_Of_Death, Sex, Applicant_Name, Relation_with_Person, Id_proof, Birth_Certificate_Of_Deceased, Medical_certificate, Adhar_Card_Of_Deceased, Copy_of_Ration_Card, Residensial_proof, Signature, Admin_MCorp_Id);

            Death_CertificateDao dc = new Death_CertificateDao();
            dc.insert(death);
            response.sendRedirect("Html/Home.jsp");
        } else {
            int User_Municipal_corp_Id = (int) session.getAttribute("Municipal_corp_Id");
            String Date = request.getParameter("calender");
            String Address = request.getParameter("address");
            String Name_Of_Deceased = request.getParameter("deceased_name");
            String Residential_Place = request.getParameter("death_place");
            String Hospital_Name = request.getParameter("hospital_name");
            String Date_Of_Death = request.getParameter("date_of_death");
            String Sex = request.getParameter("select_sex");
            String Applicant_Name = request.getParameter("applicant_name");
            String Relation_with_Person = request.getParameter("applicant_relation_with_person");
            String Id_proof = request.getParameter("uploadfile1");
            String Birth_Certificate_Of_Deceased = request.getParameter("uploadfile2");
            String Medical_certificate = request.getParameter("uploadfile3");
            String Adhar_Card_Of_Deceased = request.getParameter("uploadfile4");
            String Copy_of_Ration_Card = request.getParameter("uploadfile5");
            String Residensial_proof = request.getParameter("uploadfile6");
            String Signature = request.getParameter("uploadfile7");
//        Death_Certificate death=new Death_Certificate(Date, Address, Name_Of_Deceased, Residential_Place, Hospital_Name, Date_Of_Death, Sex, Applicant_Name, Relation_with_Person, Id_proof, Birth_Certificate_Of_Deceased, Medical_certificate, Adhar_Card_Of_Deceased, Copy_of_Ration_Card, Residensial_proof, Signature);
            Death_Certificate death = new Death_Certificate(Date, Address, Name_Of_Deceased, Residential_Place, Hospital_Name, Date_Of_Death, Sex, Applicant_Name, Relation_with_Person, Id_proof, Birth_Certificate_Of_Deceased, Medical_certificate, Adhar_Card_Of_Deceased, Copy_of_Ration_Card, Residensial_proof, Signature, User_Municipal_corp_Id);

            Death_CertificateDao dc = new Death_CertificateDao();
            dc.insert(death);
            response.sendRedirect("Html/Home.jsp");
        }

//        HttpSession session = request.getSession();
//        int Municipal_corp_Id = (int) session.getAttribute("Municipal_corp_Id");
//        String Date=request.getParameter("calender");
//        String Address=request.getParameter("address");
//        String Name_Of_Deceased=request.getParameter("deceased_name");
//        String Residential_Place=request.getParameter("death_place");
//        String Hospital_Name=request.getParameter("hospital_name");
//        String Date_Of_Death=request.getParameter("date_of_death");
//        String Sex=request.getParameter("select_sex");
//        String Applicant_Name=request.getParameter("applicant_name");
//        String Relation_with_Person=request.getParameter("applicant_relation_with_person");
//        String Id_proof=request.getParameter("uploadfile1");
//        String Birth_Certificate_Of_Deceased=request.getParameter("uploadfile2");
//        String Medical_certificate=request.getParameter("uploadfile3");
//        String Adhar_Card_Of_Deceased=request.getParameter("uploadfile4");
//        String Copy_of_Ration_Card=request.getParameter("uploadfile5");
//        String Residensial_proof=request.getParameter("uploadfile6");
//        String Signature=request.getParameter("uploadfile7");
////        Death_Certificate death=new Death_Certificate(Date, Address, Name_Of_Deceased, Residential_Place, Hospital_Name, Date_Of_Death, Sex, Applicant_Name, Relation_with_Person, Id_proof, Birth_Certificate_Of_Deceased, Medical_certificate, Adhar_Card_Of_Deceased, Copy_of_Ration_Card, Residensial_proof, Signature);
//        Death_Certificate death=new Death_Certificate(Date, Address, Name_Of_Deceased, Residential_Place, Hospital_Name, Date_Of_Death, Sex, Applicant_Name, Relation_with_Person, Id_proof, Birth_Certificate_Of_Deceased, Medical_certificate, Adhar_Card_Of_Deceased, Copy_of_Ration_Card, Residensial_proof, Signature, Municipal_corp_Id);
//        
//        Death_CertificateDao dc=new Death_CertificateDao();
//        dc.insert(death);
//        response.sendRedirect("Html/Home.jsp");
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
            Logger.getLogger(Death_Registration_Servlet.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Death_Registration_Servlet.class.getName()).log(Level.SEVERE, null, ex);
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
