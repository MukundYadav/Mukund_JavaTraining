package exercise2_day4;

import java.io.FileReader;

public class Ex2_day4_1 {
	public static void main(String[] args) {
		IOExceptionClasss a=new IOExceptionClass();
		 a.TheMethod();
	}
   

}
class IOExceptionClass{
	public static void TheMethod(){
		FileReader file=new FileReader("test.txt");
		file.close();
		System.out.println("ok it's done");
	}
}

/* OUTPUT
 * 
 * Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	Unhandled exception type FileNotFoundException
	Unhandled exception type IOException

	at exercise2_day4.AnotherClass.TheMethod(Ex2_day4_1.java:15)
	at exercise2_day4.Ex2_day4_1.main(Ex2_day4_1.java:8)

 * 
 * 
 */
