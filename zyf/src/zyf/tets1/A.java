package zyf.tets1;

public class A {
	
	public A() {
		System.out.println("构造方法");
	}
	public static void main(String[] args) {
		new A();
	}
	static {
		System.out.println("静态代码块");
	}
}
class F{
	public F() {
		System.out.println("F");
	}
}
