package exercise2_day4;
import java.util.Scanner;

public class SmallNumberExceptionExample5 {
	public static void main(String[] args) throws Exception{
		System.out.println("Enter any number...");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
			if(n<10)
				throw new SmallNumberException("The number is less than 10!");
			else
				System.out.println("Good number, I'm happy!");
	}

}
class SmallNumberException extends Exception{
	String msg;
	
	public SmallNumberException(String msg) {
		super(msg);
		this.msg = msg;
	}
}
/*
 * OUTPUT
 * 
 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Unhandled exception type Exception

	at exercise2_day4.Ex2_day4_5.main(Ex2_day4_5.java:8)
 * 
 */
	    
    
	    