package exercise4_patterns;

import java.util.Scanner;

public class VisitorPattern {
	public static void main(String[] args) throws DogException {

		Child baby = new Child();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter  item...:");
		String item = scan.next();
		Dog tiger = new Dog();
		baby.playWithDog(tiger, item);
	}
}

class Child {
	public void playWithDog(Dog dog, String item) {
		System.out.println("before exception...");
		try {
			dog.play(item);
		} catch (DogException dee) {
			dee.printStackTrace();
			dee.visit();
		}
		System.out.println("after exception....");
	}
}

class Dog {
	public void play(String item) throws DogException {
		if (item.equals("stick")) {
			throw new DogBiteException("you beat I bite....");
		} else if (item.equals("stone")) {
			throw new DogBarkException("you throw I catch and bark.....");
		} else if (item.equals("biscuit")) {
			throw new DogHappyException("yummy yummy..........:i love biscuits...");
		}
	}
}

abstract class Handler911 {
	public abstract void handle(DogBiteException dbe);

	public abstract void handle(DogBarkException dbee);

	public abstract void handle(DogHappyException dbee);
}

class Handler911Impl extends Handler911 {
	@Override
	public void handle(DogBarkException dbee) {
		System.out.println("barking dogs seldom bite...no worries...");
	}

	@Override
	public void handle(DogBiteException dbe) {
		System.out.println("take him to hospital........");
	}

	@Override
	public void handle(DogHappyException dbee) {
		System.out.println("good sign...have fun with dog....play around....");
	}
}

abstract class DogException extends Exception {
	public abstract void visit();
}

class DogBiteException extends DogException {
	String msg;

	public DogBiteException(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return msg;
	}

	@Override
	public void visit() {
		Handler911 handle = new Handler911Impl();
		handle.handle(this);
	}
}

class DogBarkException extends DogException {
	String msg;

	public DogBarkException(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return msg;
	}

	@Override
	public void visit() {
		Handler911 handle = new Handler911Impl();
		handle.handle(this);
	}
}

class DogHappyException extends DogException {
	String msg;

	public DogHappyException(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return msg;
	}

	@Override
	public void visit() {
		Handler911 handle = new Handler911Impl();
		handle.handle(this);
	}
}
