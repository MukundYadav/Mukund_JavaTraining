package exercise4_patterns;

public class SingletonPattern {
	private static SingletonPattern singleInstance = null;
	public String str;

	private SingletonPattern() {
		str = "the singleton class";
	}

	public static SingletonPattern returnInstance() {
		if (singleInstance == null)
			singleInstance = new SingletonPattern();
		return singleInstance;
	}

	public static void main(String[] args) {
		SingletonPattern single = SingletonPattern.returnInstance();
		SingletonPattern another = SingletonPattern.returnInstance();
		System.out.println("Hashcode of single is " + single.hashCode());
		System.out.println("Hashcode of another is " + another.hashCode());
	}
}
/*
 * OUTPUT
 * 
 * Hashcode of single is 1933863327 
 * Hashcode of another is 1933863327
 * 
 */
