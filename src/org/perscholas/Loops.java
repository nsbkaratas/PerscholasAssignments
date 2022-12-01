package org.perscholas;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
	
	}
	public static void question1() {
		//Write a program that uses nested for loops to print a multiplication table.
		for (int i=1; i<=12; i++) {
			for (int j = 1; j <=12; j++) {
				System.out.print(i*j+" ");
			}
			System.out.println();
		}
	}
	public static void question2() {
		/*Write a program that prompts the user to enter two positive integers, 
		 * and find their greatest common divisor (GCD).
		 * Examples:
			Enter 2 and 4. The gcd is 2. 
			Enter 16 and 24.  The gcd is 8. 
			How do you find the gcd? 
			Name the two input integers n1 and n2. 
			You know number 1 is a common divisor, but it may not be the gcd. 
			Check whether k (for k = 2, 3, 4, and so on) is a common divisor for n1 and n2, 
			until k is greater than n1 or n2.
		 */
		
		System.out.println("Enter two positive integers: ");
		Scanner scn = new Scanner(System.in);
		int n1=scn.nextInt();
		int n2=scn.nextInt();
		int gcd = 0;
		for (int i=1; i<=n1 && i<= n2; i++) {
			
			if(n1%i==0 && n2%i==0) {
				gcd = i;
			}
		}
		System.out.println("the gcd is: " + gcd);
		scn.close();
	}
	public static void question3() {
		/*Suppose the tuition for a university is $10,000 for the current year 
		 * and increases by 7 percent every year. 
		 * In how many years will the tuition be doubled?
		 */
		double tution =10000;
		int years=0;
		while (tution<=20000) {
			tution*=1.07;
			years++;			
		}
		System.out.println(years);
		System.out.println(tution);
	}
}
