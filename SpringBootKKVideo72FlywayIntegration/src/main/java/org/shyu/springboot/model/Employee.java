package org.shyu.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_table")
public class Employee {
	@Id
	@Column(name="employee_id", nullable=false)
	private int employeeId;
	
	@Column(name="employee_name", nullable=false)
	private String employeeName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="salary")
	private double salary;
	
	public Employee(String employeeName, String email, double salary) {
		this.employeeName = employeeName;
		this.email = email;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
