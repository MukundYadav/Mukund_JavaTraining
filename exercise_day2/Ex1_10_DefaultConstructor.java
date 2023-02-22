package exercise_day2;

public class Ex1_10_DefaultConstructor {
	public static void main(String[] args) {
		ThirdClass obj=new ThirdClass();
	}
}
class FirstClass{
	FirstClass(){
		System.out.println("in class FirstClass");
	}
}
class SecondClass{
	SecondClass(){
		System.out.println("in class B");
	}
}
class ThirdClass extends FirstClass{
	SecondClass object=new SecondClass();
}
