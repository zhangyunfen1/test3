package zyf.tets1;

import java.util.ArrayList;
import java.util.List;

class Fruit{}
class Apple extends Fruit{}
class Jonathan extends Apple{}
class Orange extends Fruit{}
public class CovariantArrays{
	public static void main(String[] args) {
		List<? extends Fruit> flistTop = new ArrayList<Orange>();
		//flistTop.get(0);
		//flistTop.add(new Orange());
		List<? super Fruit> f = new ArrayList<Object>();
		f.add(new Orange());
		System.out.println(f);
	}
}