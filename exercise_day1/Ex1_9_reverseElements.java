package exercise_day1;

public class Ex1_9_reverseElements {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int n=arr.length;
		int start=0;
		int end=n-1;
		
		while(start<end)
		{
		int temp=arr[start]; 
		arr[start]=arr[end];  
		arr[end]=temp; 
		start++;
		end--;
		
		}
		
		
	
		System.out.println("reverse order is: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+ " ");
		}

}
}
