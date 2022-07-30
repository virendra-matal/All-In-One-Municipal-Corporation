package com.MunicipalCorporation.Servlets;

import com.MunicipalCorporation.DAO.Marriage_registrationDao;
import com.MunicipalCorporation.Model.Marriage_Registration;
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

@WebServlet(name = "Marriage_Registration_Servlet", urlPatterns = {"/Marriage_Registration_Servlet"})
public class Marriage_Registration_Servlet extends HttpServlet {

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
            String Marriage_Date = request.getParameter("marriage_date");
            String Ward = request.getParameter("ward");
            String Marriage_Place = request.getParameter("marriage_place");
            String Marriage_Address = request.getParameter("marriage_address");
            String Marriage_City = request.getParameter("marriage_city");
            String Marriage_Country = request.getParameter("marriage_country");
            String Husband_Name = request.getParameter("husband_name");
            String Husband_Religion_by_Birth = request.getParameter("religion_birth");
            String Husband_Religion_by_Adoption = request.getParameter("religion_adopt");
            String Husband_Date_of_Birth = request.getParameter("hus_DOB");
            int Husband_Age = Integer.parseInt(request.getParameter("show_age"));
            String Husband_Status_at_marriage = request.getParameter("hus_status");
            String Husband_Occupation = request.getParameter("hus_occupation");
            String Husband_Mobile_Number = request.getParameter("mobile");
            String Husband_Email = request.getParameter("email");
            String Husband_Address = request.getParameter("hus_address");
            String Husband_City = request.getParameter("hus_city");
            String Husband_Country = request.getParameter("hus_country");

            String Wife_Name = request.getParameter("wige_name");
            String Wife_Religion_by_Birth = request.getParameter("wife_reli_birth");
            String Wife_Religion_by_Adoption = request.getParameter("wife_reli_adopt");
            String Wife_Date_of_Birth = request.getParameter("DOB_wife");
            int Wife_Age = Integer.parseInt(request.getParameter("show_age_wife"));
            String Wife_Status_at_marriage = request.getParameter("wife_status_marr");
            String Wife_Occupation = request.getParameter("wife_occupation");
            String Wife_Mobile_Number = request.getParameter("wife_mobile");
            String Wife_Email = request.getParameter("wife_email");
            String Wife_Address = request.getParameter("wife_address");
            String Wife_City = request.getParameter("wife_city");
            String Wife_Country = request.getParameter("wife_country");

            String Witness_Name = request.getParameter("witness_name");
            String Witness_Relation_With_Couple = request.getParameter("relation_with_couple");
            String Witness_Occupation = request.getParameter("witness_occupation");
            String Witness_Mobile_Number = request.getParameter("witness_number");
            String Witness_Email = request.getParameter("witness_email");
            String Witness_Address = request.getParameter("witness_address");
            String Witness_City = request.getParameter("witness_city");
            String Witness_Country = request.getParameter("witness_country");

            String Priest_Name = request.getParameter("priest_name");
            String Priest_Religion = request.getParameter("priest_religion");
            String Priest_Date_of_Birth = request.getParameter("DOB_Priest");
            int Priest_Age = Integer.parseInt(request.getParameter("show_age_priest"));
            String Priest_Occupation = request.getParameter("priest_occupation");
            String Priest_Mobile_Number = request.getParameter("priest_number");
            String Priest_Email = request.getParameter("priest_email");
            String Priest_Address = request.getParameter("priest_address");
            String Priest_City = request.getParameter("priest_city");
            String Priest_Country = request.getParameter("priest_country");

            String Bride_Birth_Certificate = request.getParameter("uploadfile1");
            String Bride_Aadhar_Card = request.getParameter("uploadfile2");
            String Photographs_Bride = request.getParameter("uploadfile13");
            String Bridegroom_Birth_Certificate = request.getParameter("uploadfile5");
            String Bridegroom_Aadhar_Card = request.getParameter("uploadfile6");
            String Photographs_Bridegroom = request.getParameter("uploadfile12");
            String Witness_Aadhar_Card = request.getParameter("uploadfile7");
            String Witness_Election_Card = request.getParameter("uploadfile8");
            String Wedding_card = request.getParameter("uploadfile9");
            String Signature_Priest = request.getParameter("uploadfile10");
            String Signature_Applicant = request.getParameter("uploadfile11");

