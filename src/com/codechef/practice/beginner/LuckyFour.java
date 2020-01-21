package com.codechef.practice.beginner;

import java.util.Scanner;
/**
 * @author AKASH
 * code LUCKFOUR
 */
public class LuckyFour {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		if(scan.hasNextInt()) {
			int t = scan.nextInt();
			for(int i=0; i < t;i++) {
				int inputNumber = scan.nextInt();
				System.out.println(checkOccurance(inputNumber));
			}
		}
	}
	public static int checkOccurance(int number) {
		String numberString = String.valueOf(number);
		int count  = 0;
		while(number > 0) {
			int n  = number % 10;
			if(n == 4) {
				count++;
			}
			number  = number / 10;
		}
		return count;
	}
}
