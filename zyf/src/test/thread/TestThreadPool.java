package test.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool  {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(5);
		Runnable task = new Runnable() {
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		};
		es.submit(task);
		es.shutdown();
	}
}
