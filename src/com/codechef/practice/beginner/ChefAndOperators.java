package com.codechef.practice.beginner;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author AKASH
 * code CHOPRT
 */
public class ChefAndOperators {

	public static void main(String args[]) throws NumberFormatException, IOException {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0)
		{
		    long a = in.nextLong();
		    long b = in.nextLong();
		    
		    if(a>b)
		    {
		        System.out.println(">");
		    }
		    else if(a<b)
		    {
		        System.out.println("<");
		    }
		    else
		    {
		        System.out.println("=");
		    }
		}
	}

}
