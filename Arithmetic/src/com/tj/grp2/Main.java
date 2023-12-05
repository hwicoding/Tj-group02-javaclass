package com.tj.grp2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		Add add = new Add();
		Subtraction sub = new Subtraction();
		Multi mul = new Multi();
		Division div = new Division();		
		Remainder rem = new Remainder();
		
		int firstNum, secondNum, thirdNum,
		    sum, subtraction, multi, devision = 0;
		int[] remainder = new int[2];
		
		System.out.println("*** 2조 프로젝트 ***");
		
		System.out.print("첫 번째 숫자를 입력하세요 : ");
		firstNum = scanner.nextInt();
		
		System.out.print("두 번째 숫자를 입력하세요 : ");
		secondNum = scanner.nextInt();
		
		System.out.print("세 번째 숫자를 입력하세요 : ");
		thirdNum = scanner.nextInt();

		
		sum = add.addCalculator(firstNum, secondNum, thirdNum);
		subtraction = sub.subCalculator(firstNum, secondNum, thirdNum);
		multi = mul.multiCalc(firstNum, secondNum, thirdNum);
		devision = div.division(firstNum, secondNum, thirdNum);
		remainder = rem.remainder(firstNum, secondNum, thirdNum);
		
		
		System.out.println("3개의 숫자의 합 : " + sum);
		System.out.println("3개의 숫자의 차 : " + subtraction);
		System.out.println("3개의 숫자의 곱 : " + multi);
		System.out.println("3개의 숫자의 몫 : " + devision);
		System.out.print("3개의 숫자의 중 "+ "\n"+ "숫자 " + firstNum + " /" + " 숫자 " + thirdNum + "의 나머지는 "+ remainder[0] + "\n" + 
						 "숫자 " + secondNum + " /" + " 숫자 " + thirdNum + "의 나머지는 " + remainder[1]);
		
		
		//rem.remainder(firstNum, secondNum, thirdNum);
			
		
		
		
	}

}
