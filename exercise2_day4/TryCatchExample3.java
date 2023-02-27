package exercise2_day4;

public class TryCatchExample3 {
	public void mth1() {
		mth2();
		System.out.println("caller");
	}

	public void mth2() {
		try {
			// throw new Exception();
			System.exit(0);
		} catch (Exception e) {
			System.out.println("catch-mth2");
		} finally {
			System.out.println("finally-mth2");
		}
	}

	public static void main(String[] args) {
		TryCatchExample3 s = new TryCatchExample3();
		s.mth1();
	}
}

/*
 * OUTPUT Not printed
 * 
 * It will not print anything since the System.exit(0) Statement will terminate
 * the program
 * 
 * 
 */
