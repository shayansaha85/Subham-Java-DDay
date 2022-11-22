package com.ds;

public class PrintOnlyPrimeNumbersFromArray {
	
	public static boolean isPrime(int n) {
		int c = 0;
		for(int i=2;i<n/2;i++) {
			if(n%i == 0) {
				c++;
			}
		}
		if(c==0) {
			return true;
		} else {
			return false;
		}
 	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {2,6,8,7,11,23,56,54,89,30};
		
		for(int i=0; i<numbers.length; i++) {
			if(isPrime(numbers[i])) {
				System.out.println(numbers[i]);
			}
		}
	}

}
