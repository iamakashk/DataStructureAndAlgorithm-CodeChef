package com.codechef.practice.beginner;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author AKASH
 * code DIFFSUM
 */
public class SumOrDifference {

	public static void main(String args[]) throws IOException {
		Scanner scan = new Scanner(System.in);
		if(scan.hasNextInt()) {
			
			int firstNumber = scan.nextInt();
			int secondNumber = scan.nextInt();
			System.out.println(sumOrDifference(firstNumber, secondNumber));
		}
		
	}
	public static int sumOrDifference(int firstNum, int secondNum) {
		int result = 0;
		if(firstNum > secondNum) {
			result = firstNum - secondNum;
		}else {
			result = firstNum + secondNum;
		}
		return result;
	}
}
