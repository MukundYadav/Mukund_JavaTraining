package exercise_day1;

public class Ex1_8_LocationOfElement {
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7};
		int element=7;
		for(int i=0;i<arr.length;i++) {
			if (arr[i]==element) {
		System.out.println("index of "+element+ " in the array is: "+i);
		}
	}
  }
}		
			