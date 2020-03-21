package test.thread;

public class TestRunnable implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		Runnable task = new TestRunnable();
		for(int i=0;i<10;i++) {
			new Thread(task).start();
		}
	}
}
