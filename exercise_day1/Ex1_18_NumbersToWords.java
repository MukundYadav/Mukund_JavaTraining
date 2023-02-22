package exercise_day1;

import java.util.Scanner;

public class Ex1_18_NumbersToWords {
	public static void main(String[] args) {
		String arr[]= {"zero","one","two","three","four","five","six","seven","eight","nine"};
		System.out.println("Enter any number...");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		String s=String.valueOf(num);
		System.out.println("the converted number to words is...  ");
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='0') System.out.print(arr[0]+" ");
			if(c=='1') System.out.print(arr[1]+" ");
			if(c=='2') System.out.print(arr[2]+" ");
			if(c=='3') System.out.print(arr[3]+" ");
			if(c=='4') System.out.print(arr[4]+" ");
			if(c=='5') System.out.print(arr[5]+" ");
			if(c=='6') System.out.print(arr[6]+" ");
			if(c=='7') System.out.print(arr[7]+" ");
			if(c=='8') System.out.print(arr[8]+" ");
			if(c=='9') System.out.print(arr[9]+" ");
		}
	}
}
