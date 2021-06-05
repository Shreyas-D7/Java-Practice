package collectiondemo;

import java.util.ArrayList;

public class ArrayListDemo2 {

	
	
	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(2);
		al.add(3);
		al.add(4);
		al.add("asdfdgh");
		
		ArrayList al_dup =  new ArrayList();
		al_dup.addAll(al);
		System.out.println(al_dup);
		System.out.println(al);
		al_dup.removeAll(al);
		System.out.println("asdfghuyh"+al_dup);
		

	}

}
