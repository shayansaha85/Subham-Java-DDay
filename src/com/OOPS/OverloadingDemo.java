package com.OOPS;




class B {
	
	public void greet() {
		System.out.println("Hey there!");
	}
	
	
	public void greet(String name) {
		System.out.println("Hey " + name + "!");
	}
}

public class OverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B ob = new B();
		
		ob.greet();
		ob.greet("Shayan");
	}

}
