package com.OOPS;

public class Employee {

	String name;
	int empid;
	int salary;
public Employee() {
		// TODO Auto-generated constructor stub
	}
	// non-parameterized constructor
//	public Employee() {
//		System.out.println("HELLO");
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	// parameterized constructor
//	public Employee(String name, int empid, int salary) {
//		this.name = name;
//		this.empid = empid;
//		this.salary = salary;
//	}
//	
//	
	
	
}
