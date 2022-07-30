package com.MunicipalCorporation.DAO;

import com.MunicipalCorporation.DatabaseConnetion.DBConnections;
import com.MunicipalCorporation.Model.complaints;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;

public class show_ComplaintDao {
    
    Connection con;
    
    public show_ComplaintDao() throws SQLException {
        this.con = DBConnections.getConnection();
    }
    
    public List<complaints> selectComplaints(int userid, int mcorpId) throws SQLException {
        List<complaints> com = new ArrayList<>();
        Connection conn = DBConnections.getConnection();
        String sql1 = "select Complaint_Id, Type_Of_Complaint, Ward, Complainant_Name, Complaint_Description, Location, Complaint_date, Mobile_number, Image, Status, Admin_responce from municipal_corp.compliants where complaintby=? and MCId=?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql1);
            pst.setInt(1, userid);
            pst.setInt(2, mcorpId);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                System.err.println("complaints details at show complaints Dao page : " + rs.getString("Type_Of_Complaint"));
                int Complaint_Id = rs.getInt("Complaint_Id");
                String Type_Of_Complaint = rs.getString("Type_Of_Complaint");
                String Ward = rs.getString("Ward");
                String Complainant_Name = rs.getString("Complainant_Name");
                String Complaint_Description = rs.getString("Complaint_Description");
                String Location = rs.getString("Location");
                String Complaint_date = rs.getString("Complaint_date");
                String Mobile_number = rs.getString("Mobile_number");
                String Image = rs.getString("Image");
                String Status = rs.getString("Status");
                String Admin_responce = rs.getString("Admin_responce");
//                com.add(new complaints(Type_Of_Complaint, complaintby, Ward, Complainant_Name, Complaint_Description, Location, Complaint_date, Mobile_number, Image, Status, Complaint_Id));
                com.add(new complaints(Type_Of_Complaint, Ward, Complainant_Name, Complaint_Description, Location, Complaint_date, Mobile_number, Image, Status, Admin_responce, Complaint_Id));
            }
        } catch (SQLException e) {
            System.out.println(" Connection Errors :" + e.getMessage());
        }
        
        return com;
        
    }
}
