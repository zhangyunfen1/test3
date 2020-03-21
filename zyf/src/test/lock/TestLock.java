package test.lock;

import java.util.concurrent.locks.ReentrantLock;

public class TestLock implements Runnable {
	private ReentrantLock ree = new ReentrantLock(true);
	private int ticket = 10;
	@Override
	public void run() {
		while(true) {
			try {
			ree.lock();
			if(ticket<=0) {
				break;
			}
			try {
				Thread.sleep(50);
			}catch(Exception e) {
				e.printStackTrace();
			}		
			System.out.println(Thread.currentThread().getName()+"Ö´ÐÐ-"+"Ê£ÓàÆ±Êý:"+ticket--);
			}catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				ree.unlock();
			}
		}
		
	}
	public static void main(String[] args) {
		Runnable run = new TestLock();
		for(int i=0;i<3;i++) {
			Thread t = new Thread(run,"´°¿Ú"+i);
			t.start();
		}
	}
	
	
}
