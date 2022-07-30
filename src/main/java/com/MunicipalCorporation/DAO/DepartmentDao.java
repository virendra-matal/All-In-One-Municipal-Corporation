
package com.MunicipalCorporation.DAO;

import com.MunicipalCorporation.DatabaseConnetion.DBConnections;
import com.MunicipalCorporation.Model.department;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DepartmentDao {
    
    
    Connection con;

    public DepartmentDao() throws SQLException {
        this.con = DBConnections.getConnection();
    }    

    public List<department> selectITDeptInfo(int MCorpId) throws SQLException {
        List<department> com = new ArrayList<>();
        Connection conn = DBConnections.getConnection();
        String sql1 = "SELECT * FROM municipal_corp.department where MCId=? and Dept_Name='IT Department'";
        try {
            PreparedStatement pst = conn.prepareStatement(sql1);
            pst.setInt(1, MCorpId);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
//                System.err.println("department:::00" + rs.getString("Dept_Name"));
                int Dept_Id = rs.getInt("Dept_Id");
                String Dept_Name = rs.getString("Dept_Name");
                String Dept_Description = rs.getString("Dept_Description");
                String Head_Of_Dept = rs.getString("Head_Of_Dept");
                String Designation = rs.getString("Designation");
                String Email_Id = rs.getString("Email_Id");
                
                com.add(new department(Dept_Name, Dept_Description, Head_Of_Dept, Designation, Email_Id, Dept_Id));
            }
        } catch (SQLException e) {
            System.out.println(" Connection Errors :" + e.getMessage());
        }
        
        return com;
        
    }
    
    
    public List<department> selectLicenseDeptInfo(int MCorpId) throws SQLException {
        List<department> com = new ArrayList<>();
        Connection conn = DBConnections.getConnection();
        String sql1 = "SELECT * FROM municipal_corp.department where MCId=? and Dept_Name='License Department'";
        try {
            PreparedStatement pst = conn.prepareStatement(sql1);
            pst.setInt(1, MCorpId);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
//                System.err.println("department:::00" + rs.getString("Dept_Name"));
                int Dept_Id = rs.getInt("Dept_Id");
                String Dept_Name = rs.getString("Dept_Name");
                String Dept_Description = rs.getString("Dept_Description");
                String Head_Of_Dept = rs.getString("Head_Of_Dept");
                String Designation = rs.getString("Designation");
                String Email_Id = rs.getString("Email_Id");
                
                com.add(new department(Dept_Name, Dept_Description, Head_Of_Dept, Designation, Email_Id, Dept_Id));
            }
        } catch (SQLException e) {
            System.out.println(" Connection Errors :" + e.getMessage());
        }
        
        return com;
        
    }
    
    
    
    public List<department> selectTownPlanningDeptInfo(int MCorpId) throws SQLException {
        List<department> com = new ArrayList<>();
        Connection conn = DBConnections.getConnection();
        String sql1 = "SELECT * FROM municipal_corp.department where MCId=? and Dept_Name='Town Planning Department'";
        try {
            PreparedStatement pst = conn.prepareStatement(sql1);
            pst.setInt(1, MCorpId);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
//                System.err.println("department:::00" + rs.getString("Dept_Name"));
                int Dept_Id = rs.getInt("Dept_Id");
                String Dept_Name = rs.getString("Dept_Name");
                String Dept_Description = rs.getString("Dept_Description");
                String Head_Of_Dept = rs.getString("Head_Of_Dept");
                String Designation = rs.getString("Designation");
                String Email_Id = rs.getString("Email_Id");
                
                com.add(new department(Dept_Name, Dept_Description, Head_Of_Dept, Designation, Email_Id, Dept_Id));
            }
        } catch (SQLException e) {
            System.out.println(" Connection Errors :" + e.getMessage());
        }
        
        return com;
        
    }
    
    
    public List<department> selectHealthDeptInfo(int MCorpId) throws SQLException {
        List<department> com = new ArrayList<>();
        Connection conn = DBConnections.getConnection();
        String sql1 = "SELECT * FROM municipal_corp.department where MCId=? and Dept_Name='Health Department'";
        try {
            PreparedStatement pst = conn.prepareStatement(sql1);
            pst.setInt(1, MCorpId);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                System.err.println("department:::00" + rs.getString("Dept_Name"));
                int Dept_Id = rs.getInt("Dept_Id");
                String Dept_Name = rs.getString("Dept_Name");
                String Dept_Description = rs.getString("Dept_Description");
                String Head_Of_Dept = rs.getString("Head_Of_Dept");
                String Designation = rs.getString("Designation");
                String Email_Id = rs.getString("Email_Id");
                
                com.add(new department(Dept_Name, Dept_Description, Head_Of_Dept, Designation, Email_Id, Dept_Id));
            }
        } catch (SQLException e) {
            System.out.println(" Connection Errors :" + e.getMessage());
        }
        
        return com;
        
    }
    
    
    public List<department> selectFireDeptInfo(int MCorpId) throws SQLException {
        List<department> com = new ArrayList<>();
        Connection conn = DBConnections.getConnection();
        String sql1 = "SELECT * FROM municipal_corp.department where MCId=? and Dept_Name='Fire Department'";
        try {
            PreparedStatement pst = conn.prepareStatement(sql1);
            pst.setInt(1, MCorpId);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                System.err.println("department:::00" + rs.getString("Dept_Name"));
                int Dept_Id = rs.getInt("Dept_Id");
                String Dept_Name = rs.getString("Dept_Name");
                String Dept_Description = rs.getString("Dept_Description");
                String Head_Of_Dept = rs.getString("Head_Of_Dept");
                String Designation = rs.getString("Designation");
                String Email_Id = rs.getString("Email_Id");
                
                com.add(new department(Dept_Name, Dept_Description, Head_Of_Dept, Designation, Email_Id, Dept_Id));
            }
        } catch (SQLException e) {
            System.out.println(" Connection Errors :" + e.getMessage());
        }
        
        return com;
        
    }
    
    
    public List<department> selectGarednANDTreeDeptInfo(int MCorpId) throws SQLException {
        List<department> com = new ArrayList<>();
        Connection conn = DBConnections.getConnection();
        String sql1 = "SELECT * FROM municipal_corp.department where MCId=? and Dept_Name='Garden and Trees Department'";
        try {
            PreparedStatement pst = conn.prepareStatement(sql1);
            pst.setInt(1, MCorpId);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                System.err.println("department:::00" + rs.getString("Dept_Name"));
                int Dept_Id = rs.getInt("Dept_Id");
                String Dept_Name = rs.getString("Dept_Name");
                String Dept_Description = rs.getString("Dept_Description");
                String Head_Of_Dept = rs.getString("Head_Of_Dept");
                String Designation = rs.getString("Designation");
                String Email_Id = rs.getString("Email_Id");
                
                com.add(new department(Dept_Name, Dept_Description, Head_Of_Dept, Designation, Email_Id, Dept_Id));
            }
        } catch (SQLException e) {
            System.out.println(" Connection Errors :" + e.getMessage());
        }
        
        return com;
        
    }
    
}
