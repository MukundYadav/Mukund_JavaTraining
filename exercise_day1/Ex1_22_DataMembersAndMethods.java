package exercise_day1;

public class Ex1_22_DataMembersAndMethods {
public static void main(String[] args) {
	Datamembers data=new Datamembers();
	data.method1();
	data.method2();
	data.method3();
}
static class Datamembers{
	//default int d;
	public  String name;
	private int n;
	protected int c;
	public void method1(){
		System.out.println("okkk");
		name="cd";
		System.out.println(name);
	}
	private void method2() {
		System.out.println("done");
	}
	protected void method3() {
		System.out.println("NotOk");
	}
	/* got error as " default methods are only allowed in interfaces"
	 * default void okNo() {
	 * System.out.println("NotOk");
	*/	
	}
}
	



