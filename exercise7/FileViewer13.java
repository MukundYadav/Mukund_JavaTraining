package exercise7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileViewer13 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("/Users/mukundyadav/Desktop/renamedFile/doc.rtf"))) {
			String content;
			while ((content = br.readLine()) != null) {
				System.out.println(content);
			}
		} catch (IOException e) {
			System.err.println("Error reading file: " + e.getMessage());
		}
	}
}
