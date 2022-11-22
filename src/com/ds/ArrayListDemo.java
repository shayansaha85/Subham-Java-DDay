package com.ds;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(5);
		arr.add(6);
		arr.add(7);
		arr.add(8);
		

		// for each loop
		arr.add(arr.indexOf(7), 9);
		System.out.println(arr);
	}

}

/*
dhukaooo(arr, index, element)

arr = {5,3,2,1};
dhukaoo(arr, 2, 10)

output : {5,3,10,2,1}
*/