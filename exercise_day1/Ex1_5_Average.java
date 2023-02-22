package exercise_day1;

public class Ex1_5_Average {
	public static void CalcAverage(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
			
		}
		double result=sum/(double)n;
		System.out.println("the average of "+n+ "numbers is "+result);
	}
	public static void main(String[] args) {
		CalcAverage(3);
		CalcAverage(4);
		CalcAverage(10);
	}
}
