package exercise_day2;

public class Ex1_14_StudentResults {
	public static void main(String[] args) {
		Result re=new Result();
		
	    re.provideDetails(10, "lokesh");
	    re.Details(90,81,77);
        System.out.println("the result is: "+re.totalmark());
}
}
class Student{
	String name;
	int rollNo;
	Student(){
		name="null";
		rollNo=1;
	}
	
	public void provideDetails(int rollNo,String name)
	{
		this.name=name;
		this.rollNo=rollNo;
	}
	
	
}
class Exam extends Student{
	 int subject1;
	 int subject2;
	 int subject3;
	public void Details(int subject1,int subject2,int subject3) {
		this.subject1=subject1;
		this.subject2=subject2;
		this.subject3=subject3;
	}
	
}
class Result extends Exam{
	
	public int totalmark() {
		int res;
		res=this.subject1+this.subject2+this.subject3;
		
		return res;
	}
}

