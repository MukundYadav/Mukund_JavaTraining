package exercise_day1;

public class Ex1_10_MatrixPrint {
	public static void main(String[] args) {
		int k=0;
		int mat[][]= new int[4][4];//{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				mat[i][j]=++k;
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
}
