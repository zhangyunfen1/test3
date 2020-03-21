package test.thread;

public class TestThread extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			new TestThread().start();
		}
	}
}
