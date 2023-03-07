package exercise7;

import java.io.File;

public class DeleteAFile10a {
	public static void main(String[] args) {
		File file = new File("/Users/mukundyadav/Desktop/fileToDelete");
		boolean isDeleted = file.delete();
		if (isDeleted) {
			System.out.println("file deleted successfully..");
		} else {
			System.out.println("failed to delete, check whether the file exists or not...");
		}
	}
}

// OUTPUT
/*
 * file deleted successfully..
 */
