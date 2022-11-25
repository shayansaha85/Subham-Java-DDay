package com.OOPS;

public class HRClass {
	int salary;
	
	public HRClass() {
		System.out.println("HR Instance Created");
	}
	
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void incrementedSalary() {
		double incSal = (double)salary + (double)salary*0.1;
		System.out.println(incSal);
	}
	
}
