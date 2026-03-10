package com.cg.main;

import com.mysql.jdbc.Driver;

import java.sql.*;
import java.util.Scanner;

public class MyConnection {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // class.forName is used to create object of a class dynamically at runtime
//            System.out.println("Driver Loaded...");
            Connection con =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root123");
            // print the whole table
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("Select * from emp");
            while(rs.next()){
                System.out.println(rs.getString("ename")+"\t"+rs.getInt("empno")+"\t"+rs.getDate("hiredate"));
            }
//            ResultSet rs = stat.executeQuery("Select * from emp");
//            while(rs.next()){
//                System.out.println(rs.getString("ename")+"\t"+rs.getInt("empno"));
//            }


//            Scanner sc=new Scanner(System.in);
//            System.out.println("Enter Roll No");
//            int cid = sc.nextInt();

            // to get particular row
//            PreparedStatement ps = con.prepareStatement("Select  * from student where ename=? and empno = ?");
//            ps.setString(1, "JONES");
//            ps.setString(2, "7566" );
//            ResultSet rs=ps.executeQuery(); // executeQuery to read the data
//            if (rs.next())
//              System.out.println(rs.getString("ename")+"\t"+rs.getInt("empno")+"\t"+rs.getDate("hiredate"));
//            else
//                System.out.println("Not Found");


            // inserting data
            // this code used student table in college database
//            PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?,?)");
//            ps.setInt(1,107);
//            ps.setString(2,"Sadiq");
//            ps.setInt(3,90);
//            ps.setString(4,"A");
//            ps.setString(5,"Delhi");
//            int rows = ps.executeUpdate(); // executeUpdate to write the data
//            if (rows > 0)
//                System.out.println("Student Added");

            // deleting data
//            PreparedStatement ps = con.prepareStatement("delete from emp where ename=?");
//            ps.setString(1,"James");
//            int row = ps.executeUpdate();
//            if (row > 0)
//                System.out.println("Employee deleted");

            // update data
//            PreparedStatement ps = con.prepareStatement("update emp set sal=? where ename=?");
//            ps.setLong(1,1000);
//            ps.setString(2,"SMITH");
//            int row = ps.executeUpdate();
//            if (row > 0)
//                System.out.println("salary updated");

          } catch (Exception e) {
            System.out.println("salary not updated");
        }
    }
}
