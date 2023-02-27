package exercise2_day4;

class TryCatchExample2 {
	public void mth1() {
		mth2();
		System.out.println("caller");
	}

	public void mth2() {
		try {
			// throw new Exception();
			return;
		} catch (Exception e) {
			System.out.println("catch-mth2");
		} finally {
			System.out.println("finally-mth2");
		}
	}

	public static void main(String[] args) {
		TryCatchExample2 s = new TryCatchExample2();
		s.mth1();
	}
}

/*
 * OUTPUT
 * 
 * Before throwing exception
 * 
 * finally-mth2 caller
 *
 * After Throwing exception
 *
 * catch-mth2 finally-mth2 caller
 *
 *
 *
 */
