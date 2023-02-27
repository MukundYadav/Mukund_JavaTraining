package exercise2_day4;

import java.io.FileReader;

public class BaseClassException6 {
	public static void main(String[] args) throws Exception {
		DerivedClass t=new DerivedClass();
	}

}
class BaseClass  {
	
	BaseClass() throws Exception{
		FileReader file=new FileReader("textt.txt");
		file.close();
	}
	
	
	
	}
class DerivedClass extends BaseClass  {
	
	   DerivedClass() throws Exception{
		try {
			BaseClass cl1=new BaseClass();
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("its not calling");
		}
	}
}

/* OUTPUT
 * 
 *  Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Unhandled exception type Exception

	at exercise2_day4.DerivedClass.<init>(Ex2_day4_6.java:23)
	at exercise2_day4.Ex2_day4_6.main(Ex2_day4_6.java:7)
 * 
 */
