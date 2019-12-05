package com.codechef.arrays;

import java.util.Scanner;

public class COPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt(); //Number of test cases

		System.out.println("Number of TESTS: "+ T);

		for(int testCount = 0 ; testCount < T ; testCount++) {
			//System.out.println("testCount: "+ testCount);
			int M  = scan.nextInt(); //Number of houses in which police are residing.
			int X = scan.nextInt(); // Number of houses police can check per minute.
			int Y = scan.nextInt(); // Time for which houses can be checked by police.
			
			/*
			System.out.println("Number of houses in which police are residing.: "+ M);
			System.out.println("Number of houses police can check per minute: "+ X);
			System.out.println("Time for which houses can be checked by police: "+ Y);
			*/
		}
	}

}
