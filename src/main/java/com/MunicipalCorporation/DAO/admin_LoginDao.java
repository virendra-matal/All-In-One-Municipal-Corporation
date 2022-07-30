
package com.MunicipalCorporation.DAO;

import com.MunicipalCorporation.DatabaseConnetion.DBConnections;
import static com.MunicipalCorporation.DatabaseConnetion.DBConnections.getConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author vikram
 */
public class admin_LoginDao {
    
    Connection con;

    public admin_LoginDao() throws SQLException {
        this.con = DBConnections.getConnection();
    }

    public ResultSet AdminloginCheck(String user, String pass, String Municipal_Corporation) throws SQLException {
        Connection conn = getConnection();
        Statement st = conn.createStatement();
        String sql = " select * from municipal_corp.admin where Admin_Username='" + user + "'and Admin_Password='" + pass + "' and Municipal_Corporation='"+Municipal_Corporation+"'  ";
        ResultSet rs = st.executeQuery(sql);
        return rs;
    }
}
