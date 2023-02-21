package exercise_day1;

/* This is the program for printing the average of two numbers
 * we just have to find the sum of n numbers and then divide the result from n
 */

public class Ex1_14a_CommentDocumentation {
	
	/*in main function we will call all the methods
	 * @param args is the argument we have used
	 */
   public static void main(String[] args) {
	int k=10;
	System.out.println(Average(k));
	
}  
 /*here we are defining the function for Average
  * @param n we have used
  */
public static double Average(int n){
	
	int sum=0;
	for(int i=1;i<=n;i++) {
		sum+=i;
	}
	double avg=sum/(double)n;
	return avg;}
}
