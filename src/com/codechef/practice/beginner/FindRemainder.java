package com.codechef.practice.beginner;
import java.util.Scanner;
import java.io.IOException;
public class FindRemainder {

	public static void main(String args[]) throws IOException {
		Scanner scan = new Scanner(System.in);
		if(scan.hasNextInt()) {
			int t = scan.nextInt();
			for(int i = 0 ; i < t; i++) {
				int number1 = scan.nextInt();
				int number2 = scan.nextInt();
				System.out.println(findRemainder(number1, number2));


			}
		}
	}
	public static int findRemainder(int num1, int num2) {
		return num1%num2;
	}
}
