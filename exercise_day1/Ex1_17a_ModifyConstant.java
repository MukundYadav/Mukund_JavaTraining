package exercise_day1;

public class Ex1_17a_ModifyConstant {
	public static void main(String[] args) {
		final double pi=3.142;
		System.out.println("before modifying the value of pi is : "+pi);
		
		pi=pi+1; 
		//this will give error because final values are non modifiable
		/* the error is as follows
		 * 
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The final local variable pi cannot be assigned. It must be blank and not using a compound assignment

	at exercise_day1.Ex1_17a_ModifyConstant.main(Ex1_17a_ModifyConstant.java:8)

		 * 
		 */
		
		
	}

}
