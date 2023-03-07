package exercise7;

import java.io.File;

public class DisplayFileSize10c {
	public static void main(String[] args) {
		File file = new File("/Users/mukundyadav/Documents/GitHub");
		long fileSize = file.length();
		System.out.println("The size of the file is " + fileSize + " Bytes");
	}
}

// OUTPUT

/*
 * The size of the file is 160 Bytes
 */