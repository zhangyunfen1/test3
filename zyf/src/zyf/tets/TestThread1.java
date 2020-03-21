package zyf.tets;

public class TestThread1 extends Thread {
	private Integer ticket = 10;		
	
	//执行业务，重写父类run方法
	@Override
	public void run() {
		
		//业务处理，卖票：票–
			while(true) {		//线程非常多，我想尽量给我资源
				
				synchronized (this) {	//对象锁
				//判断一个条件，出去条件
					if(ticket<=0) {	//多线程可能ticket=-1
						break;		//退出死循环
					}
				
				//不出现，线程run方法执行太快，不会发生线程冲突
				try {	//不能抛出异常，抛出就不是重写run方法
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("窗口:" + Thread.currentThread().getName() 
						+"剩余票数:" + ticket-- );
			}
		}
	}
	
	//3个窗口都买这一个票
	public static void main(String[] args) {
		//目标
		TestThread1 target = new TestThread1();
		
		for(int i=0; i<3; i++) {
			new Thread(target).start();		//3个线程共同作用一个target
		}
		//System.out.println(2);
	}

}
