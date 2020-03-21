package zyf.tets;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Test5 {
	public static void main(String[] args) {
//        invokeCalc(120,130,(int a,int b) -> {
//            return a + b;
//        });
		invokeCalc(120, 130, (a, b) -> a + b);
    }
	 private static void invokeCalc(int a, int b, Calculator calculator) {
	        int result = calculator.calc(a, b);
	        System.out.println("½á¹ûÊÇ£º" + result);
	    }
}
