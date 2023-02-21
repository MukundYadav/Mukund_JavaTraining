package exercise_day2;

public class Ex1_10_DefaultConstructor {
 public static void main(String[] args) {
	C obj=new C();
}
}
class A{
	A(){
		System.out.println("in class A");
	}
}
class B{
	B(){
		System.out.println("in class B");
	}
}
class C extends A{
	
	B object=new B();
}
