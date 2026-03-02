package com.cg.dao;

import java.sql.*;
import java.util.List;

import com.cg.bean.Employee;

public class EmployeeDao implements IEmployeeDao{
	private static Connection con;
	static {
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee2","root","root123");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public String saveEmployee(Employee emp) {
		try {
			PreparedStatement ps=con.prepareStatement("insert into emp values(?,?,?,?)");
			ps.setString(1, emp.getEmpid());
			ps.setString(2, emp.getName());
			ps.setString(3, emp.getEmail());
			ps.setString(4, emp.getDob());
			int rows=ps.executeUpdate();
			if(rows>0)
				return "Employee Created";
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "Employee Not Created";
	}

	@Override
	public Employee findEmployee(String empid) {
		try {
			PreparedStatement ps = con.prepareStatement("Select * from emp where empid=?");
			ps.setString(1,empid);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				return new Employee(rs.getString("name"),rs.getString("email"),rs.getString("dob"));
			}
		} catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Employee> getAll() {
        try {
            Statement stat = con.createStatement();
        ResultSet rs = stat.executeQuery("Select * from emp");
		while(rs.next()){
			System.out.println(rs.getString("empid")+"\t"+rs.getString("name")+"\t"+rs.getString("email")+"\t"+rs.getString("dob"));
		}
		} catch (SQLException e) {
		e.printStackTrace();
	}
		return null;
	}

	@Override
	public String updateEmployeeName(String empid, String newName) {
		try {
			PreparedStatement ps = con.prepareStatement("update emp set name=? where empid=?");
			ps.setString(1,newName);
			ps.setString(2,empid);
			int row = ps.executeUpdate();
			if (row > 0)
				System.out.println("Name updated");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Name Not updated";
	}

	@Override
	public String deleteEmployee(String empid) {
		try {
			PreparedStatement ps = con.prepareStatement("delete from emp where empid = ?");
			ps.setString(1, empid);
			int rows = ps.executeUpdate();
            if (rows > 0)
				return "Employee Deleted";
            return "Employee Not Found";

        } catch (SQLException e) {
			e.printStackTrace();
		}
		return "Employee Not deleted";
	}

}
