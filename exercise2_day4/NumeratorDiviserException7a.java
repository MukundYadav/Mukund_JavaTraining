package exercise2_day4;

import java.util.Scanner;

public class NumeratorDiviserException7a {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		while (true) {
			System.out.println("enter the numerator and divisor: ");
			String numerator = sc.next();
			int divisor = sc.nextInt();
			try {
				result = Integer.parseInt(numerator) / divisor;
				System.out.println("the result is : " + result);

			} catch (ArithmeticException e) {
				System.out.println(
						"you are trying to divide a number by zero which is not possible, Pls enter the diviser other than 0 ");
			} catch (IllegalArgumentException k) {
				System.out.println("please enter the valid numerator :  ");
			}
			System.out.println();
		}
	}
}
