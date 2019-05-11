/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college.dao;

import college.pojo.EmpPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import college.dbutil.DBConnection;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Nitin
 */
public class EmpDAO {

    public static boolean addEmp(EmpPojo empPojo) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into Employees values(?,?,?,?,?,?,?,?,?)");
        ps.setString(1, empPojo.getId());
        ps.setString(2, empPojo.getName());
        ps.setString(3, empPojo.getDesig());
        ps.setString(4, empPojo.getCollege());
        ps.setString(5, empPojo.getDept());
        ps.setString(6, empPojo.getTel());
        ps.setString(7, empPojo.getMob());
        ps.setString(8, empPojo.getEmail());
        ps.setString(9, empPojo.getAddress());

        int count = ps.executeUpdate();
        return (count == 1);

    }

    public static ArrayList<EmpPojo> getEmpByDept(String dept) throws SQLException {

        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from Employees where dept=?");
        ps.setString(1, dept);
        ArrayList<EmpPojo> empList = new ArrayList<>();
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            EmpPojo empPojo = new EmpPojo();
            empPojo.setId(rs.getString(1));
            empPojo.setName(rs.getString(2));
            empPojo.setDesig(rs.getString(3));
            empPojo.setCollege(rs.getString(4));
            empPojo.setDept(rs.getString(5));
            empPojo.setTel(rs.getString(6));
            empPojo.setMob(rs.getString(7));
            empPojo.setEmail(rs.getString(8));
            empPojo.setAddress(rs.getString(9));
            
            empList.add(empPojo);
        }
        return empList;
    }
    
     public static ArrayList<EmpPojo> getALLEmp() throws SQLException{
      Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from Employees");
      
        ArrayList<EmpPojo> empList = new ArrayList<>();
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            EmpPojo empPojo = new EmpPojo();
            empPojo.setId(rs.getString(1));
            empPojo.setName(rs.getString(2));
            empPojo.setDesig(rs.getString(3));
            empPojo.setCollege(rs.getString(4));
            empPojo.setDept(rs.getString(5));
            empPojo.setTel(rs.getString(6));
            empPojo.setMob(rs.getString(7));
            empPojo.setEmail(rs.getString(8));
            empPojo.setAddress(rs.getString(9));
            
            empList.add(empPojo);
        }
        System.out.println("EmpList: "+empList);
        return empList;
         
    }

    public static ArrayList<EmpPojo> getEmpByDeptClg(String dept,String college) throws SQLException{
      Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from Employees where dept=? and college=?");
        ps.setString(1, dept);
        ps.setString(2, college);
        ArrayList<EmpPojo> empList = new ArrayList<>();
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            EmpPojo empPojo = new EmpPojo();
            empPojo.setId(rs.getString(1));
            empPojo.setName(rs.getString(2));
            empPojo.setDesig(rs.getString(3));
            empPojo.setCollege(rs.getString(4));
            empPojo.setDept(rs.getString(5));
            empPojo.setTel(rs.getString(6));
            empPojo.setMob(rs.getString(7));
            empPojo.setEmail(rs.getString(8));
            empPojo.setAddress(rs.getString(9));
            
            empList.add(empPojo);
        }
        return empList;
    }
      public static ArrayList<EmpPojo> getEmpByClg(String college) throws SQLException{
      Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from Employees where college=?");
        ps.setString(1, college);
  
        ArrayList<EmpPojo> empList = new ArrayList<>();
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            EmpPojo empPojo = new EmpPojo();
            empPojo.setId(rs.getString(1));
            empPojo.setName(rs.getString(2));
            empPojo.setDesig(rs.getString(3));
            empPojo.setCollege(rs.getString(4));
            empPojo.setDept(rs.getString(5));
            empPojo.setTel(rs.getString(6));
            empPojo.setMob(rs.getString(7));
            empPojo.setEmail(rs.getString(8));
            empPojo.setAddress(rs.getString(9));
            
            empList.add(empPojo);
        }
        return empList;
    }

//    public static ArrayList<EmpPojo> getEmpByName() throws SQLException{
//        
//       Connection conn = DBConnection.getConnection();
//        PreparedStatement ps = conn.prepareStatement("select * from Employees");
//        //ps.setString(1, name);
//        ArrayList<EmpPojo> empList = new ArrayList<>();
//        ResultSet rs = ps.executeQuery();
//        while (rs.next()) {
//            EmpPojo empPojo = new EmpPojo();
//            empPojo.setId(rs.getString(1));
//            empPojo.setName(rs.getString(2));
//            empPojo.setDesig(rs.getString(3));
//            empPojo.setCollege(rs.getString(4));
//            empPojo.setDept(rs.getString(5));
//            empPojo.setTel(rs.getString(6));
//            empPojo.setMob(rs.getString(7));
//            empPojo.setEmail(rs.getString(8));
//            empPojo.setAddress(rs.getString(9));
//            
//            empList.add(empPojo);
//        }
//        return empList;  
//            
//    }
    public static ArrayList<String> getDeptByCollege(String college) throws SQLException
    {
         Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select distinct dept from Employees where college=?");
        ps.setString(1, college);
        ArrayList<String> deptList = new ArrayList<>();
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            deptList.add(rs.getString(1));
        }
        
        return deptList;
        
    }
    public static ArrayList<String> getAllDept() throws SQLException
    {
         Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select distinct dept from Employees");
       
        ArrayList<String> deptList = new ArrayList<>();
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            deptList.add(rs.getString(1));
        }
        
        return deptList;
        
    }

    public static EmpPojo searchEmp(String mob) throws SQLException {
        
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from Employees where mob=?");
        ps.setString(1, mob);
        ResultSet rs=ps.executeQuery();
        EmpPojo empPojo=null;
        while(rs.next())
        {
            empPojo=new EmpPojo();
            empPojo.setName(rs.getString(2));
            empPojo.setDesig(rs.getString(3));
            empPojo.setCollege(rs.getString(4));
            empPojo.setDept(rs.getString(5));
            empPojo.setTel(rs.getString(6));
            empPojo.setEmail(rs.getString(8));
            empPojo.setAddress(rs.getString(9));
        }
        
        return empPojo;
    }

    public static int updateEmpInfo(EmpPojo ePojo, String mob) throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("update Employees set name=?,desig=?,college=?,dept=?,tel=?,mob=?,email=?,address=? where mob=?");
        ps.setString(1, ePojo.getName());
        ps.setString(2, ePojo.getDesig());
        ps.setString(3, ePojo.getCollege());
        ps.setString(4, ePojo.getDept());
        ps.setString(5, ePojo.getTel());
        ps.setString(6, ePojo.getMob());
        ps.setString(7, ePojo.getEmail());
        ps.setString(8, ePojo.getAddress());
        ps.setString(9, mob);
        int count=ps.executeUpdate();
        System.out.println(count);
        if(count==1)
         return 1;
        else if(count==0)
            return 0;
        return count;
    }
    public static int deleteEmpInfo(String mob) throws SQLException{
        
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("delete from Employees where mob=?");
        ps.setString(1, mob);
        
        int count=ps.executeUpdate();
        if(count==1)
         return 1;
        else if(count==0)
            return 0;
        return count;
    }

}
