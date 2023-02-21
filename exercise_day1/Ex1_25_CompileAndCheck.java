package exercise_day1;

public class Ex1_25_CompileAndCheck {

	protected class base{
		String Method() {
			return "Wow";
		}
		
	}
	class derived{
		public void useD() {
			base z=new base();
			System.out.println("base says," +z.Method());
		}
	}

}
