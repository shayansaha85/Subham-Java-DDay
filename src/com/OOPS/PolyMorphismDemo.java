package com.OOPS;


class Dog {
	public void sound() {
		System.out.println("Bhow Bhhow");
	}
}

class Cat {
	public void sound() {
		System.out.println("Meaow Meaow");
	}
}

public class PolyMorphismDemo {
	public static void main(String[] args) {
		
		Dog odog = new Dog();
		Cat ocat = new Cat();
		
		odog.sound();
		ocat.sound();
	}
}
