package com.ness.springbootdemo.entity;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private String designation;
	private int salary;
	
	public Employee() {
	}

	public Employee(int employeeId, String employeeName, String designation, int salary) {
		
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.designation = designation;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", designation=" + designation
				+ ", salary=" + salary + "]";
	}	

}
