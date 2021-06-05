package collectiondemo;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {

	public static void main(String[] args) {

		LinkedHashSet lset = new LinkedHashSet();
		
		LinkedHashSet<Integer> lset1 = new LinkedHashSet<Integer>();
		
		lset.add(100);
		lset.add(700);
		lset.add(600);
		lset.add(300);
		lset.add(500);
		
		System.out.println(lset);
	}

}
