package com.MunicipalCorporation.DAO;

import com.MunicipalCorporation.DatabaseConnetion.DBConnections;
import static com.MunicipalCorporation.DatabaseConnetion.DBConnections.getConnection;

import java.sql.*;
import java.sql.SQLException;

public class loginclass {

    Connection con;

    public loginclass() throws SQLException {
        this.con = DBConnections.getConnection();
    }

    public ResultSet loginCheck(String user, String pass) throws SQLException {
        Connection conn = getConnection();
        Statement st = conn.createStatement();
        String sql = " select * from municipal_corp.user where Username='" + user + "'and Password='" + pass + "'  ";
        ResultSet rs = st.executeQuery(sql);
        return rs;
    }
}
