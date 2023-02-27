package exercise2_day4;
import java.util.Scanner;

public class NumberExceptinExample4 {
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		try {
			if(n<10) {
				throw new NumberException("The number is less than 10!");
			}
			else {
				System.out.println("Good number, I'm soo happy!");
			}
		} catch (NumberException e) {
			System.out.println(e);
			System.out.println();
			System.out.println("you have entered very small number !.");
		}
	}
}
class NumberException extends Exception{
	//String msg;
	NumberException(String msg) {
		super(msg);
		//this.msg = msg;
	}
}
