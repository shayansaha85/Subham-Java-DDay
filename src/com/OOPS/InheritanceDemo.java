package com.OOPS;

class Father {
	public void walk() {
		System.out.println("HE CAN WALK");
	}
}


class Child extends Father{
	public void talk() {
		System.out.println("HE CAN TALK");
	}
}



public class InheritanceDemo {
	public static void main(String[] args) {
		Father ofather = new Father();
		Child ochild = new Child();
		
		ofather.walk();
		ochild.talk();
		ochild.walk();
	}
}