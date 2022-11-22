package com.ds;

public class CountOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input1 = {5,6,3,2,3,1,4,5,8,6,3};
		int input2 = 6;
		
		int count = 0;
		
		for(int i=0; i<input1.length; i++) {
			if(input1[i] == input2) {
				count++;
			}
		}
		
		System.out.println("There are " + count + " " + input2 + "(s) in the array");
 
	}	

}
