package com.cg.service;

import java.util.List;
import java.util.Random;

import com.cg.bean.Employee;
import com.cg.dao.EmployeeDao;
import com.cg.dao.IEmployeeDao;

public class EmployeeService implements IEmployeeService {
	IEmployeeDao dao=new EmployeeDao();
	
	@Override
	public String createEmployee(Employee emp) {
		if(emp.getName()==null || emp.getEmail()==null || emp.getDob() == null) {
			return "Invalid Employee Data";
		}
		return dao.saveEmployee(emp);
	}

	@Override
	public Employee findById(String eid) {
		if (eid == null)
			return null;
		return dao.findEmployee(eid);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return dao.getAll();
	}

	@Override
	public String updateEmp(Employee emp) {
		if (emp.getEmpid() == null)
			return "Employee ID is required";
		if (emp.getName() == null && emp.getEmail() == null && emp.getDob() == null)
			return "Provide a field to update.";
		return dao.updateEmployee(emp);
	}

	@Override
	public String removeEmployee(String empid) {
		if (empid == null)
			return "Invalid Id";
		return dao.deleteEmployee(empid);
	}
}
