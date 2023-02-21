package exercise_day1;

public class Ex1_11_patternPrint {
	public static void main(String[] args) {
		int mat[][]= {{1},{2,3},{4,5,6},{7,8,9,10}};
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.print(mat[i][j]+" ");
				
			}
			System.out.println();
		}

	}
}