            System.err.println("birth.getMarriage_Date()" + Marriage_Date);
//        Marriage_Registration birth=new Marriage_Registration(Marriage_Date, Ward, Marriage_Place, Marriage_Address, Marriage_City, Marriage_Country, Husband_Name, Husband_Religion_by_Birth, Husband_Religion_by_Adoption, Husband_Date_of_Birth, Husband_Status_at_marriage, Husband_Occupation, Husband_Mobile_Number, Husband_Email, Husband_Address, Husband_City, Husband_Country, Wife_Name, Wife_Religion_by_Birth, Wife_Religion_by_Adoption, Wife_Date_of_Birth, Wife_Status_at_marriage, Wife_Occupation, Wife_Mobile_Number, Wife_Email, Wife_Address, Wife_City, Wife_Country, Witness_Name, Witness_Relation_With_Couple, Witness_Occupation, Witness_Mobile_Number, Witness_Email, Witness_Address, Witness_City, Witness_Country, Priest_Name, Priest_Religion, Priest_Date_of_Birth, Priest_Occupation, Priest_Mobile_Number, Priest_Email, Priest_Address, Priest_City, Priest_Country, Bride_Birth_Certificate, Bride_Aadhar_Card, Photographs_Bride, Bridegroom_Birth_Certificate, Bridegroom_Aadhar_Card, Photographs_Bridegroom, Witness_Aadhar_Card, Witness_Election_Card, Wedding_card, Signature_Priest, Signature_Applicant, Husband_Age, Wife_Age, Priest_Age);
            Marriage_Registration birth = new Marriage_Registration(Marriage_Date, Ward, Marriage_Place, Marriage_Address, Marriage_City, Marriage_Country, Husband_Name, Husband_Religion_by_Birth, Husband_Religion_by_Adoption, Husband_Date_of_Birth, Husband_Status_at_marriage, Husband_Occupation, Husband_Mobile_Number, Husband_Email, Husband_Address, Husband_City, Husband_Country, Wife_Name, Wife_Religion_by_Birth, Wife_Religion_by_Adoption, Wife_Date_of_Birth, Wife_Status_at_marriage, Wife_Occupation, Wife_Mobile_Number, Wife_Email, Wife_Address, Wife_City, Wife_Country, Witness_Name, Witness_Relation_With_Couple, Witness_Occupation, Witness_Mobile_Number, Witness_Email, Witness_Address, Witness_City, Witness_Country, Priest_Name, Priest_Religion, Priest_Date_of_Birth, Priest_Occupation, Priest_Mobile_Number, Priest_Email, Priest_Address, Priest_City, Priest_Country, Bride_Birth_Certificate, Bride_Aadhar_Card, Photographs_Bride, Bridegroom_Birth_Certificate, Bridegroom_Aadhar_Card, Photographs_Bridegroom, Witness_Aadhar_Card, Witness_Election_Card, Wedding_card, Signature_Priest, Signature_Applicant, Husband_Age, Wife_Age, Priest_Age, Admin_MCorp_Id);

