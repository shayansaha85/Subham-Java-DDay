package com.ds;

public class FindCountList {
	
	public static int findCountInArray(int i1, int[] i2) {
		int c = 0;
		for(int i=0; i<i2.length; i++) {
			if(i2[i] == i1) {
				c++;
			}
		}
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1,3,2,3,6,5,2,12,3,2,3,1,1,13};
		int[] dist = new int[numbers.length];

		
		dist[0] = numbers[1];
		int k=1;
		for(int i=0; i<numbers.length; i++) {
			
			if(findCountInArray(numbers[i], dist) == 0) {
				dist[k] = numbers[i];
				k++;
			}
			
		}
		int[] distinct_elements = new int[k];
		
		for(int i=0; i<k; i++) {
			distinct_elements[i] = dist[i];
		}
		
		for(int i=0; i<k; i++) {
			System.out.println(distinct_elements[i]);
		}
	}

}
