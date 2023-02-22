package exercise_day1;

import java.util.Arrays;

public class Ex1_6_IncreaseArraySize {
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
		int newArray[]=Arrays.copyOf(arr, 10);
		newArray[5]=7;
		System.out.println(newArray[5]);
	}
}
