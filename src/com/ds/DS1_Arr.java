package com.ds;

public class DS1_Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		int[] ar = new int[5];
		@SuppressWarnings("unused")
		String[] ar1 = new String[5];
		
		int[] evens = {2,4,6,8,10};
		
		int sum = 0;
		int length = evens.length;
		for(int i=0; i<length; i++) {
			sum = sum + evens[i];
		}
		
		System.out.println(sum);
		
	}

}
