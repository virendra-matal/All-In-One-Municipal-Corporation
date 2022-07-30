
package com.MunicipalCorporation.DAO;

import com.MunicipalCorporation.DatabaseConnetion.DBConnections;
import com.MunicipalCorporation.Model.complaints;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Admin_ComplaintsDao {
 
    Connection con;
    
    public Admin_ComplaintsDao() throws SQLException {
        this.con = DBConnections.getConnection();
    }
    
    public List<complaints> selectComplaintsForAdmin(int MCorpId) throws SQLException {
        List<complaints> com = new ArrayList<>();
        Connection conn = DBConnections.getConnection();
        String sql1 = "select * from municipal_corp.compliants where MCId=?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql1);
            pst.setInt(1, MCorpId);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                System.err.println("admin complaints deatails at admin complaintsDao :   " + rs.getString("Type_Of_Complaint"));
                int Complaint_Id = rs.getInt("Complaint_Id");
                String Type_Of_Complaint = rs.getString("Type_Of_Complaint");
                String Ward = rs.getString("Ward");
                String Complainant_Name = rs.getString("Complainant_Name");
                String Complaint_Description = rs.getString("Complaint_Description");
                String Location = rs.getString("Location");
                String Complaint_date = rs.getString("Complaint_date");
                String Response_date = rs.getString("Response_date");
                String Mobile_number = rs.getString("Mobile_number");
                String Image = rs.getString("Image");
                String Status = rs.getString("Status");
                int complaintby = rs.getInt("complaintby");
                com.add(new complaints(Type_Of_Complaint, complaintby, Ward, Complainant_Name, Complaint_Description, Location, Complaint_date, Response_date, Mobile_number, Image, Status, Complaint_Id));
            }
        } catch (SQLException e) {
            System.out.println(" Connection Errors :" + e.getMessage());
        }
        
        return com;
        
    }
}
