package com.MunicipalCorporation.Servlets;

import com.MunicipalCorporation.DAO.Birth_RegistrationDao;
import com.MunicipalCorporation.Model.Birth_Registration;
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

@WebServlet(name = "Birth_Registration_Servlet", urlPatterns = {"/Birth_Registration_Servlet"})
public class Birth_Registration_Servlet extends HttpServlet {

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
        System.out.println("Municipal_User"+Municipal_User);
        if ("Admin".equals(Municipal_User)) {
            int Admin_MCorp_Id = (int) session.getAttribute("Admin_MCorp_Id");
            String Date = request.getParameter("calender");
            String Address = request.getParameter("address");
            String Mother_Name = request.getParameter("mother_name");
            String Father_Name = request.getParameter("father_name");
            String Residential_Place = request.getParameter("birth_place");
            String Hospital_Name = request.getParameter("hospital_name");
            String Date_Of_Birth = request.getParameter("date_of_birth");
            String Sex = request.getParameter("select_sex");
            String Child_Name = request.getParameter("child_name");
            String Applicant_Name = request.getParameter("applicant_name");
            String Relation_with_Child = request.getParameter("applicant_relation_with_child");
            String Id_proof = request.getParameter("uploadfile1");
            String Parent_Marriage_Certificate = request.getParameter("uploadfile2");
            String Letter_from_Hospital = request.getParameter("uploadfile3");
            String Parent_Birth_Certificate = request.getParameter("uploadfile4");
            String Signature = request.getParameter("uploadfile5");
//        Birth_Registration birth=new Birth_Registration(Date, Address, Mother_Name, Father_Name, Residential_Place, Hospital_Name, Date_Of_Birth, Sex, Child_Name, Applicant_Name, Relation_with_Child, Id_proof, Parent_Marriage_Certificate, Letter_from_Hospital, Parent_Birth_Certificate, Signature);
            Birth_Registration birth = new Birth_Registration(Date, Address, Mother_Name, Father_Name, Residential_Place, Hospital_Name, Date_Of_Birth, Sex, Child_Name, Applicant_Name, Relation_with_Child, Id_proof, Parent_Marriage_Certificate, Letter_from_Hospital, Parent_Birth_Certificate, Signature, Admin_MCorp_Id);

            Birth_RegistrationDao br = new Birth_RegistrationDao();
            br.insert(birth);
            response.sendRedirect("Html/Home.jsp");
        } else {
            int User_Municipal_corp_Id = (int) session.getAttribute("Municipal_corp_Id");
            String Date = request.getParameter("calender");
            String Address = request.getParameter("address");
            String Mother_Name = request.getParameter("mother_name");
            String Father_Name = request.getParameter("father_name");
            String Residential_Place = request.getParameter("birth_place");
            String Hospital_Name = request.getParameter("hospital_name");
            String Date_Of_Birth = request.getParameter("date_of_birth");
            String Sex = request.getParameter("select_sex");
            String Child_Name = request.getParameter("child_name");
            String Applicant_Name = request.getParameter("applicant_name");
            String Relation_with_Child = request.getParameter("applicant_relation_with_child");
            String Id_proof = request.getParameter("uploadfile1");
            String Parent_Marriage_Certificate = request.getParameter("uploadfile2");
            String Letter_from_Hospital = request.getParameter("uploadfile3");
            String Parent_Birth_Certificate = request.getParameter("uploadfile4");
            String Signature = request.getParameter("uploadfile5");
//        Birth_Registration birth=new Birth_Registration(Date, Address, Mother_Name, Father_Name, Residential_Place, Hospital_Name, Date_Of_Birth, Sex, Child_Name, Applicant_Name, Relation_with_Child, Id_proof, Parent_Marriage_Certificate, Letter_from_Hospital, Parent_Birth_Certificate, Signature);
            Birth_Registration birth = new Birth_Registration(Date, Address, Mother_Name, Father_Name, Residential_Place, Hospital_Name, Date_Of_Birth, Sex, Child_Name, Applicant_Name, Relation_with_Child, Id_proof, Parent_Marriage_Certificate, Letter_from_Hospital, Parent_Birth_Certificate, Signature, User_Municipal_corp_Id);

            Birth_RegistrationDao br = new Birth_RegistrationDao();
            br.insert(birth);
            response.sendRedirect("Html/Home.jsp");
        }

//        int Municipal_corp_Id = (int) session.getAttribute("Municipal_corp_Id");
//        String Date=request.getParameter("calender");
//        String Address=request.getParameter("address");
//        String Mother_Name=request.getParameter("mother_name");
//        String Father_Name=request.getParameter("father_name");
//        String Residential_Place=request.getParameter("birth_place");
//        String Hospital_Name=request.getParameter("hospital_name");
//        String Date_Of_Birth=request.getParameter("date_of_birth");
//        String Sex=request.getParameter("select_sex");
//        String Child_Name=request.getParameter("child_name");
//        String Applicant_Name=request.getParameter("applicant_name");
//        String Relation_with_Child=request.getParameter("applicant_relation_with_child");
//        String Id_proof=request.getParameter("uploadfile1");
//        String Parent_Marriage_Certificate=request.getParameter("uploadfile2");
//        String Letter_from_Hospital=request.getParameter("uploadfile3");
//        String Parent_Birth_Certificate=request.getParameter("uploadfile4");
//        String Signature=request.getParameter("uploadfile5");
////        Birth_Registration birth=new Birth_Registration(Date, Address, Mother_Name, Father_Name, Residential_Place, Hospital_Name, Date_Of_Birth, Sex, Child_Name, Applicant_Name, Relation_with_Child, Id_proof, Parent_Marriage_Certificate, Letter_from_Hospital, Parent_Birth_Certificate, Signature);
//        Birth_Registration birth=new Birth_Registration(Date, Address, Mother_Name, Father_Name, Residential_Place, Hospital_Name, Date_Of_Birth, Sex, Child_Name, Applicant_Name, Relation_with_Child, Id_proof, Parent_Marriage_Certificate, Letter_from_Hospital, Parent_Birth_Certificate, Signature, Municipal_corp_Id);
//        
//        Birth_RegistrationDao br=new Birth_RegistrationDao();
//        br.insert(birth);
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
            Logger.getLogger(Birth_Registration_Servlet.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Birth_Registration_Servlet.class.getName()).log(Level.SEVERE, null, ex);
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
