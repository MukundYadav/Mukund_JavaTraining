package exercise_day1;

public class Ex1_17b_AcessStaticInNonStatic {
	
	static int c;
	
	public static void main(String[] args) {
		
		int i=8;
		Ex1_17b_AcessStaticInNonStatic obj=new Ex1_17b_AcessStaticInNonStatic();
		obj.NonStatic();
	}
	public void NonStatic(){
		c = 199;
		System.out.println(c);
	}
		
}