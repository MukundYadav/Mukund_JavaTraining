package exercise7;

import java.io.File;

public class ListDirectoriesAndFiles11 {
	public static void main(String[] args) {
		if(args.length==0) {
			System.out.println("you have not entered anything...");
			return;
		}
		else {
			String directory = args[0];
			File file = new File("/Users/mukundyadav/Documents/GitHub");
			if(!file.exists()) {
				System.out.println("there is no directory by the name you entered.");
				return;
			}
			if(!file.isDirectory()) {
				System.out.println("this is not the directory");
				return;
			}
			
			File [] fileArray = file.listFiles();	
			
			System.out.println("the list of files are....");
			for (File i :fileArray) {
				
				System.out.println(i);
			}
			}
		
	
		
	}
	}

