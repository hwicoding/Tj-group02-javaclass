package com.tj.grp2;

public class Remainder {

	public Remainder() {
		// TODO Auto-generated constructor stub
	}
	
	public void remainder(int num1, int num2, int num3) {
		int result1 = 0;
		int result2 = 0;
		String result = "";

		result1 = num1 % num3;
		result2 = num2 % num3;
		
		System.out.print("num1 % num3 : "+result1+" , num2 % num3 : "+result2);
	}
}