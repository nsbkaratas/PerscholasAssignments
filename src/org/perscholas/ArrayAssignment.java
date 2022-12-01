package org.perscholas;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAssignment {

	public static void main(String[] args) {
//		question1();
//		question2();
//		question3();
//		question4();
//		question5();
//		question6();
//		question7();
//		question8();
//		question9();
//		question10();
//		question11();
		question12();
	}
	public static void question1() {
		/*Write a program that creates an array of integers with a length of 3. 
		 * Assign the values 1, 2, and 3 to the indexes. Print out each array element.
		 */
		
		int[] arr = new int[3];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
	}
	
	public static void question2() {
		 /*Write a program that returns the middle element in an array. 
		 * Give the following values to the integer array: {13, 5, 7, 68, 2} 
		 * and produce the following output: 7
		 */
		int[] arr1= {13, 5, 7, 68, 2};
		System.out.println(arr1[arr1.length/2]);
	}
	public static void question3() {
		//ask
		/*Write a program that creates an array of String type and initializes it with the strings 
		 * “red”, “green”, “blue” and “yellow”. Print out the array length.
		 * Make a copy using the clone( ) method. Use the Arrays.toString( ) method on the 
		 * new array to verify that the original array was copied.
		 */
		
		String[] arr2 = {"red", "green", "blue", "yellow"};
		System.out.println(arr2.length);
		String[] arr3=arr2.clone();
		System.out.println(Arrays.toString(arr3));
	}
	
	public static void question4() {
		/*Write a program that creates an integer array with 5 elements (i.e., numbers). 
		 * The numbers can be any integers.  Print out the value at the first index and 
		 * the last index using length - 1 as the index. 
		 * Now try printing the value at index = length ( e.g., myArray[myArray.length ] ).  
		 * Notice the type of exception which is produced. Now try to assign a value to the array index 5. 
		 * You should get the same type of exception.
		 */
		int[] arr4= {2,4,29,43,21};
		System.out.printf("First index is %d and the last index is %d", arr4[0],arr4[arr4.length-1]);
		//System.out.println(arr4[arr4.length]);
		//arr4[5]=44;
		//System.out.println(arr4[arr4.length]);
		System.out.println();
	}		
	
	public static void question5() {
		/*Write a program where you create an integer array with a length of 5. 
		 * Loop through the array and assign the value of the loop control variable (e.g., i)
		 * to the corresponding index in the array.
		 */
		
		int[] arr5= {2,4,29,43,21};
		for (int i = 0; i < arr5.length; i++) {
			arr5[i]=i;
			System.out.print(arr5[i]+" ");
		}
		System.out.println();
	}
	
	public static void question6() {
		/*Write a program where you create an integer array of 5 numbers. 
		 * Loop through the array and assign the value of the loop control variable multiplied by 
		 * 2 to the corresponding index in the array.
		 */
		int[] arr6= {2,4,29,43,21};
		for (int i = 0; i < arr6.length; i++) {
			arr6[i]=2*i;
			System.out.print(arr6[i]+" ");
		}
		System.out.println();
	}
	public static void question7() {
		/*Write a program where you create an array of 5 elements. 
		 * Loop through the array and print the value of each element, 
		 * except for the middle (index 2) element.
		 */
		int[] arr7= {2,4,29,43,21};
		for (int i = 0; i < arr7.length; i++) {			
			if (i==arr7.length/2) {
				continue;
			}
			System.out.print(arr7[i]+" ");
		}
		System.out.println();
	}
	public static void question8() {
		/*Write a program that creates a String array of 5 elements and 
		 * swaps the first element with the middle element without creating a new array.
		 */
		
		
		int[] arr8= {2,4,29,43,21};
		//swaping logic
		int t=arr8[0];
		arr8[0]=arr8[arr8.length/2];
		arr8[arr8.length/2]=t;
		
		for (int i = 0; i < arr8.length; i++) {
			System.out.print(arr8[i]+ " ");
		}
		System.out.println();
	}
	public static void question9() {
		/*Write a program that creates a String array of 5 elements and 
		 * swaps the first element with the middle element without creating a new array.
		 */
		
		
		int[] arr8= {2,4,29,43,21};
		//swaping logic
		int t=arr8[0];
		arr8[0]=arr8[arr8.length/2];
		arr8[arr8.length/2]=t;
		
		for (int i = 0; i < arr8.length; i++) {
			System.out.print(arr8[i]+ " ");
		}
		System.out.println();
	}
	
	public static void question10() {
		 /*Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}. 
		 * Print the array in ascending order, and print the smallest and the largest element of the array. 
		 * The output will look like the following:
		 * Array in ascending order: 0, 1, 2, 4, 9, 13
		 * The smallest number is 0
		 * The biggest number is 13
		 */
		
		int[] arr9 = {4, 2, 9, 13, 1, 0};
		for(int i=0; i<arr9.length; i++) {
			for (int j = 0; j < arr9.length; j++) {
				if (arr9[i]< arr9[j]) {
					int temp=arr9[i];
					arr9[i]=arr9[j];
					arr9[j]=temp;
				}				
			}
		}
		for (int i = 0; i < arr9.length; i++) {
			System.out.print(arr9[i]+ " ");
		}
		System.out.println();
	}
	 
	public static void question11() {
		//		Create an array that includes an integer, 3 strings, and 1 double. Print the array.
	}
	
	public static void question12() {
		/*Write some Java code that asks the user how many favorite things they have. 
		 * Based on their answer, you should create a String array of the correct size. 
		 * Then ask the user to enter the things and store them in the array you created. 
		 * Finally, print out the contents of the array.
		 */
//			Example
//
//			How many favorite things do you have?
//			7
//
//			Enter your thing: phone
//			Enter your thing: tv
//			Enter your thing: xbox
//			Enter your thing: wine
//			Enter your thing: beer
//			Enter your thing: sofa
//			Enter your thing: book
//			Your favorite  things are:
//			phone tv xbox wine beer sofa book
		
		Scanner scn = new Scanner(System.in);
		System.out.println("How many favorite things do you have?");
		int favCount=scn.nextInt();
		String[] array = new String[favCount];
		System.out.println(array.length);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter your thing: ");
			String favThing= scn.next();
			array[i]=favThing;
		}
		System.out.println("Your favorite things are: ");
//		for (int i = 0; i < array.length; i++) {
//			System.out.print(array[i]+ " ");
//		}
		
		for(String fav:array) {
			System.out.println(fav+" ");
		}
		scn.close();
	}
	

}
