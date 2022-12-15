package org.perscholas.practicesba;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchSba {

	public static void main(String[] args) {
		divide();

	}
	static void divide() {
		Scanner scn= new Scanner(System.in);
		
		boolean loopAgain = true;
		while(loopAgain) {
			
			try {				
				System.out.println("enter an integer:");
				int num1 = scn.nextInt();
				System.out.println("enter another integer:");
				int num2 = scn.nextInt();
				int division = num1/num2;
				
			System.out.println(division);
			loopAgain = false;
			}catch (ArithmeticException | InputMismatchException e) {
				if(e instanceof ArithmeticException) {
					System.out.println("Please do not use zero.");
					
				}else if(e instanceof InputMismatchException) {
					System.out.println("Please only use integers");
					scn.nextLine();
				}
			}
		}
		
		System.out.println("Done!!");
		scn.close();
	}
	
}

