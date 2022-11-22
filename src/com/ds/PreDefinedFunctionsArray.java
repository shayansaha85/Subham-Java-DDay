package com.ds;

import java.util.Arrays;

public class PreDefinedFunctionsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {2,6,8,7,11,23,56,54,89,30};
	
		Arrays.sort(numbers);
		
		int min = numbers[0];
		int max = numbers[numbers.length-1];
		
		System.out.println("MIN : " + min + "\nMAX : " + max);
		
	}

}
