package com.codechef.practice.beginner;

import java.util.Scanner;
/**
 * @author AKASH
 * code SNCKYEAR
 */ 
public class ChefAndSnackDown {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int[] hostedYears = {2010, 2015, 2016, 2017, 2019};
		if(scan.hasNextInt()) {
			int testCases = scan.nextInt();
			int[] inputArray = new int[testCases];
			for(int index = 0 ; index < inputArray.length; index++) {
				inputArray[index] = scan.nextInt();
			}
			for(int index = 0 ; index < inputArray.length; index++) {
				if(isSnackDownHosted(hostedYears, inputArray[index])) {
					System.out.println("HOSTED");
				}else {
					System.out.println("NOT HOSTED");
				}
			}
		}
		 	
	}
	public static boolean isSnackDownHosted(int arr[], int value) {
		boolean isSnackDownHosted = false;
		for(int index = 0 ; index < arr.length; index++) {
			if(arr[index] == value) {
				isSnackDownHosted = true;
			}
		}
		return isSnackDownHosted;
	}
}
