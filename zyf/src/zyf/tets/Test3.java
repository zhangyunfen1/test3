package zyf.tets;

import java.util.Arrays;



public class Test3 {
	public static void main(String[] args) {
		int[] array = new int[] {23,54,6,34,87};
		for(int k=0;k<array.length-1;k++) {
			for(int v=k+1;v<array.length;v++) {
				int max = array[k];
				int a=0;
				if(max<array[v]) {
					a=max;
					array[k]=array[v];
					array[v]=a;
					//k=k+1;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}
//	@Test
//	public void test() {
//		String s = "34.2";
//		int i = s.indexOf(".");
//		System.out.println(i);
//	}
}
