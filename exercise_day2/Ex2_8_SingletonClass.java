package exercise_day2;

public class Ex2_8_SingletonClass {
	private static Ex2_8_SingletonClass single_instance = null;
	public String v;
	private Ex2_8_SingletonClass() {
		v="the singleton class";
	}
	public static Ex2_8_SingletonClass returnInstance() { 
		if(single_instance==null) 
			single_instance=new Ex2_8_SingletonClass();
		    return single_instance;
	}
	public static void main(String[] args) {
		Ex2_8_SingletonClass single=Ex2_8_SingletonClass.returnInstance();
		Ex2_8_SingletonClass another=Ex2_8_SingletonClass.returnInstance(); 
		System.out.println("Hashcode of single is "+ single.hashCode());
		System.out.println("Hashcode of another is "+ another.hashCode());
		}
}
/* OUTPUT
 *  
 *  Hashcode of single is 1933863327
    Hashcode of another is 1933863327
 * 
 */
 
 

 
