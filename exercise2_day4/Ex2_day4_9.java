package exercise2_day4;

import java.util.Scanner;

public class Ex2_day4_9 {
	public static void main(String[] args) {
	   int avg=0;
   
	   System.out.println("Please Enter the number marks of students");
	   Scanner sc=new Scanner(System.in);
	   try {
		   int sum=0;
		   for(int i=0;i<10;i++) {
			   String msg=sc.next();
			   int a= Integer.parseInt(msg);
			   if(a<0) {
				   throw new NegativeNumberException("you entered the negative marks pls re-check");
			   }
			   else if(a>100) {
				   throw new OutOfRangeException("the entered number is out of range...");
			   }
			   sum+=a;
		   }
		   double average=sum/10;
		   System.out.println("the average of ten students marks is : "+average);
	   }catch(NumberFormatException nfe) {
			   System.out.println("you have entered the invalid input,please enter the valid marks ");
	   }catch(NegativeNumberException nme) {
		   System.out.println(nme);
		   System.out.println("The negative number entered");
	   }catch(OutOfRangeException ore) {
		   System.out.println("pls enter the number in range of 0 and 100");
	   }
	   
	   System.out.println("this statement is to indicate that the program contines even after exception");
	}
}
class NegativeNumberException extends Exception{
	String msg;
	
	public NegativeNumberException(String msg) {
		super(msg);
		this.msg = msg;
	}
}
class OutOfRangeException extends Exception{
	String message;
	public OutOfRangeException(String message) {
		super(message);
		this.message=message; 
	}
}
