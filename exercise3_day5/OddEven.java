package exercise3_day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OddEven {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(2);
		es.execute(() -> {
			even();
		});
		es.execute(() -> {
			odd();
		});
		es.shutdown();
	}

	synchronized public static void even() {
		System.out.println("The Even numbers are...");
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	synchronized public static void odd() {
		System.out.println("Odd numbers are....");
		for (int i = 0; i <= 100; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
}