            Marriage_registrationDao mr = new Marriage_registrationDao();
            mr.insert(birth);
            response.sendRedirect("Html/Home.jsp");
            
            
        } else {
            
            
            int User_Municipal_corp_Id = (int) session.getAttribute("Municipal_corp_Id");
            String Marriage_Date = request.getParameter("marriage_date");
            String Ward = request.getParameter("ward");
            String Marriage_Place = request.getParameter("marriage_place");
            String Marriage_Address = request.getParameter("marriage_address");
            String Marriage_City = request.getParameter("marriage_city");
            String Marriage_Country = request.getParameter("marriage_country");
            String Husband_Name = request.getParameter("husband_name");
            String Husband_Religion_by_Birth = request.getParameter("religion_birth");
            String Husband_Religion_by_Adoption = request.getParameter("religion_adopt");
            String Husband_Date_of_Birth = request.getParameter("hus_DOB");
            int Husband_Age = Integer.parseInt(request.getParameter("show_age"));
            String Husband_Status_at_marriage = request.getParameter("hus_status");
            String Husband_Occupation = request.getParameter("hus_occupation");
            String Husband_Mobile_Number = request.getParameter("mobile");
            String Husband_Email = request.getParameter("email");
            String Husband_Address = request.getParameter("hus_address");
            String Husband_City = request.getParameter("hus_city");
            String Husband_Country = request.getParameter("hus_country");

            String Wife_Name = request.getParameter("wige_name");
            String Wife_Religion_by_Birth = request.getParameter("wife_reli_birth");
            String Wife_Religion_by_Adoption = request.getParameter("wife_reli_adopt");
            String Wife_Date_of_Birth = request.getParameter("DOB_wife");
            int Wife_Age = Integer.parseInt(request.getParameter("show_age_wife"));
            String Wife_Status_at_marriage = request.getParameter("wife_status_marr");
            String Wife_Occupation = request.getParameter("wife_occupation");
            String Wife_Mobile_Number = request.getParameter("wife_mobile");
            String Wife_Email = request.getParameter("wife_email");
            String Wife_Address = request.getParameter("wife_address");
            String Wife_City = request.getParameter("wife_city");
            String Wife_Country = request.getParameter("wife_country");

            String Witness_Name = request.getParameter("witness_name");
            String Witness_Relation_With_Couple = request.getParameter("relation_with_couple");
            String Witness_Occupation = request.getParameter("witness_occupation");
            String Witness_Mobile_Number = request.getParameter("witness_number");
            String Witness_Email = request.getParameter("witness_email");
            String Witness_Address = request.getParameter("witness_address");
            String Witness_City = request.getParameter("witness_city");
            String Witness_Country = request.getParameter("witness_country");

            String Priest_Name = request.getParameter("priest_name");
            String Priest_Religion = request.getParameter("priest_religion");
            String Priest_Date_of_Birth = request.getParameter("DOB_Priest");
            int Priest_Age = Integer.parseInt(request.getParameter("show_age_priest"));
            String Priest_Occupation = request.getParameter("priest_occupation");
            String Priest_Mobile_Number = request.getParameter("priest_number");
            String Priest_Email = request.getParameter("priest_email");
            String Priest_Address = request.getParameter("priest_address");
            String Priest_City = request.getParameter("priest_city");
            String Priest_Country = request.getParameter("priest_country");

            String Bride_Birth_Certificate = request.getParameter("uploadfile1");
            String Bride_Aadhar_Card = request.getParameter("uploadfile2");
            String Photographs_Bride = request.getParameter("uploadfile13");
            String Bridegroom_Birth_Certificate = request.getParameter("uploadfile5");
            String Bridegroom_Aadhar_Card = request.getParameter("uploadfile6");
            String Photographs_Bridegroom = request.getParameter("uploadfile12");
            String Witness_Aadhar_Card = request.getParameter("uploadfile7");
            String Witness_Election_Card = request.getParameter("uploadfile8");
            String Wedding_card = request.getParameter("uploadfile9");
            String Signature_Priest = request.getParameter("uploadfile10");
            String Signature_Applicant = request.getParameter("uploadfile11");

            System.err.println("birth.getMarriage_Date()" + Marriage_Date);
//        Marriage_Registration birth=new Marriage_Registration(Marriage_Date, Ward, Marriage_Place, Marriage_Address, Marriage_City, Marriage_Country, Husband_Name, Husband_Religion_by_Birth, Husband_Religion_by_Adoption, Husband_Date_of_Birth, Husband_Status_at_marriage, Husband_Occupation, Husband_Mobile_Number, Husband_Email, Husband_Address, Husband_City, Husband_Country, Wife_Name, Wife_Religion_by_Birth, Wife_Religion_by_Adoption, Wife_Date_of_Birth, Wife_Status_at_marriage, Wife_Occupation, Wife_Mobile_Number, Wife_Email, Wife_Address, Wife_City, Wife_Country, Witness_Name, Witness_Relation_With_Couple, Witness_Occupation, Witness_Mobile_Number, Witness_Email, Witness_Address, Witness_City, Witness_Country, Priest_Name, Priest_Religion, Priest_Date_of_Birth, Priest_Occupation, Priest_Mobile_Number, Priest_Email, Priest_Address, Priest_City, Priest_Country, Bride_Birth_Certificate, Bride_Aadhar_Card, Photographs_Bride, Bridegroom_Birth_Certificate, Bridegroom_Aadhar_Card, Photographs_Bridegroom, Witness_Aadhar_Card, Witness_Election_Card, Wedding_card, Signature_Priest, Signature_Applicant, Husband_Age, Wife_Age, Priest_Age);
            Marriage_Registration birth = new Marriage_Registration(Marriage_Date, Ward, Marriage_Place, Marriage_Address, Marriage_City, Marriage_Country, Husband_Name, Husband_Religion_by_Birth, Husband_Religion_by_Adoption, Husband_Date_of_Birth, Husband_Status_at_marriage, Husband_Occupation, Husband_Mobile_Number, Husband_Email, Husband_Address, Husband_City, Husband_Country, Wife_Name, Wife_Religion_by_Birth, Wife_Religion_by_Adoption, Wife_Date_of_Birth, Wife_Status_at_marriage, Wife_Occupation, Wife_Mobile_Number, Wife_Email, Wife_Address, Wife_City, Wife_Country, Witness_Name, Witness_Relation_With_Couple, Witness_Occupation, Witness_Mobile_Number, Witness_Email, Witness_Address, Witness_City, Witness_Country, Priest_Name, Priest_Religion, Priest_Date_of_Birth, Priest_Occupation, Priest_Mobile_Number, Priest_Email, Priest_Address, Priest_City, Priest_Country, Bride_Birth_Certificate, Bride_Aadhar_Card, Photographs_Bride, Bridegroom_Birth_Certificate, Bridegroom_Aadhar_Card, Photographs_Bridegroom, Witness_Aadhar_Card, Witness_Election_Card, Wedding_card, Signature_Priest, Signature_Applicant, Husband_Age, Wife_Age, Priest_Age, User_Municipal_corp_Id);

            Marriage_registrationDao mr = new Marriage_registrationDao();
            mr.insert(birth);
            response.sendRedirect("Html/Home.jsp");
        }

