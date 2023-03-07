package exercise7;

import java.util.Scanner;

public class WordCount9 {
	public static void main(String[] args) {
		System.out.println("Enter the sentence...");
		Scanner scanner = new Scanner(System.in);
	    String input = scanner.nextLine();
	    
	    String arr[] = input.split(" ");
	    
	    System.out.println("There are "+arr.length + " Words are there in the sentence you entered.");
	    
	}
}
