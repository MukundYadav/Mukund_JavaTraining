package exercise7;

import java.io.*;

public class LineByLineCopy15 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("/Users/mukundyadav/Desktop/renamedFile/sourceFile.rtf"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/mukundyadav/Desktop/renamedFile/destinationFile.rtf"))) {
			String dataLine;
			while ((dataLine = br.readLine()) != null) {
				bw.write(dataLine);
				bw.newLine();
			}
			System.out.println("File copied successfully...");
		} catch (IOException e) {
			System.err.println("Error while copying file.... ");
		}
	}
}
