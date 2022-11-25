package com.OOPS;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Human subham = new Human();
//		
//		System.out.println(subham.name);
//		subham.walk();
//		
//		Employee shayan = new Employee();
//		shayan.setName("Shayan");
//		shayan.setEmpid(101);
//		shayan.setSalary(50000);
//		
//		System.out.println(shayan.getName());
		
		HRClass employee = new HRClass();
		
		employee.setSalary(55000);
 		System.out.println("Current salary : " + employee.getSalary());
 		System.out.println("\nIncremented Salary");
 		employee.incrementedSalary();
		
		
	}

}
