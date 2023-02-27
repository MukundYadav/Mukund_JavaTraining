package exercise2_day4;

import java.util.Scanner;

public class NegativeAndOutOfRange9 {
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
				if (marks < 0) {
					throw new NegativeNumberException("you entered the negative marks pls re-check");
				} else if (marks > 100) {
					throw new OutOfRangeException("the entered number is out of range...");
				}
				count++;
				sum += marks;
			} catch (NumberFormatException nfe) {
				System.out.println("you have entered the invalid input,please enter the valid marks ");
			} catch (NegativeNumberException nme) {
				System.out.println(nme);
				System.out.println("The negative number entered");
			} catch (OutOfRangeException ore) {
				System.out.println("pls enter the number in range of 0 and 100");
			}
		}
		double average = sum / 10;
		System.out.println("the average of ten students marks is : " + average);
	}
}

class NegativeNumberException extends Exception {
	public NegativeNumberException(String msg) {
		super(msg);
	}
}

class OutOfRangeException extends Exception {
	public OutOfRangeException(String message) {
		super(message);
	}
}
