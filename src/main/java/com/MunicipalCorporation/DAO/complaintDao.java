package com.MunicipalCorporation.DAO;

import com.MunicipalCorporation.DatabaseConnetion.DBConnections;
import static com.MunicipalCorporation.DatabaseConnetion.DBConnections.getConnection;
import com.MunicipalCorporation.Model.complaints;
//import com.MunicipalCorporation.Model.feedback;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class complaintDao {

    Connection con;

    public complaintDao() throws SQLException {
        this.con = DBConnections.getConnection();
    }

    public complaints insert(complaints c) throws SQLException {
        Connection conn = getConnection();
//        System.out.print(c.getType_Of_Complaint());
//        System.out.print(c.getWard());
//        System.out.print(c.getComplainant_Name());
//        System.out.print(c.getComplaint_Description());
//        System.out.print(c.getLocation());
//        System.out.print(c.getComplaint_date());
//        System.out.print(c.getMobile_number());
//        System.out.print(c.getImage());
//        con = getConnection();
//        String result = "data insert succefully";
        String sql = "insert into municipal_corp.compliants(Type_Of_Complaint, Ward, Complainant_Name, Complaint_Description, Location, Complaint_date, Mobile_number, Image, Status,complaintby,MCId) values(?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps;
            ps = conn.prepareStatement(sql);
            ps.setString(1, c.getType_Of_Complaint());
            ps.setString(2, c.getWard());
            ps.setString(3, c.getComplainant_Name());
            ps.setString(4, c.getComplaint_Description());
            ps.setString(5, c.getLocation());
            ps.setString(6, c.getComplaint_date());
            ps.setString(7, c.getMobile_number());
            ps.setString(8, c.getImage());
            ps.setString(9, c.getStatus());
            ps.setInt(10, c.getComplaintby());
            ps.setInt(11, c.getMCId());

            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(" Connection Errors :" + e.getMessage());
//            result = "data not inserted";
        }

        return c;

    }

//    public List<complaints> selectComplaints(String Mobile_number) throws SQLException{
//        List<complaints> com=new ArrayList<>();
//        Connection conn=DBConnections.getConnection();
//        String sql1 = "select Complaint_Id, Type_Of_Complaint, Ward, Complainant_Name, Complaint_Description, Location, Complaint_date, Mobile_number, Image, Status from municipal_corp.compliants where Mobile_number=?";
//        try {
//            PreparedStatement pst = conn.prepareStatement(sql1);
//            pst.setString(1, Mobile_number);
//            ResultSet rs=pst.executeQuery();
//            
//            while (rs.next()) {
//                
//                int Complaint_Id = rs.getInt("Complaint_Id");
//                String Type_Of_Complaint = rs.getString("Type_Of_Complaint");
//                String Ward = rs.getString("Ward");
//                String Complainant_Name = rs.getString("Complainant_Name");
//                String Complaint_Description = rs.getString("Complaint_Description");
//                String Location = rs.getString("Location");
//                String Complaint_date = rs.getString("Complaint_date");
//                Mobile_number = rs.getString("Mobile_number");
//                String Image = rs.getString("Image");
//                String Status = rs.getString("Status");
//                com.add(new complaints( Type_Of_Complaint, Ward, Complainant_Name, Complaint_Description, Location, Complaint_date, Mobile_number, Image, Status, Complaint_Id));
//            }
//        } catch (SQLException e) {
//            System.out.println(" Connection Errors :" + e.getMessage());
//        }
//
//        return com;
//    
//    }
    
     public complaints UpadteResponse(int complaintId, String response) throws SQLException {
        Connection conn = getConnection();

        String sql = "UPDATE municipal_corp.compliants SET Admin_responce =?, Status='Approved' WHERE (Complaint_Id = ?);";
        try {
            PreparedStatement ps;
            ps = conn.prepareStatement(sql);
            ps.setString(1, response);
            ps.setInt(2, complaintId);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(" Connection Errors :" + e.getMessage());
//            result = "data not inserted";
        }

        return null;

    }
}
