package exercise3_day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CounterExample {
	public static void main(String[] args) {
		GetNumberAndPrint count = new GetNumberAndPrint();
		ExecutorService es = Executors.newFixedThreadPool(2);
		es.execute(() -> {
			
				count.getCounts();
			
		});
		es.execute(() -> {
			count.printMessage();

		});
		es.shutdown();
	}
}

class GetNumberAndPrint {
	int counter = 0;

	synchronized public void getCounts() {

		for (int i = 0; i < 100; i++) {

			counter = i + 1;
			System.out.println(counter);
			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {
			}
			if (counter % 10 == 0) {
				try {
					wait();
				} catch (InterruptedException e) {
					System.out.println("the interrupt occured");
				}
			}
		}
	}

	synchronized public void printMessage() {
		
			System.out.println("The counter after ten numbers....  ");
			notify();
		}

	}

