package exercise_day1;

public class Ex1_25_CompileAndCheck {
	protected class Base{
		String Method() {
			return "Wow";
		}	
	}
	class DerivedClass{
		public void useD() {
			Base z=new Base();
			System.out.println("base says," +z.Method());
		}
	}
}
