package exercise3_day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CounterExample {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(1);
		es.execute(() -> {
			int counter = 0;
			for (int i = 0; i < 100; i++) {

				counter++;

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				System.out.println("counting..." + counter);
				if (counter % 10 == 0) {
					System.out.println("after ten numbers the counter is  " + counter);
				}

			}
		});
	}
}
