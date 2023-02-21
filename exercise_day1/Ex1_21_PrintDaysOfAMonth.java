package exercise_day1;

import java.util.Scanner;

public class Ex1_21_PrintDaysOfAMonth {
	public static void main(String[] args) {
		System.out.println("enter the month and the year: ");
		Scanner scanner=new Scanner(System.in);
		String s=scanner.next();
		int n=scanner.nextInt();
		switch(s) {
		case "jan": System.out.println("31 days in jan"); break;
		case "feb": {
			if(n%400==0)
			{
				System.out.println("29 days therefore leap year");
				break;
				} 
			else if(n%4==0)
			{
				System.out.println("29 days therefore leap year");
				break;
				}
				
			
		    else {System.out.println("28 days in Feb therefore not a leap year"); break;}
		}
		case "march": System.out.println("31 days in march"); break;
		case "april": System.out.println("30 days in april"); break;
		case "may": System.out.println("31 days in may"); break;
		case "jun": System.out.println("30 days in june"); break;
		case "jul": System.out.println("31 days in july"); break;
		case "aug": System.out.println("31 days in august"); break;
		case "sep": System.out.println("30 days in september"); break;
		case "oct": System.out.println("31 days in october"); break;
		case "nov": System.out.println("30 days in november"); break;
		case "dec": System.out.println("31 days in december"); break;
		}
		scanner.close();
		}
	}


