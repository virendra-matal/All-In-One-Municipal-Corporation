
package com.MunicipalCorporation.DAO;

import com.MunicipalCorporation.DatabaseConnetion.DBConnections;
import static com.MunicipalCorporation.DatabaseConnetion.DBConnections.getConnection;
import com.MunicipalCorporation.Model.Marriage_Registration;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Marriage_registrationDao {
    
    Connection con;

    public Marriage_registrationDao() throws SQLException {
        this.con = DBConnections.getConnection();
    }

    public String insert(Marriage_Registration birth) throws SQLException {

        Connection conn = getConnection();
        System.out.println("details:"+birth);
        String result = "data insert succefully";
        String sql = "insert into municipal_corp.marriage_registration(Marriage_Date,Ward,Marriage_Place,Marriage_Address,Marriage_City,Marriage_Country,Husband_Name,Husband_Religion_by_Birth,Husband_Religion_by_Adoption,Husband_Date_of_Birth,Husband_Age,Husband_Status_at_marriage,Husband_Occupation,Husband_Mobile_Number,Husband_Email,Husband_Address,Husband_City,Husband_Country,Wife_Name,Wife_Religion_by_Birth,Wife_Religion_by_Adoption,Wife_Date_of_Birth,Wife_Age,Wife_Status_at_marriage,Wife_Occupation,Wife_Mobile_Number,Wife_Email,Wife_Address,Wife_City,Wife_Country,Witness_Name,Witness_Relation_With_Couple,Witness_Occupation,Witness_Mobile_Number,Witness_Email,Witness_Address,Witness_City,Witness_Country,Priest_Name,Priest_Religion,Priest_Date_of_Birth,Priest_Age,Priest_Occupation,Priest_Mobile_Number,Priest_Email,Priest_Address,Priest_City,Priest_Country,Bride_Birth_Certificate,Bride_Aadhar_Card,Photographs_Bride,Bridegroom_Birth_Certificate,Bridegroom_Aadhar_Card,Photographs_Bridegroom,Witness_Aadhar_Card,Witness_Election_Card,Wedding_card,Signature_Priest,Signature_Applicant,MCId) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps;
            ps = conn.prepareStatement(sql);
            ps.setString(1, birth.getMarriage_Date());
            ps.setString(2, birth.getWard());
            ps.setString(3, birth.getMarriage_Place());
            ps.setString(4, birth.getMarriage_Address());
            ps.setString(5, birth.getMarriage_City());
            ps.setString(6, birth.getMarriage_Country());
            ps.setString(7, birth.getHusband_Name());
            ps.setString(8, birth.getHusband_Religion_by_Birth());
            ps.setString(9, birth.getHusband_Religion_by_Adoption());
            ps.setString(10, birth.getHusband_Date_of_Birth());
            ps.setInt(11, birth.getHusband_Age());
            ps.setString(12, birth.getHusband_Status_at_marriage());
            ps.setString(13, birth.getHusband_Occupation());
            ps.setString(14, birth.getHusband_Mobile_Number());
            ps.setString(15, birth.getHusband_Email());
            ps.setString(16, birth.getHusband_Address());
            ps.setString(17, birth.getHusband_City());
            ps.setString(18, birth.getHusband_Country());
            ps.setString(19, birth.getWife_Name());
            ps.setString(20, birth.getWife_Religion_by_Birth());
            ps.setString(21, birth.getWife_Religion_by_Adoption());
            ps.setString(22, birth.getWife_Date_of_Birth());
            ps.setInt(23, birth.getWife_Age());
            ps.setString(24, birth.getWife_Status_at_marriage());
            ps.setString(25, birth.getWife_Occupation());
            ps.setString(26, birth.getWife_Mobile_Number());
            ps.setString(27, birth.getWife_Email());
            ps.setString(28, birth.getWife_Address());
            ps.setString(29, birth.getWife_City());
            ps.setString(30, birth.getWife_Country());
            ps.setString(31, birth.getWitness_Name());
            ps.setString(32, birth.getWitness_Relation_With_Couple());
            ps.setString(33, birth.getWitness_Occupation());
            ps.setString(34, birth.getWitness_Mobile_Number());
            ps.setString(35, birth.getWitness_Email());
            ps.setString(36, birth.getWitness_Address());
            ps.setString(37, birth.getWitness_City());
            ps.setString(38, birth.getWitness_Country());
            ps.setString(39, birth.getPriest_Name());
            ps.setString(40, birth.getPriest_Religion());
            ps.setString(41, birth.getPriest_Date_of_Birth());
            ps.setInt(42, birth.getPriest_Age());
            ps.setString(43, birth.getPriest_Occupation());
            ps.setString(44, birth.getPriest_Mobile_Number());
            ps.setString(45, birth.getPriest_Email());
            ps.setString(46, birth.getPriest_Address());
            ps.setString(47, birth.getPriest_City());
            ps.setString(48, birth.getPriest_Country());
            ps.setString(49, birth.getBride_Birth_Certificate());
            ps.setString(50, birth.getBride_Aadhar_Card());
            ps.setString(51, birth.getPhotographs_Bride());
            ps.setString(52, birth.getBridegroom_Birth_Certificate());
            ps.setString(53, birth.getBridegroom_Aadhar_Card());
            ps.setString(54, birth.getPhotographs_Bridegroom());
            ps.setString(55, birth.getWitness_Aadhar_Card());
            ps.setString(56, birth.getWitness_Election_Card());
            ps.setString(57, birth.getWedding_card());
            ps.setString(58, birth.getSignature_Priest());
            ps.setString(59, birth.getSignature_Applicant());
            ps.setInt(60, birth.getMCId());
            ps.executeUpdate();
            System.err.println("birth.getMarriage_Date()"+birth.getMarriage_Date());
        } catch (SQLException e) {
            System.out.println(" Connection Errors :" + e.getMessage());
            result = "data not inserted";
        }
        return result;

    }
    
    
    public List<Marriage_Registration> selectMarriageCertificateForView(int MarriageRregistration_Id) throws SQLException {
        List<Marriage_Registration> com = new ArrayList<>();
        Connection conn = DBConnections.getConnection();
        String sql1 = "SELECT * FROM municipal_corp.marriage_registration where MarriageRregistration_Id=?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql1);
            pst.setInt(1, MarriageRregistration_Id);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {


                String Marriage_Date = rs.getString("Marriage_Date");
                String Ward = rs.getString("Ward");
                String Marriage_Place = rs.getString("Marriage_Place"); 
                String Marriage_City = rs.getString("Marriage_City");
                String Marriage_Country = rs.getString("Marriage_Country");
                String Husband_Name = rs.getString("Husband_Name");
                String Husband_Religion_by_Birth = rs.getString("Husband_Religion_by_Birth");
                String Husband_Religion_by_Adoption = rs.getString("Husband_Religion_by_Adoption");
                String Husband_Date_of_Birth = rs.getString("Husband_Date_of_Birth");
                int Husband_Age = rs.getInt("Husband_Age");
                String Husband_Status_at_marriage = rs.getString("Husband_Status_at_marriage");
                String Husband_Occupation = rs.getString("Husband_Occupation");
                String Husband_Mobile_Number = rs.getString("Husband_Mobile_Number");
                String Husband_Email = rs.getString("Husband_Email");
                String Husband_Address = rs.getString("Husband_Address");
                String Husband_City = rs.getString("Husband_City");
                String Husband_Country = rs.getString("Husband_Country");

                String Wife_Name = rs.getString("Wife_Name");
                String Wife_Religion_by_Birth = rs.getString("Wife_Religion_by_Birth");
                String Wife_Religion_by_Adoption = rs.getString("Wife_Religion_by_Adoption");
                String Wife_Date_of_Birth = rs.getString("Wife_Date_of_Birth");
                int Wife_Age = rs.getInt("Wife_Age");
                String Wife_Status_at_marriage = rs.getString("Wife_Status_at_marriage");
                String Wife_Occupation = rs.getString("Wife_Occupation");
                String Wife_Mobile_Number = rs.getString("Wife_Mobile_Number");
                String Wife_Email = rs.getString("Wife_Email");
                String Wife_Address = rs.getString("Wife_Address");
                String Wife_City = rs.getString("Wife_City");
                String Wife_Country = rs.getString("Wife_Country");

                String Witness_Name = rs.getString("Witness_Name");
                String Witness_Relation_With_Couple = rs.getString("Witness_Relation_With_Couple");
                String Witness_Occupation = rs.getString("Witness_Occupation");
                String Witness_Mobile_Number = rs.getString("Witness_Mobile_Number");
                String Witness_Email = rs.getString("Witness_Email");
                String Witness_Address = rs.getString("Witness_Address");
                String Witness_City = rs.getString("Witness_City");
                String Witness_Country = rs.getString("Witness_Country");

                String Priest_Name = rs.getString("Priest_Name");
                String Priest_Religion = rs.getString("Priest_Religion");
                String Priest_Date_of_Birth = rs.getString("Priest_Date_of_Birth");
                int Priest_Age = rs.getInt("Priest_Age");
                String Priest_Occupation = rs.getString("Priest_Occupation");
                String Priest_Mobile_Number = rs.getString("Priest_Mobile_Number");
                String Priest_Email = rs.getString("Priest_Email");
                String Priest_Address = rs.getString("Priest_Address");
                String Priest_City = rs.getString("Priest_City");
                String Priest_Country = rs.getString("Priest_Country");

                String Bride_Birth_Certificate = rs.getString("Bride_Birth_Certificate");
                String Bride_Aadhar_Card = rs.getString("Bride_Aadhar_Card");
                String Photographs_Bride = rs.getString("Photographs_Bride");
                String Bridegroom_Birth_Certificate = rs.getString("Bridegroom_Birth_Certificate");
                String Bridegroom_Aadhar_Card = rs.getString("Bridegroom_Aadhar_Card");
                String Photographs_Bridegroom = rs.getString("Photographs_Bridegroom");
                String Witness_Aadhar_Card = rs.getString("Witness_Aadhar_Card");
                String Witness_Election_Card = rs.getString("Witness_Election_Card");
                String Wedding_card = rs.getString("Wedding_card");
                String Signature_Priest = rs.getString("Signature_Priest");
                String Signature_Applicant = rs.getString("Signature_Applicant");
                int MCId = rs.getInt("MCId");
                MarriageRregistration_Id = rs.getInt("MarriageRregistration_Id");
                com.add(new Marriage_Registration(Marriage_Date, Ward, Marriage_Place, Marriage_Date, Marriage_City, Marriage_Country, Husband_Name, Husband_Religion_by_Birth, Husband_Religion_by_Adoption, Husband_Date_of_Birth, Husband_Status_at_marriage, Husband_Occupation, Husband_Mobile_Number, Husband_Email, Husband_Address, Husband_City, Husband_Country, Wife_Name, Wife_Religion_by_Birth, Wife_Religion_by_Adoption, Wife_Date_of_Birth, Wife_Status_at_marriage, Wife_Occupation, Wife_Mobile_Number, Wife_Email, Wife_Address, Wife_City, Wife_Country, Witness_Name, Witness_Relation_With_Couple, Witness_Occupation, Witness_Mobile_Number, Witness_Email, Witness_Address, Witness_City, Witness_Country, Priest_Name, Priest_Religion, Priest_Date_of_Birth, Priest_Occupation, Priest_Mobile_Number, Priest_Email, Priest_Address, Priest_City, Priest_Country, Bride_Birth_Certificate, Bride_Aadhar_Card, Photographs_Bride, Bridegroom_Birth_Certificate, Bridegroom_Aadhar_Card, Photographs_Bridegroom, Witness_Aadhar_Card, Witness_Election_Card, Wedding_card, Signature_Priest, Signature_Applicant, Husband_Age, Wife_Age, Priest_Age, MarriageRregistration_Id, MCId));
            }
        } catch (SQLException e) {
            System.out.println(" Connection Errors :" + e.getMessage());
        }

        return com;

    }
    
}
