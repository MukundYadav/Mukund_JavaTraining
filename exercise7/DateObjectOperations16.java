package exercise7;

import java.io.*;
import java.util.Date;

public class DateObjectOperations16 {
	public static void main(String[] args) {
		try (ObjectOutputStream data = new ObjectOutputStream(
				new FileOutputStream("/Users/mukundyadav/Desktop/renamedFile/sourceFile.rtf"))) {
			Date date = new Date();
			data.writeObject(date);
			System.out.println("Date object is written to file...");
		} catch (IOException e) {
			System.err.println("Error writing date object to file: ");
		}

		try (ObjectInputStream input = new ObjectInputStream(
				new FileInputStream("/Users/mukundyadav/Desktop/renamedFile/sourceFile.rtf"))) {
			Date date = (Date) input.readObject();
			System.out.println("Date object read from file is : " + date);
		} catch (IOException | ClassNotFoundException e) {
			System.err.println("Error reading date object from file: " + e.getMessage());
		}
	}
}
