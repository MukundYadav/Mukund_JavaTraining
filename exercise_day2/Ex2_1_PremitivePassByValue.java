package exercise_day2;

public class Ex2_1_PremitivePassByValue {
	
	int b=20;
	public static void main(String[] args) {
		int a=15;
		
		System.out.println("before calling the method the value of a is: "+a);
		changeValue(a);
		System.out.println("the value of a after calling the value : "+a);
		//we can observe that the value of variable is not changed
		
		int[] array= {11,23,13};
		System.out.println("before calling the method the first element of the array is : "+array[0]  );
		passByReference(array);
		System.out.println("after calling the method the first element of the array is : "+array[0]  );
		
		//for obj
		Ex2_1_PremitivePassByValue ex=new Ex2_1_PremitivePassByValue();
		System.out.println("before calling the obj the the value of b is : "+ex.b );
		obj(ex);
		System.out.println("after calling the obj the the value of b is : "+ex.b );
		
	}
	
	
	static void changeValue(int n) {
		System.out.println("inside changeValue before changing "+n);
		n=n+1;
		System.out.println("inside method after changing the value"+n);
	}
	
	//for pass by reference of an array demo
	public static void passByReference(int [] arr) {
		System.out.println("inside the method before changing the value the first element is : "+arr[0]);
		arr[0]=90;
		System.out.println("inside the method after changing the value the first element is : "+arr[0]);
	}
	
	//for object
	public static void obj(Ex2_1_PremitivePassByValue e) {
		e.b=15;
		
	}
	//hence object is passed by reference

}
