package com.ds;

public class ReversingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5};
		int[] rev_arr = new int[arr.length];
		
//		for(int i = arr.length-1; i>=0; i--) {
//			
//		}
		
		int i = arr.length-1;
		int k=0;
		
		while(i>=0) {
			rev_arr[k] = arr[i];
			k++;
			i--;
		}
		
		for(int j=0; j<rev_arr.length; j++) {
			System.out.println(rev_arr[j]);
		}
	}
}
