package com.MunicipalCorporation.DAO;

import com.MunicipalCorporation.DatabaseConnetion.DBConnections;
import static com.MunicipalCorporation.DatabaseConnetion.DBConnections.getConnection;
import com.MunicipalCorporation.Model.Birth_Registration;
import com.MunicipalCorporation.Model.Death_Certificate;
import com.MunicipalCorporation.Model.Ganpati_Visarjan;
import com.MunicipalCorporation.Model.Marriage_Registration;
import com.MunicipalCorporation.Model.complaints;
import com.MunicipalCorporation.Model.user;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Birth_RegistrationDao {

    Connection con;

    public Birth_RegistrationDao() throws SQLException {
        this.con = DBConnections.getConnection();
    }

    public String insert(Birth_Registration birth) throws SQLException {

        Connection conn = getConnection();
        String result = "data insert succefully";
        String sql = "insert into municipal_corp.birth_registration(Date,Address,Mother_Name,Father_Name,Residential_Place,Hospital_Name,Date_Of_Birth,Sex,Child_Name,Applicant_Name,Relation_with_Child,Id_proof,Parent_Marriage_Certificate,Letter_from_Hospital,Parent_Birth_Certificate,Signature,MCId) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps;
            ps = conn.prepareStatement(sql);
            ps.setString(1, birth.getDate());
            ps.setString(2, birth.getAddress());
            ps.setString(3, birth.getMother_Name());
            ps.setString(4, birth.getFather_Name());
            ps.setString(5, birth.getResidential_Place());
            ps.setString(6, birth.getHospital_Name());
            ps.setString(7, birth.getDate_Of_Birth());
            ps.setString(8, birth.getSex());
            ps.setString(9, birth.getChild_Name());
            ps.setString(10, birth.getApplicant_Name());
            ps.setString(11, birth.getRelation_with_Child());
            ps.setString(12, birth.getId_proof());
            ps.setString(13, birth.getParent_Marriage_Certificate());
            ps.setString(14, birth.getLetter_from_Hospital());
            ps.setString(15, birth.getParent_Birth_Certificate());
            ps.setString(16, birth.getSignature());
            ps.setInt(17, birth.getMCId());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(" Connection Errors :" + e.getMessage());
            result = "data not inserted";
        }
        return result;

    }

    public List<Birth_Registration> selectBirthCertificateForAdmin(int MCorpId) throws SQLException {
        List<Birth_Registration> com = new ArrayList<>();
        Connection conn = DBConnections.getConnection();
        String sql1 = "SELECT * FROM municipal_corp.birth_registration where MCId=?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql1);
            pst.setInt(1, MCorpId);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
//                System.out.println("Applicant name deatails at user birthDao:    " + rs.getString("Applicant_Name"));
                String Date = rs.getString("Date");
                String Address = rs.getString("Address");
                String Mother_Name = rs.getString("Mother_Name");
                String Father_Name = rs.getString("Father_Name");
                String Residential_Place = rs.getString("Residential_Place");
                String Hospital_Name = rs.getString("Hospital_Name");
                String Date_Of_Birth = rs.getString("Date_Of_Birth");
                String Sex = rs.getString("Sex");
                String Child_Name = rs.getString("Child_Name");
                String Applicant_Name = rs.getString("Applicant_Name");
                String Relation_with_Child = rs.getString("Relation_with_Child");
                String Id_proof = rs.getString("Id_proof");
                String Parent_Marriage_Certificate = rs.getString("Parent_Marriage_Certificate");
                String Letter_from_Hospital = rs.getString("Letter_from_Hospital");
                String Parent_Birth_Certificate = rs.getString("Parent_Birth_Certificate");
                String Signature = rs.getString("Signature");
                String Status = rs.getString("Status");
                int MCId = rs.getInt("MCId");
                int Birth_Registration_Id = rs.getInt("Birth_Registration_Id");
                com.add(new Birth_Registration(Date, Address, Mother_Name, Father_Name, Residential_Place, Hospital_Name, Date_Of_Birth, Sex, Child_Name, Applicant_Name, Relation_with_Child, Id_proof, Parent_Marriage_Certificate, Letter_from_Hospital, Parent_Birth_Certificate, Signature,Status, MCId, Birth_Registration_Id));
            }
        } catch (SQLException e) {
            System.out.println(" Connection Errors :" + e.getMessage());
        }

        return com;

    }

    public List<Death_Certificate> selectDeathCertificate(int MCorpId) throws SQLException {
        List<Death_Certificate> com = new ArrayList<>();
        Connection conn = DBConnections.getConnection();
        String sql1 = "SELECT * FROM municipal_corp.death_registration where MCId=?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql1);
            pst.setInt(1, MCorpId);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
//                System.out.println("Applicant name deatails at user birthDao:    " + rs.getString("Applicant_Name"));
                String Date = rs.getString("Date");
                String Address = rs.getString("Address");
                String Name_Of_Deceased = rs.getString("Name_Of_Deceased");
                String Residential_Place = rs.getString("Residential_Place");
                String Hospital_Name = rs.getString("Hospital_Name");
                String Date_Of_Death = rs.getString("Date_Of_Death");
                String Sex = rs.getString("Sex");
                String Applicant_Name = rs.getString("Applicant_Name");
                String Relation_with_Person = rs.getString("Relation_with_Person");
                String Id_proof = rs.getString("Id_proof");
                String Birth_Certificate_Of_Deceased = rs.getString("Birth_Certificate_Of_Deceased");
                String Medical_certificate = rs.getString("Medical_certificate");
                String Adhar_Card_Of_Deceased = rs.getString("Adhar_Card_Of_Deceased");
                String Copy_of_Ration_Card = rs.getString("Copy_of_Ration_Card");
                String Residensial_proof = rs.getString("Residensial_proof");
                String Signature = rs.getString("Signature");
                String Status = rs.getString("Status");
                int MCId = rs.getInt("MCId");
                int Death_Registration_Id = rs.getInt("Death_Registration_Id");
                com.add(new Death_Certificate(Date, Address, Name_Of_Deceased, Residential_Place, Hospital_Name, Date_Of_Death, Sex, Applicant_Name, Relation_with_Person, Id_proof, Birth_Certificate_Of_Deceased, Medical_certificate, Adhar_Card_Of_Deceased, Copy_of_Ration_Card, Residensial_proof, Signature,Status,Death_Registration_Id, MCId));
            }
        } catch (SQLException e) {
            System.out.println(" Connection Errors :" + e.getMessage());
        }

        return com;

    }

    public List<Marriage_Registration> selectMarriageCertificate(int MCorpId) throws SQLException {
        List<Marriage_Registration> com = new ArrayList<>();
        Connection conn = DBConnections.getConnection();
        String sql1 = "SELECT * FROM municipal_corp.marriage_registration where MCId=?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql1);
            pst.setInt(1, MCorpId);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {


                String Marriage_Date = rs.getString("Marriage_Date");
                String Ward = rs.getString("Ward");
                String Marriage_Place = rs.getString("Marriage_Place"); 
                String Marriage_Address = rs.getString("Marriage_Address"); 
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
                String Status = rs.getString("Status");
                int MCId = rs.getInt("MCId");
                int MarriageRregistration_Id = rs.getInt("MarriageRregistration_Id");
                com.add(new Marriage_Registration(Marriage_Date, Ward, Marriage_Place, Marriage_Address, Marriage_City, Marriage_Country, Husband_Name, Husband_Religion_by_Birth, Husband_Religion_by_Adoption, Husband_Date_of_Birth, Husband_Status_at_marriage, Husband_Occupation, Husband_Mobile_Number, Husband_Email, Husband_Address, Husband_City, Husband_Country, Wife_Name, Wife_Religion_by_Birth, Wife_Religion_by_Adoption, Wife_Date_of_Birth, Wife_Status_at_marriage, Wife_Occupation, Wife_Mobile_Number, Wife_Email, Wife_Address, Wife_City, Wife_Country, Witness_Name, Witness_Relation_With_Couple, Witness_Occupation, Witness_Mobile_Number, Witness_Email, Witness_Address, Witness_City, Witness_Country, Priest_Name, Priest_Religion, Priest_Date_of_Birth, Priest_Occupation, Priest_Mobile_Number, Priest_Email, Priest_Address, Priest_City, Priest_Country, Bride_Birth_Certificate, Bride_Aadhar_Card, Photographs_Bride, Bridegroom_Birth_Certificate, Bridegroom_Aadhar_Card, Photographs_Bridegroom, Witness_Aadhar_Card, Witness_Election_Card, Wedding_card, Signature_Priest, Signature_Applicant,Husband_Age, Wife_Age, Priest_Age, MarriageRregistration_Id, MCId,Status));
            }
        } catch (SQLException e) {
            System.out.println(" Connection Errors :" + e.getMessage());
        }

        return com;

    }
    
    
    public List<Ganpati_Visarjan> selectGanapatiImmersionCertificate(int MCorpId) throws SQLException {
        List<Ganpati_Visarjan> com = new ArrayList<>();
        Connection conn = DBConnections.getConnection();
        String sql1 = "SELECT * FROM municipal_corp.ganpati_visarjan where MCId=?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql1);
            pst.setInt(1, MCorpId);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String Type_of_Registration = rs.getString("Type_of_Registration");
                String Name = rs.getString("Name");
                String Mobile_Number = rs.getString("Mobile_Number");
                String Address = rs.getString("Address");
                String Ward = rs.getString("Ward");
                String Place = rs.getString("Place");
                String Date_and_Time = rs.getString("Date_and_Time");
                String Signature = rs.getString("Signature");
                String Status = rs.getString("Status");
                int MCId = rs.getInt("MCId");
                int Ganapati_Visarjan_Id = rs.getInt("Ganapati_Visarjan_Id");
                com.add(new Ganpati_Visarjan(Type_of_Registration, Name, Mobile_Number, Address, Ward, Place, Date_and_Time, Signature,Status, Ganapati_Visarjan_Id, MCId));
            }
        } catch (SQLException e) {
            System.out.println(" Connection Errors :" + e.getMessage());
        }

        return com;

    }
    
    
    public List<Birth_Registration> selectBirthCertificateForView(int Birth_registration_Id) throws SQLException {
        List<Birth_Registration> com = new ArrayList<>();
        Connection conn = DBConnections.getConnection();
        System.out.println("Birth_registration_Id"+Birth_registration_Id);
        String sql1 = "SELECT * FROM municipal_corp.birth_registration where Birth_Registration_Id=?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql1);
            pst.setInt(1, Birth_registration_Id);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                System.out.println("Applicant name deatails at user birthDao for view form  :    " + rs.getString("Applicant_Name"));
                String Date = rs.getString("Date");
                String Address = rs.getString("Address");
                String Mother_Name = rs.getString("Mother_Name");
                String Father_Name = rs.getString("Father_Name");
                String Residential_Place = rs.getString("Residential_Place");
                String Hospital_Name = rs.getString("Hospital_Name");
                String Date_Of_Birth = rs.getString("Date_Of_Birth");
                String Sex = rs.getString("Sex");
                String Child_Name = rs.getString("Child_Name");
                String Applicant_Name = rs.getString("Applicant_Name");
                String Relation_with_Child = rs.getString("Relation_with_Child");
                String Id_proof = rs.getString("Id_proof");
                String Parent_Marriage_Certificate = rs.getString("Parent_Marriage_Certificate");
                String Letter_from_Hospital = rs.getString("Letter_from_Hospital");
                String Parent_Birth_Certificate = rs.getString("Parent_Birth_Certificate");
                String Signature = rs.getString("Signature");
                int MCId = rs.getInt("MCId");
                int Birth_Registration_Id = rs.getInt("Birth_Registration_Id");
                com.add(new Birth_Registration(Date, Address, Mother_Name, Father_Name, Residential_Place, Hospital_Name, Date_Of_Birth, Sex, Child_Name, Applicant_Name, Relation_with_Child, Id_proof, Parent_Marriage_Certificate, Letter_from_Hospital, Parent_Birth_Certificate, Signature, MCId, Birth_Registration_Id));
            }
        } catch (SQLException e) {
            System.out.println(" Connection Errors :" + e.getMessage());
        }

        return com;

    }
    
    public String UpadteResponse(int BirthId) throws SQLException {
        Connection conn = getConnection();

        String sql = "UPDATE municipal_corp.birth_registration SET Status='Approved' WHERE Birth_Registration_Id = ?;";
        try {
            PreparedStatement ps;
            ps = conn.prepareStatement(sql);
            ps.setInt(1, BirthId);
//            ps.setInt(2, complaintId);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(" Connection Errors at birthDao:" + e.getMessage());
//            result = "data not inserted";
        }

        return null;

    }
    public String UpadteResponseReject(int BirthId) throws SQLException {
        Connection conn = getConnection();

        String sql = "UPDATE municipal_corp.birth_registration SET Status='Rejected' WHERE Birth_Registration_Id = ?;";
        try {
            PreparedStatement ps;
            ps = conn.prepareStatement(sql);
            ps.setInt(1, BirthId);
//            ps.setInt(2, complaintId);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(" Connection Errors at birthDao:" + e.getMessage());
//            result = "data not inserted";
        }

        return null;

    }
    public String UpadteResponseforGanapati(int GanId) throws SQLException {
        Connection conn = getConnection();

        String sql = "UPDATE municipal_corp.ganpati_visarjan SET Status='Approved' WHERE Ganapati_Visarjan_Id = ?;";
        try {
            PreparedStatement ps;
            ps = conn.prepareStatement(sql);
            ps.setInt(1, GanId);
//            ps.setInt(2, complaintId);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(" Connection Errors at birthDao:" + e.getMessage());
//            result = "data not inserted";
        }

        return null;

    }
    public String UpadteResponseRejectGanapati(int GanId) throws SQLException {
        Connection conn = getConnection();

        String sql = "UPDATE municipal_corp.ganpati_visarjan SET Status='Rejected' WHERE Ganapati_Visarjan_Id = ?;";
        try {
            PreparedStatement ps;
            ps = conn.prepareStatement(sql);
            ps.setInt(1, GanId);
//            ps.setInt(2, complaintId);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(" Connection Errors at birthDao:" + e.getMessage());
//            result = "data not inserted";
        }

        return null;

    }
    public String UpadteResponseforDeath(int GanId) throws SQLException {
        Connection conn = getConnection();

        String sql = "UPDATE municipal_corp.death_registration SET Status='Approved' WHERE Death_Registration_Id = ?;";
        try {
            PreparedStatement ps;
            ps = conn.prepareStatement(sql);
            ps.setInt(1, GanId);
//            ps.setInt(2, complaintId);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(" Connection Errors at birthDao:" + e.getMessage());
//            result = "data not inserted";
        }

        return null;

    }
    public String UpadteResponseRejectDeath(int GanId) throws SQLException {
        Connection conn = getConnection();

        String sql = "UPDATE municipal_corp.death_registration SET Status='Rejected' WHERE Death_Registration_Id = ?;";
        try {
            PreparedStatement ps;
            ps = conn.prepareStatement(sql);
            ps.setInt(1, GanId);
//            ps.setInt(2, complaintId);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(" Connection Errors at birthDao:" + e.getMessage());
//            result = "data not inserted";
        }

        return null;

    }
    public String UpadteResponseforMarriage(int marId) throws SQLException {
        Connection conn = getConnection();

        String sql = "UPDATE municipal_corp.marriage_registration SET Status='Approved' WHERE MarriageRregistration_Id = ?;";
        try {
            PreparedStatement ps;
            ps = conn.prepareStatement(sql);
            ps.setInt(1, marId);
//            ps.setInt(2, complaintId);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(" Connection Errors at birthDao:" + e.getMessage());
//            result = "data not inserted";
        }

        return null;

    }
    public String UpadteResponseRejectMarriage(int marId) throws SQLException {
        Connection conn = getConnection();

        String sql = "UPDATE municipal_corp.marriage_registration SET Status='Rejected' WHERE MarriageRregistration_Id = ?;";
        try {
            PreparedStatement ps;
            ps = conn.prepareStatement(sql);
            ps.setInt(1, marId);
//            ps.setInt(2, complaintId);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(" Connection Errors at birthDao:" + e.getMessage());
//            result = "data not inserted";
        }

        return null;

    }
}
    
    

