package exercise2_day4;

import java.util.Scanner;

public class Ex2_day4_8 {
	public static void main(String[] args) {
	   int avg=0;
   
	   System.out.println("Please Enter the number marks of students");
	   Scanner sc=new Scanner(System.in);
	   try {
		   int sum=0;
		   for(int i=0;i<10;i++) {
			   String msg=sc.next();
			   sum += Integer.parseInt(msg);
		   }
		   double average=sum/10;
		   System.out.println("the average of ten students marks is : "+average);
	   }catch(NumberFormatException nfe) {
			   System.out.println("you have entered the invalid input,please enter the valid marks ");
	   }
	   
	   System.out.println("this statement is to indicate that the program contines even after exception");
   }
}

