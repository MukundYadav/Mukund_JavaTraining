package exercise3_day5;

public class StringBufferExample {
	public static void main(String[] args) {

		StringBuffer strbfr = new StringBuffer("AA");

		ThreadClass1 obj1 = new ThreadClass1(strbfr);
		ThreadClass1 obj2 = new ThreadClass1(strbfr);
		ThreadClass1 obj3 = new ThreadClass1(strbfr);

		obj1.start();
		obj2.start();
		obj3.start();
	}
}

class ThreadClass1 extends Thread {
	StringBuffer strbfr;

	ThreadClass1(StringBuffer strbfr) {
		this.strbfr = strbfr;
	}

	@Override
	public void run() {
		synchronized (strbfr) {
			for (int i = 0; i < 100; i++) {
				System.out.print(strbfr);

			}
			strbfr.setCharAt(0, 'B');
			System.out.println();
			for (int j = 0; j < 100; j++) {
				System.out.print(strbfr);

			}
			strbfr.setCharAt(0, 'C');
			System.out.println();
			for (int i = 0; i < 100; i++) {
				System.out.print(strbfr);
			}
		}

	}

}
