package com.MunicipalCorporation.DAO;

import com.MunicipalCorporation.DatabaseConnetion.DBConnections;
import com.MunicipalCorporation.Model.complaints;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Get_Status_complaintDao {

    Connection con;

    public Get_Status_complaintDao() throws SQLException {
        this.con = DBConnections.getConnection();
    }

    
//    String sql2 = "select Complaint_Id, Type_Of_Complaint, Ward, Complainant_Name, Complaint_Description, Location, Complaint_date, Mobile_number, Image, Status,complaintby from municipal_corp.compliants where Mobile_number=?";

    public List<complaints> SearchComplaint(int Complaint_Id, String Mobile_number) {
        List<complaints> com = new ArrayList<>();
        try {
            Connection conn = DBConnections.getConnection();
            String sql = "select * from municipal_corp.compliants where Complaint_Id=? and Mobile_number=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, Complaint_Id);
            pst.setString(2, Mobile_number);
            ResultSet rs = pst.executeQuery();
            
             while (rs.next()) {
                System.err.println("complaints  Details at get status of complaint page :00  " + rs.getString("Type_Of_Complaint"));
                Complaint_Id = rs.getInt("Complaint_Id");
                String Type_Of_Complaint = rs.getString("Type_Of_Complaint");
                String Ward = rs.getString("Ward");
                String Complainant_Name = rs.getString("Complainant_Name");
                String Complaint_Description = rs.getString("Complaint_Description");
                String Location = rs.getString("Location");
                String Complaint_date = rs.getString("Complaint_date");
                String Response_date = rs.getString("Response_date");
                Mobile_number = rs.getString("Mobile_number");
                String Image = rs.getString("Image");
                String Status = rs.getString("Status");
                String Admin_responce = rs.getString("Admin_responce");
                int complaintby = rs.getInt("complaintby");
//                com.add(new complaints(Type_Of_Complaint, complaintby, Ward, Complainant_Name, Complaint_Description, Location, Complaint_date, Mobile_number, Image, Status, Complaint_Id));
                com.add(new complaints(Type_Of_Complaint, Ward, Complainant_Name, Complaint_Description, Location, Complaint_date, Response_date, Mobile_number, Image, Status, Admin_responce, Complaint_Id, complaintby));
            }
        } catch (SQLException e) {
            System.out.println(" Connection Errors :" + e.getMessage());
        }
        return com;

    }

   
}
