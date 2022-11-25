package com.OOPS;


class A1 {
	public void add(String n1, String n2) {
		System.out.println(n1+n2);
	}
}

class B1 extends A1 {
	public void add(int n1, int n2) {
		System.out.println(n1+n2);
	}
}

public class OverriddingDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hi",b = "Hello";
		int c = 5, d = 9;
		
		B1 ob1 = new B1();
		
		ob1.add(a, b);
		ob1.add(c, d);
	}

}
