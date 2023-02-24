package exercise3_day5;

public class StartThreadAgain extends Thread {
	@Override
	public void run() {
		System.out.println("the thread is running...");
	}

	public static void main(String[] args) {
		StartThreadAgain t = new StartThreadAgain();
		t.start();
		t.start();

	}

	/*
	 * OUTPUT
	 * 
	 * the thread is running... Exception in thread "main"
	 * java.lang.IllegalThreadStateException at
	 * java.base/java.lang.Thread.start(Thread.java:793) at
	 * exercise3_day5.Ex3_Day5_5.main(Ex3_Day5_5.java:12)
	 * 
	 * 
	 */

}
