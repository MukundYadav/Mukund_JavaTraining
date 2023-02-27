package exercise2_day4;

import java.util.Scanner;

public class NumeratorDenominator7b {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		int result = 0;
		while(true) {
			System.out.println("enter the numerator and divisor: ");
			String numerator = sc.next();
			int divisor = sc.nextInt();
		    if( numerator.startsWith("q") || numerator.startsWith("Q")) {
		    	System.out.println("Quitting...");
		    	break;
		    }
			try {
			result = Integer.parseInt(numerator) / divisor;
			System.out.println("the result is : "+result);
			
			}
			catch(ArithmeticException e) {
				System.out.println("you are trying to divide a number by zero which is not possible, Pls enter the diviser other than 0 ");
			}
			catch(NumberFormatException k) {
				System.out.println("please enter the valid data:  ");
			}
			
			System.out.println("this is the statement to indicate that the loop continues running even after exception ");
			System.out.println();
		}
	}

}
