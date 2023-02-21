package exercise_day1;

public class Ex1_7_ascendngOrder {
	public static void main(String[] args) {  
		int[] arr = {1,10,3,8,2};  
		System.out.println("sorted elements are ");
		for (int i = 0; i < arr.length; i++)   
		{  
		    for (int j = i + 1; j < arr.length; j++)   
		       {  
		          
		          if (arr[i] > arr[j])   
		       {  
		        int temp = arr[i];  
		        arr[i] = arr[j];  
		        arr[j] = temp;  
		        }  
		}   
		    System.out.print(arr[i]+" "); 
		}
		 
		
		
	}

}
