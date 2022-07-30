
package com.MunicipalCorporation.DAO;

import com.MunicipalCorporation.DatabaseConnetion.DBConnections;
import static com.MunicipalCorporation.DatabaseConnetion.DBConnections.getConnection;
import com.MunicipalCorporation.Model.Ganpati_Visarjan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Ganapati_VisarjanDao {
    
    Connection con;

    public Ganapati_VisarjanDao() throws SQLException {
        this.con = DBConnections.getConnection();
    }

    public String insert(Ganpati_Visarjan gan) throws SQLException {

        Connection conn = getConnection();
        String result = "data insert succefully";
        String sql = "insert into municipal_corp.ganpati_visarjan(Type_of_Registration,Name,Mobile_Number,Address,Ward,Place,Date_and_Time,Signature,MCId) values(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps;
            ps = conn.prepareStatement(sql);
            ps.setString(1, gan.getType_of_Registration());
            ps.setString(2, gan.getName());
            ps.setString(3, gan.getMobile_Number());
            ps.setString(4, gan.getAddress());
            ps.setString(5, gan.getWard());
            ps.setString(6, gan.getPlace());
            ps.setString(7, gan.getDate_and_Time());
            ps.setString(8, gan.getSignature());
            ps.setInt(9, gan.getMCId());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(" Connection Errors :" + e.getMessage());
            result = "data not inserted";
        }
        return result;

    }
    
    
    public List<Ganpati_Visarjan> selectGanapatiImmersionFormForView(int Ganapati_Visarjan_Id) throws SQLException {
        List<Ganpati_Visarjan> com = new ArrayList<>();
        Connection conn = DBConnections.getConnection();
        String sql1 = "SELECT * FROM municipal_corp.ganpati_visarjan where Ganapati_Visarjan_Id=?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql1);
            pst.setInt(1, Ganapati_Visarjan_Id);
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
                int MCId = rs.getInt("MCId");
                Ganapati_Visarjan_Id = rs.getInt("Ganapati_Visarjan_Id");
                com.add(new Ganpati_Visarjan(Type_of_Registration, Name, Mobile_Number, Address, Ward, Place, Date_and_Time, Signature, Ganapati_Visarjan_Id, MCId));
            }
        } catch (SQLException e) {
            System.out.println(" Connection Errors :" + e.getMessage());
        }

        return com;

    }
}
