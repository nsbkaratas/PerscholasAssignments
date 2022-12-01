package org.perscholas;

public class JavaVariables {

	public static void main(String[] args) {
		// 303.1.2 - Practice Assignment Core Java - Variables

		
				/*
				 Write a program that declares 2 integer variables, 
				 assigns an integer to each, and adds them together.
				  Assign the sum to a variable. Print out the result.
				 */
				
				int numA;
				int numB;
				numA =3;
				numB =4;
				int result = numA+numB;
				System.out.println(result);
				//////////////////////////
				
				/*
				 Write a program that declares 2 double variables, 
				 assigns a number to each, and adds them together. 
				 Assign the sum to a variable. Print out the result.
				 */
				
				double A;
				double B;
				A=2.5;
				B = 3.5;
				double add = A+B;
				System.out.println(add);
				///////////////////////////
				
				/*
				 Write a program that declares an integer variable
				  and a double variable, assigns numbers to each, 
				  and adds them together. Assign the sum to a variable.
				  Print out the result. What variable type must the sum be?
				 */
				
				int intNum;
				double doubNum;
				doubNum=3.5;
				intNum=3;
				double sum = intNum + doubNum;
				System.out.println(sum);
				////////////////////////////
				
				/*
				 Write a program that declares 2 integer variables, 
				 assigns an integer to each, 
				 and divides the larger number by the smaller number. 
				 Assign the result to a variable. Print out the result. 
				 Now change the larger number to a decimal. 
				 What happens? What corrections are needed?
				 */
				
				int var1;
				int var2;
				//double var2=9.21; 
				var1=2;
				var2=9;
				int var3=var2/var1;
				System.out.println(var3);
				//If I change the large number to a decimal I need to change z data type to double. 
				///////////////////////
				
				/*
				 Write a program that declares 2 double variables, 
				 assigns a number to each, 
				 and divides the larger by the smaller.
				 Assign the result to a variable. Print out the result. 
				 Now, cast the result to an integer. Print out the result again.
				 */
				
				double num1;
				double num2;
				num1=2.3;
				num2=3.7;
				double res= num2/num1;
				System.out.println(res);
				System.out.println((int)res);
				//////////////////////////
				
				/*
				 Write a program that declares two integer variables, x, 
				 and y, and assigns 5 to x and 6 to y. 
				 Declare a variable q and assign y/x to it and print q. 
				 Now, cast y to a double and assign it to q. Print q again.
				 */
				
				int x;
				int y;
				x=5;
				y=6;
				//int q = y/x;
				double q = (double)y;
				System.out.println(q);
				///////////////////////////
				
				/*
				 Write a program that declares a named constant 
				 and uses it in a calculation. Print the result
				 */
				
				int c=4;
				System.out.println(2*c+5);
				/////////////////////////
				
				/*
				 Write a program where you create 3 variables that 
				 represent products at a cafe. 
				 The products could be beverages like coffee, 
				 cappuccino, espresso, green tea, etc. 
				 Assign prices to each product. 
				 Create 2 more variables called subtotal and 
				 totalSale and complete an “order” for 3 items of the first product,
				 4 items of the second product, and 2 items of the third product. 
				 Add them all together to calculate the subtotal. 
				 Create a constant called SALES_TAX and 
				 add sales tax to the subtotal to obtain the totalSale amount. 
				 Be sure to format the results to 2 decimal places
				 */
				
				double espresso=3.99;
				double hotChocolate=4.99;
				double cappuccino=5.99;
				double subTotal;
				double totalSale;
				subTotal = 3*espresso + 4*hotChocolate + 2*cappuccino;
				System.out.println(subTotal);
				double salesTax=0.06;
				
				totalSale = salesTax*subTotal +subTotal;
				System.out.printf("%.2f",totalSale);		
				

	}

}
