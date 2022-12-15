package org.perscholas.practicesba;

import java.util.Scanner;

public class TypingExercise {

	public static void main(String[] args) throws MyException {
		TypingPractice type= new TypingPractice();
		type.typeABC();
		
}
}
class MyException extends Exception{
	String message;

	public MyException(String message) {
		super(message);
		this.message=message;
	}
	@Override
	public String toString() {
		return message;
	}
	
}
class TypingPractice{
	public void typeABC() throws MyException {
		Scanner scn = new Scanner(System.in);
		
		boolean loopAgain=true;
		while(loopAgain) {
		try {
			System.out.println("Enter your message");
			String message=scn.next();
			if (message.equals("abc")) {
				throw new MyException("incorrect input");
				
			}loopAgain=false;
			
		} catch (MyException e) {
			// TODO Auto-generated catch block
			System.out.println("Please enter something different!");
		}
		}
		System.out.println("Good job!");
		
	}
}