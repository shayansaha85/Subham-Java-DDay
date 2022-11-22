package com.ds;

public class ArrayMaximumElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {2,6,8,7,11,23,56,54,89,30};
		int max = 0;
		
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println("Maximum element : " + max);
	}
}
