package exercise2_day4;

import java.util.Scanner;

public class NumberFormatExceptionExample8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int marks = 0;
		int sum = 0;
		int count = 1;

		while (count <= 10) {
			try {
				System.out.println("Enter marks of student " + count);
				marks = Integer.parseInt(sc.nextLine());
				sum += marks;
				count++;
			} catch (NumberFormatException nfe) {
				System.out.println("Invalid input!. please enter an integer number.");

			}
		}
		double average = sum / 10;
		System.out.println("the average of ten students marks is : " + average);
		sc.close();
	}
}
