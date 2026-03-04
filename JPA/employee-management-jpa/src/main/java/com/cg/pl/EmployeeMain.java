package com.cg.pl;

import com.cg.bean.Employee;
import com.cg.service.EmployeeService;
import com.cg.service.IEmployeeService;

import java.util.List;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		IEmployeeService es = new EmployeeService();
		Scanner sc = new Scanner(System.in);
		int choice = 0;

		while (choice != 6) {
			System.out.println("\nEmployee Management System");
			System.out.println("1. Add Employee");
			System.out.println("2. Search Employee by ID");
			System.out.println("3. Show All Employees");
			System.out.println("4. Update Employee Name");
			System.out.println("5. Delete Employee");
			System.out.println("6. Exit");
			System.out.println("Enter your choice: ");

			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
				case 1:
					System.out.println("Enter Employeee ID: ");
					String id = sc.nextLine();
					System.out.print("Enter Name: ");
					String name = sc.nextLine();
					System.out.print("Enter Email: ");
					String email = sc.nextLine();
					System.out.print("Enter DOB (YYYY-MM-DD): ");
					String dob = sc.nextLine();
					String result = es.createEmployee(new Employee(id, name, email, dob));
					System.out.println(result);
					break;

				case 2:
					System.out.print("Enter Employee ID to search: ");
					String searchId = sc.nextLine();
					Employee femp = es.findById(searchId);
					if (femp == null) {
						System.out.println("Invalid Employee ID.");
					} else {
						System.out.println(femp.getName() + "\t" + femp.getEmail() + "\t" + femp.getDob());
					}
					break;

				case 3:
					List<Employee> li = es.getAllEmployee();
					if (li == null)
						System.out.println("No data found.");
					else
						li.forEach(p -> System.out.println(p));
					break;

				case 4:
					System.out.print("Enter Employee ID to update: ");
					String updateId = sc.nextLine();

					Employee e = es.findById(updateId);
					if (e == null) {
						System.out.println("Employee ID not found.");
					} else {
						System.out.println("What would you like to update?");
						System.out.println("1. Name");
						System.out.println("2. Email");
						System.out.println("3. Date of Birth");
						System.out.print("Choice: ");

						int updateChoice = sc.nextInt();
						sc.nextLine();

						switch (updateChoice) {
							case 1:
								System.out.print("Enter new Name: ");
								e.setName(sc.nextLine());
								break;
							case 2:
								System.out.print("Enter new Email: ");
								e.setEmail(sc.nextLine());
								break;
							case 3:
								System.out.print("Enter new DOB (YYYY-MM-DD): ");
								e.setDob(sc.nextLine());
								break;
							default:
								System.out.println("Invalid update option.");
						}
						System.out.println(es.updateEmp(e));
					}
					break;

				case 5:
					System.out.print("Enter Employee ID to delete: ");
					String deleteId = sc.nextLine();
					System.out.println(es.removeEmployee(deleteId));
					break;

				case 6:
					System.out.println("Exiting.");
					break;

				default:
					System.out.println("Invalid choice! Please select 1-6.");
			}
		}
		sc.close();
	}
}