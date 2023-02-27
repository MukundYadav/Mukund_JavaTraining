package exercise2_day4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionExample1 {
	public static void main(String[] args) {
		IOExceptionClass a=new IOExceptionClass();
		a.TheMethod();
	}
   

}
class IOExceptionClass{
	public static void TheMethod() throws IOException{
		FileReader file = null ;
		try {
			file = new FileReader("test.txt");
		} catch (FileNotFoundException e) {
		}
		file.close();
		System.out.println("ok it's done");
	}
}

/* OUTPUT
 * 
 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Unhandled exception type IOException

	at exercise2_day4.IOExceptionExample.main(IOExceptionExample.java:10)
 * 
 * 
 */
