package exercise_day1;

import java.util.Scanner;

public class Ex1_15b_AmstromgPerfectPalindrome {
	public static void main(String[] args) {
		System.out.println("Enter the number.. ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		isAmstrong(num);
		isPerfect(num);
		isPalindrome(num);
		
	}
	public static void isAmstrong(int n){
		int digit,sum=0,count=0;
		int g=n;
		while(g!=0)
		 {
			 g=g/10;
			 count++;
		 }
		 g=n;
		 while(g!=0) {
			 digit=g%10;
			 sum+=(Math.pow(digit, count));
			 g=g/10;
		 }
		 if(sum==n)
		 {System.out.println(n+" is an amstrong number");}
		 else {
			 System.out.println(n+" is not an amstrong number");
		 } 
	}
	
	public static void isPerfect(int n) {
		int sum=0;
		 
			 
		for(int i=1;i<n;i++) {
			if(n%i==0)
			 {
				 sum+=i;
			 }
		}
		if(sum==n) {
			System.out.println(n+" is a perfect number");
		}
		else {
			System.out.println(n+" is not a perfect number");
		}
	}
	 
	public static void isPalindrome(int k ) {
		int d,sum=0;
		int n=k;
		while(n!=0) {
			d=n%10;
			sum=(sum*10)+d;
			n=n/10;
		}
		if(sum==k)
		{
			System.out.println(k+" is a palindromic number");
		}
		else {
			System.out.println(k+" is not a palindromic number");
		}
	}
}
