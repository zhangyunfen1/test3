package zyf.tets1;

import java.util.TreeSet;

public class B {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		TreeSet<Integer> subset = new TreeSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		TreeSet t = (TreeSet)set.subSet(1, true,4,false);	
		System.out.println(t);
	}
}