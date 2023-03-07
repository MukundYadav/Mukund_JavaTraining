package exercise7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileContents14 {
	public static void main(String[] args) {
		try (FileInputStream sourceFile = new FileInputStream("/Users/mukundyadav/Desktop/renamedFile/sourceFile.rtf");
				FileOutputStream destFile = new FileOutputStream("/Users/mukundyadav/Desktop/renamedFile/destinationFile.rtf")) {
			int data;
			while ((data = sourceFile.read()) != -1) {
				destFile.write(data);
			}
			System.out.println("File copied successfully.");
		} catch (IOException e) {
			System.err.println("Error copying file: ");
			System.out.println(e);
		}
	}
}
