package exercise4_patterns;
public class SingletonPattern {
	private static SingletonPattern single_instance = null;
	public String v;
	private SingletonPattern() {
		v="the singleton class";
	}
	public static SingletonPattern returnInstance() { 
		if(single_instance==null) 
			single_instance=new SingletonPattern();
		    return single_instance;
	}
	public static void main(String[] args) {
		SingletonPattern single=SingletonPattern.returnInstance();
		SingletonPattern another=SingletonPattern.returnInstance(); 
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
 
 

 

