package test.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestCallable implements Callable<String> {
	public String call() {
		System.out.println(Thread.currentThread().getName());
		String msg = Thread.currentThread().hashCode()+"Ö´ÐÐ³É¹¦";
		return msg;
	}
	public static void main(String[] args) throws Exception {
		Callable<String> callable = new TestCallable();
		for(int i=0;i<10;i++) {
			FutureTask task = new FutureTask(callable); 
			new Thread(task).start();
			String msg = (String)task.get();
			System.out.println(msg);
		}
	}
}
