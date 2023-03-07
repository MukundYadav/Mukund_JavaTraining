package exercise7;

import java.io.File;

public class RenameAFile10b {
	public static void main(String[] args) {
		File file = new File("/Users/mukundyadav/Desktop/fileToBeRenamed");
		String newFileName = "renamedFile";
		File renamedFile = new File(file.getParent(), newFileName);
		boolean isRenamed = file.renameTo(renamedFile);
		if (isRenamed) {
			System.out.println("File renamed successfully...");
		} else {
			System.out.println("Failed to rename the file...");
		}
	}
}

// OUTPUT
/*
 * File renamed successfully...
 */
