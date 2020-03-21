package test.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestThreadPool1 {
	public static void main(String[] args) throws Exception {
		
	
	ExecutorService es = Executors.newFixedThreadPool(5);
	Callable<String> task = new Callable<String>() {
		public String call() {
			System.out.println(Thread.currentThread().getName());
			String msg = Thread.currentThread().hashCode()+"Ö´ÐÐ³É¹¦";
			return msg;
		}
	};
	Future<String> f = es.submit(task);
	String msg = f.get();
	System.out.println(msg);
	}
}
