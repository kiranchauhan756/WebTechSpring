package com.restful.api.employee;

import org.springframework.stereotype.Repository;
import com.restful.api.employee.Employee;

// Importing the employees class to
// use the defined properties
// in this class

@Repository
public class EmployeeDAO {

	private Employees list = new Employees();

	

	// Method to return the list
	public Employees getAllEmployees() {

		return list;
	}

	// Method to add an employee
	// to the employees list
	public void addEmployee(Employee employee) {
		list.getEmployeeList().add(employee);

	}
}
