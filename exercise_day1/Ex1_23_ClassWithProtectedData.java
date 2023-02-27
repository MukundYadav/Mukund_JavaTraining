package exercise_day1;

public class Ex1_23_ClassWithProtectedData {
 
}
class WithProtected{
	protected int a=8;
}
class SecondClass{
	public static void TheMethod(int n) {
		WithProtected w = new WithProtected();
		w.a = 100;
	}
}