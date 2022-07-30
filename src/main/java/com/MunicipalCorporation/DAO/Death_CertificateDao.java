package com.MunicipalCorporation.DAO;

import com.MunicipalCorporation.DatabaseConnetion.DBConnections;
import static com.MunicipalCorporation.DatabaseConnetion.DBConnections.getConnection;
import com.MunicipalCorporation.Model.Death_Certificate;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Death_CertificateDao {

    Connection con;

    public Death_CertificateDao() throws SQLException {
        this.con = DBConnections.getConnection();
    }

    public String insert(Death_Certificate death) throws SQLException {

        Connection conn = getConnection();
        String result = "data insert succefully";
        String sql = "insert into municipal_corp.death_registration(Date,Address,Name_Of_Deceased,Residential_Place,Hospital_Name,Date_Of_Death,Sex,Applicant_Name,Relation_with_Person,Id_proof,Birth_Certificate_Of_Deceased,Medical_certificate,Adhar_Card_Of_Deceased,Copy_of_Ration_Card,Residensial_proof,Signature,MCId) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps;
            ps = conn.prepareStatement(sql);
            ps.setString(1, death.getDate());
            ps.setString(2, death.getAddress());
            ps.setString(3, death.getName_Of_Deceased());
            ps.setString(4, death.getResidential_Place());
            ps.setString(5, death.getHospital_Name());
            ps.setString(6, death.getDate_Of_Death());
            ps.setString(7, death.getSex());
            ps.setString(8, death.getApplicant_Name());
            ps.setString(9, death.getRelation_with_Person());
            ps.setString(10, death.getId_proof());
            ps.setString(11, death.getBirth_Certificate_Of_Deceased());
            ps.setString(12, death.getMedical_certificate());
            ps.setString(13, death.getAdhar_Card_Of_Deceased());
            ps.setString(14, death.getCopy_of_Ration_Card());
            ps.setString(15, death.getResidensial_proof());
            ps.setString(16, death.getSignature());
            ps.setInt(17, death.getMCId());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(" Connection Errors :" + e.getMessage());
            result = "data not inserted";
        }
        return result;

    }
    
    
    public List<Death_Certificate> selectDeathCertificateForView(int Death_Registration_Id) throws SQLException {
        List<Death_Certificate> com = new ArrayList<>();
        Connection conn = DBConnections.getConnection();
        String sql1 = "SELECT * FROM municipal_corp.death_registration where Death_Registration_Id=?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql1);
            pst.setInt(1, Death_Registration_Id);
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
                int MCId = rs.getInt("MCId");
                Death_Registration_Id = rs.getInt("Death_Registration_Id");
                com.add(new Death_Certificate(Date, Address, Name_Of_Deceased, Residential_Place, Hospital_Name, Date_Of_Death, Sex, Applicant_Name, Relation_with_Person, Id_proof, Birth_Certificate_Of_Deceased, Medical_certificate, Adhar_Card_Of_Deceased, Copy_of_Ration_Card, Residensial_proof, Signature, Death_Registration_Id, MCId));
            }
        } catch (SQLException e) {
            System.out.println(" Connection Errors :" + e.getMessage());
        }

        return com;

    }
    
}
