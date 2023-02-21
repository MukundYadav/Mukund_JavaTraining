package exercise_day1;

import java.util.Scanner;

public class Ex1_16_SearchElementAndCount {
	public static void main(String[] args) {
		int arr[]= {1,2,2,2,34,53,24,35,6,7,98};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element to be searched : ");
		int n=sc.nextInt();
		int count=0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==n)
			{
				count++;
				if(count==1){
					System.out.println("the element is pressent at the index "+i);
				}
			}
			
		}
		sc.close();
		System.out.println("the count is "+count);
	}

}
