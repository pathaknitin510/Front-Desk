
package college.dao;

import college.dbutil.DBConnection;
import college.pojo.AdminPojo;
import college.pojo.EmpPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Nitin
 */
public class AdminDAO {
    
    public static ArrayList<AdminPojo> getAllAdmin() throws SQLException
    {
         Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from Admin");
      
        ArrayList<AdminPojo> adminList = new ArrayList<>();
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            AdminPojo adminPojo = new AdminPojo();
            adminPojo.setName(rs.getString(1));
            adminPojo.setDesig(rs.getString(2));
            adminPojo.setTel(rs.getString(3));
            adminPojo.setMob(rs.getString(4));
            adminPojo.setEmail(rs.getString(5));
            adminPojo.setOther(rs.getString(6));
            
            adminList.add(adminPojo);
        }
        return adminList;
    }
}
