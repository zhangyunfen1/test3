package zyf.tets1;

public class A {
	int i; 
	public A() {
		System.out.println("¹¹Ôì·½·¨");
	}
	public static void main(String[] args) {
		new A();
	}
	static {
		System.out.println("¾²Ì¬´úÂë¿é");
	}
}
class F{
	public F() {
		System.out.println("F");
	}
}
