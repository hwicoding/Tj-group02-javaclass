package com.tj.grp2;

public class Remainder {

	public Remainder() {
		// TODO Auto-generated constructor stub
	}
	
	public int[] remainder(int num1, int num2, int num3) {
		int result1 = 0;
		int result2 = 0;
		int[] arr = new int[2];
		
		arr[0] = num1 % num3;
		arr[1] = num2 % num3;

		return arr;
	}
}