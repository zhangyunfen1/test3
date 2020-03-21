package zyf.tets1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericTest {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Integer i = (Integer)it.next();
			System.out.println(i);
//		for(Integer i:list) {
//			System.out.println(i);
//		}
		}
	} 
}
