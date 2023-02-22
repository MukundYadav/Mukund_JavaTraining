package exercise_day1;

public class Ex1_17c_Constructor {
    public static void main(String[] args) {
		NewClass n = new NewClass();
		
		/* it will throw the error as follows
		 * 
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	       The constructor newClass() is undefined
	       at exercise_day1.Ex1_17c_Constructor.main(Ex1_17c_Constructor.java:5)
		 * 
		 */
	}
}
class NewClass{
	int x;
	NewClass(int n) {
		x=n;
	}
}