package com.codechef.practice.beginner;

import java.io.*;
import java.util.Scanner;

/**
 * @author AKASH
 * code DECINC
 */
public class DecrementOrIncrement {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String args[]) throws IOException {
		// your code goes her
		Scanner scan = new Scanner(System.in);
		int number = 0;
		if (scan.hasNextInt()) {
			number = scan.nextInt();
		}

		incrementOrDecrement(number);
	}

	/**
	 * @param number
	 * increments by 1 if number is divisible by 4 
	 * else decrements by 1
	 */
	public static void incrementOrDecrement(int number) {
		if (number % 4 == 0) {
			number++;
		} else {
			number--;
		}
		System.out.println(number);
	}
}
