package exercise_day1;
import java.util.*;

public class Ex1_13_StudentResult {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of students:");
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			System.out.println("enter the marks of student "+(i+1));
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		//to print the marks
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
				}
			System.out.println();
		}
		//to calculate the result	
		for(int i=0;i<arr.length;i++) {
			int result=0;
			for(int j=0;j<arr[i].length;j++) {
				result+=arr[i][j];
			}
			System.out.println("result of student "+(i+1)+" is "+result);
		}
	}
}
