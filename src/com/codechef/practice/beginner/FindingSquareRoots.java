package com.codechef.practice.beginner;

import java.util.Scanner;
/**
 * @author AKASH
 * code FSQRT
 */
public class FindingSquareRoots {

	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		if(scan.hasNextInt()) {
		int t = scan.nextInt();
		for(int index = 1; index <= t; index++) {
			
				int i = scan.nextInt();
				System.out.println((int)Math.sqrt(i));
			}
		}
		
	}
}
