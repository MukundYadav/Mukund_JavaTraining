package exercise_day1;

public class Ex1_20_LargestInEachRow {
	
public static void main(String[] args) {
	int arr[][]= {{1,2,12,3},{2,5,10,34},{19,8,56,44}};
	for(int i=0;i<arr.length;i++) {
		int large=0;
		for(int j=0;j<arr[i].length;j++)
		{
			if(arr[i][j]>large)
			{
				large=arr[i][j];
			}
		}
		System.out.println(large);
	}
}
}
