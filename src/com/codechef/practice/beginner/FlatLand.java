package com.codechef.practice.beginner;
import java.util.Scanner;
import java.io.IOException;
import java.lang.Math;
/**
 * @author AKASH
 * code : ICL1902
 */
public class FlatLand {

	public static void main(String args[]) throws IOException{
		Scanner scan = new Scanner(System.in);
		if(scan.hasNextInt()){
			int t = scan.nextInt();
			for(int i = 0 ; i < t ; i++){
				int num = scan.nextInt();
				System.out.println(flatLand(num));
			}
		}
	}
	public static int flatLand(int num){

		int steps = 0;
		while(num > 0){

			int sqrt = (int) Math.sqrt(num);
			num -= (sqrt*sqrt);
			steps++;
		}
	return steps;
	}
}