//        HttpSession session = request.getSession();
//        int Municipal_corp_Id = (int) session.getAttribute("Municipal_corp_Id");
//        String Marriage_Date = request.getParameter("marriage_date");
//        String Ward = request.getParameter("ward");
//        String Marriage_Place = request.getParameter("marriage_place");
//        String Marriage_Address = request.getParameter("marriage_address");
//        String Marriage_City = request.getParameter("marriage_city");
//        String Marriage_Country = request.getParameter("marriage_country");
//        String Husband_Name = request.getParameter("husband_name");
//        String Husband_Religion_by_Birth = request.getParameter("religion_birth");
//        String Husband_Religion_by_Adoption = request.getParameter("religion_adopt");
//        String Husband_Date_of_Birth = request.getParameter("hus_DOB");
//        int Husband_Age = Integer.parseInt(request.getParameter("show_age"));
//        String Husband_Status_at_marriage = request.getParameter("hus_status");
//        String Husband_Occupation = request.getParameter("hus_occupation");
//        String Husband_Mobile_Number = request.getParameter("mobile");
//        String Husband_Email = request.getParameter("email");
//        String Husband_Address = request.getParameter("hus_address");
//        String Husband_City = request.getParameter("hus_city");
//        String Husband_Country = request.getParameter("hus_country");
//        
//        String Wife_Name = request.getParameter("wige_name");
//        String Wife_Religion_by_Birth = request.getParameter("wife_reli_birth");
//        String Wife_Religion_by_Adoption = request.getParameter("wife_reli_adopt");
//        String Wife_Date_of_Birth = request.getParameter("DOB_wife");
//        int Wife_Age = Integer.parseInt(request.getParameter("show_age_wife"));
//        String Wife_Status_at_marriage = request.getParameter("wife_status_marr");
//        String Wife_Occupation = request.getParameter("wife_occupation");
//        String Wife_Mobile_Number = request.getParameter("wife_mobile");
//        String Wife_Email = request.getParameter("wife_email");
//        String Wife_Address = request.getParameter("wife_address");
//        String Wife_City = request.getParameter("wife_city");
//        String Wife_Country = request.getParameter("wife_country");
//        
//        String Witness_Name = request.getParameter("witness_name");
//        String Witness_Relation_With_Couple = request.getParameter("relation_with_couple");
//        String Witness_Occupation = request.getParameter("witness_occupation");
//        String Witness_Mobile_Number = request.getParameter("witness_number");
//        String Witness_Email = request.getParameter("witness_email");
//        String Witness_Address = request.getParameter("witness_address");
//        String Witness_City = request.getParameter("witness_city");
//        String Witness_Country = request.getParameter("witness_country");
//        
//        String Priest_Name = request.getParameter("priest_name");
//        String Priest_Religion = request.getParameter("priest_religion");
//        String Priest_Date_of_Birth = request.getParameter("DOB_Priest");
//        int Priest_Age = Integer.parseInt(request.getParameter("show_age_priest"));
//        String Priest_Occupation = request.getParameter("priest_occupation");
//        String Priest_Mobile_Number = request.getParameter("priest_number");
//        String Priest_Email = request.getParameter("priest_email");
//        String Priest_Address = request.getParameter("priest_address");
//        String Priest_City = request.getParameter("priest_city");
//        String Priest_Country = request.getParameter("priest_country");
//        
//        String Bride_Birth_Certificate = request.getParameter("uploadfile1");
//        String Bride_Aadhar_Card = request.getParameter("uploadfile2");
//        String Photographs_Bride = request.getParameter("uploadfile13");
//        String Bridegroom_Birth_Certificate = request.getParameter("uploadfile5");
//        String Bridegroom_Aadhar_Card = request.getParameter("uploadfile6");
//        String Photographs_Bridegroom = request.getParameter("uploadfile12");
//        String Witness_Aadhar_Card = request.getParameter("uploadfile7");
//        String Witness_Election_Card = request.getParameter("uploadfile8");
//        String Wedding_card = request.getParameter("uploadfile9");
//        String Signature_Priest = request.getParameter("uploadfile10");
//        String Signature_Applicant = request.getParameter("uploadfile11");
//        
//        System.err.println("birth.getMarriage_Date()"+Marriage_Date);
////        Marriage_Registration birth=new Marriage_Registration(Marriage_Date, Ward, Marriage_Place, Marriage_Address, Marriage_City, Marriage_Country, Husband_Name, Husband_Religion_by_Birth, Husband_Religion_by_Adoption, Husband_Date_of_Birth, Husband_Status_at_marriage, Husband_Occupation, Husband_Mobile_Number, Husband_Email, Husband_Address, Husband_City, Husband_Country, Wife_Name, Wife_Religion_by_Birth, Wife_Religion_by_Adoption, Wife_Date_of_Birth, Wife_Status_at_marriage, Wife_Occupation, Wife_Mobile_Number, Wife_Email, Wife_Address, Wife_City, Wife_Country, Witness_Name, Witness_Relation_With_Couple, Witness_Occupation, Witness_Mobile_Number, Witness_Email, Witness_Address, Witness_City, Witness_Country, Priest_Name, Priest_Religion, Priest_Date_of_Birth, Priest_Occupation, Priest_Mobile_Number, Priest_Email, Priest_Address, Priest_City, Priest_Country, Bride_Birth_Certificate, Bride_Aadhar_Card, Photographs_Bride, Bridegroom_Birth_Certificate, Bridegroom_Aadhar_Card, Photographs_Bridegroom, Witness_Aadhar_Card, Witness_Election_Card, Wedding_card, Signature_Priest, Signature_Applicant, Husband_Age, Wife_Age, Priest_Age);
//        Marriage_Registration birth=new Marriage_Registration(Marriage_Date, Ward, Marriage_Place, Marriage_Address, Marriage_City, Marriage_Country, Husband_Name, Husband_Religion_by_Birth, Husband_Religion_by_Adoption, Husband_Date_of_Birth, Husband_Status_at_marriage, Husband_Occupation, Husband_Mobile_Number, Husband_Email, Husband_Address, Husband_City, Husband_Country, Wife_Name, Wife_Religion_by_Birth, Wife_Religion_by_Adoption, Wife_Date_of_Birth, Wife_Status_at_marriage, Wife_Occupation, Wife_Mobile_Number, Wife_Email, Wife_Address, Wife_City, Wife_Country, Witness_Name, Witness_Relation_With_Couple, Witness_Occupation, Witness_Mobile_Number, Witness_Email, Witness_Address, Witness_City, Witness_Country, Priest_Name, Priest_Religion, Priest_Date_of_Birth, Priest_Occupation, Priest_Mobile_Number, Priest_Email, Priest_Address, Priest_City, Priest_Country, Bride_Birth_Certificate, Bride_Aadhar_Card, Photographs_Bride, Bridegroom_Birth_Certificate, Bridegroom_Aadhar_Card, Photographs_Bridegroom, Witness_Aadhar_Card, Witness_Election_Card, Wedding_card, Signature_Priest, Signature_Applicant, Husband_Age, Wife_Age, Priest_Age, Municipal_corp_Id);
//        
//        
//        Marriage_registrationDao mr=new Marriage_registrationDao();
//        mr.insert(birth);
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
            Logger.getLogger(Marriage_Registration_Servlet.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Marriage_Registration_Servlet.class.getName()).log(Level.SEVERE, null, ex);
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
