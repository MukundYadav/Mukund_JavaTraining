package exercise_day1;

public class Ex1_19_ReverseElementsInEachRow {
public static void main(String[] args) {
	int a=3;
	int b=3;
	int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
for (int i = 0; i < a; i++) {
    int start = 0;
    int end = b - 1;
    while (start < end) {
        int temp = arr[i][start];
        arr[i][start] = arr[i][end];
        arr[i][end] = temp;
        start++;
        end--;
    }
}

for (int i = 0; i < a; i++) {
    for (int j = 0; j < b; j++) {
        System.out.print(arr[i][j] + " ");
    }
    System.out.println();
}
}
}

