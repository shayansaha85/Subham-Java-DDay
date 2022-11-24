package com.ds;

public class Dhukao {

	
	public static int[] dhukao(int[] arr, int index, int element) { // arr = [1,2,3], index = 1, element = 10, op = [1,10,2,3]
		int[] a = new int[arr.length+1];
		
		for(int i=0; i<=index-1; i++) {
			a[i] = arr[i];
		}
		
		a[index] = element;
		
		for(int i=index; i<arr.length; i++) {
			a[i+1] = arr[i];
		}
		
		
		return a;
		
	}
	public static void main(String[] args) {
		
		int[] arr = {55,96,76,52};
		int index = 2;
		int element = 1;
		
		int[] result = dhukao(arr, index, element);
		
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i] + " "); // OUTPUT ==> 55 96 1 76 52
		}
		
	}

}


