package com.codechef.practice.beginner;
import java.util.Scanner;
import java.lang.*;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;

/**
 * @author AKASH
 * code MATCHES
 */
public class PlayingWithMatches {

	public static void main(String args[]) throws IOException{
		Scanner scan = new Scanner(System.in);
		if(scan.hasNextInt()){
			int t = scan.nextInt();
			for(int i  = 1; i <=t ; i++){
				int num1 = scan.nextInt();
				int num2 = scan.nextInt();
				System.out.println(getNumberOfMatches(num1+num2));
			}
		}
	}
	public static int getNumberOfMatches(int num){

		Map<Integer, Integer> map = new HashMap<>();
		map.put(0,6);
		map.put(1, 2);
		map.put(2,5);
		map.put(3,5);
		map.put(4,4);
		map.put(5,5);
		map.put(6,6);
		map.put(7,3);
		map.put(8,7);
		map.put(9,6);
//		System.out.println(map);

		int count = 0;
		while(num >0){

			int i = num %10;
			count += map.get(i);
			num = num/10;
		}
		return count;
	}
}
