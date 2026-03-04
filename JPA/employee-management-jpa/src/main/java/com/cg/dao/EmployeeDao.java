package com.cg.dao;

import java.util.List;

import com.cg.bean.Employee;
import jakarta.persistence.*;

public class EmployeeDao implements IEmployeeDao{
	private static EntityManagerFactory emf;
	private static EntityManager em;
	static {
		try {
			emf = Persistence.createEntityManagerFactory("my-pu");
			em = emf.createEntityManager();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public String saveEmployee(Employee emp) {
			Employee e = new Employee(emp.getEmpid(),emp.getName(),emp.getEmail(),emp.getDob());
			em.getTransaction().begin();
			em.persist(e);
			em.getTransaction().commit();
			return "Employee Created";
	}

	@Override
	public Employee findEmployee(String empid) {
		Employee e = em.find(Employee.class,empid);
		return e;
	}

	@Override
	public List<Employee> getAll() {
		Query q = em.createQuery("select e from Employee e");
		List<Employee> li = q.getResultList();
		return li;
	}

	@Override
	public String updateEmployee(Employee emp) {
		Employee e = em.find(Employee.class, emp.getEmpid());
		em.getTransaction().begin();
        e.setName(emp.getName());
        e.setEmail(emp.getEmail());
        e.setDob(emp.getDob());
        em.getTransaction().commit();
        return "Employee Updated";
	}

	@Override
	public String deleteEmployee(String empid) {
		Employee e = em.find(Employee.class, empid);
		em.getTransaction().begin();
		if (e!=null) {
            em.remove(e);
            System.out.println(e);
        } else
            System.out.println("Employee Not Found");
		em.getTransaction().commit();
		return "Employee deleted";
	}
}
