package com.OOPS;

import java.util.Scanner;

class Restro {
	
	String customerName;
	int totalBill = 0;
	
	String[] items = {"Butter Chicken", "Paneer Tikka", "Tandoori"};
	int[] prices = {250, 180, 300};
	
	public Restro(String customerName) {
		this.customerName = customerName;
	}
	
	public void add_item(String itemName, int qty) {
		for(int i=0; i<items.length; i++) {
			if(itemName.equalsIgnoreCase(items[i])) {
				totalBill = totalBill + prices[i]*qty;
				break;
			}
		}
	}
	
	public void view_bill() {
		System.out.println(customerName + ", your total bill is : Rs. " + totalBill);
	}
}


public class ProjectOOPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter customer name : ");
		String customerName = sc.next();
		char yn = 'y';
		
		Restro c1 = new Restro(customerName);
		
		
		System.out.println("\nHi " + customerName + ", what you would like to have?");
		
		while(yn == 'y') {
			System.out.println("\nCHOOSE YOUR ITEM : ");
			System.out.println("1. Butter Chicken");
			System.out.println("2. Paneer Tikka");
			System.out.println("3. Tandoori");
			System.out.print(">>>> ");
			int option = sc.nextInt();
			System.out.print("\nHow many plates do you want? : ");
			int qty = sc.nextInt();
			
			if(option == 1) {
				c1.add_item("Butter Chicken", qty);
			} else if(option == 2) {
				c1.add_item("Paneer Tikka", qty);
			} else if(option == 3) {
				c1.add_item("Tandoori", qty);
			}
			
			System.out.print("\nDo you want more? [y/N] : ");
			yn = sc.next().charAt(0);
		}
		
		System.out.println("\n\n");
		
		
		
		c1.view_bill();
	}
}
