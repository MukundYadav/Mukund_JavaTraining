package exercise3_day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InventoryManage {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(2);
		ProducerConsumer pc = new ProducerConsumer();
		es.execute(() -> {
			for (int i = 0; i < 5; i++) {
				pc.producer();
			}
		});
		es.execute(() -> {
			for (int i = 0; i < 5; i++) {
				pc.consumer();
			}
		});
		es.shutdown();
	}
}

class ProducerConsumer {
	boolean flag = false;

	synchronized public void producer() {
		if (flag) {
			try {
				wait();
			} catch (Exception e) {
				System.out.println("the exception occured....");
			}
		}
		System.out.println("The product is produced....");
		flag = true;
		notify();
	}

	synchronized public void consumer() {
		if (!flag) {
			try {
				wait();
			} catch (Exception e) {
				System.out.println("the exception occured....");
			}
		}
		System.out.println("The product is consumed....");
		flag = false;
		notify();
	}
}
