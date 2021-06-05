package collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {

		// Declare ArrayList
//	  ArrayList al = new ArrayList(); 
//	  ArrayList<Integer> b = new ArrayList<Integer>();
//	  List c = new ArrayList();
//	 
		ArrayList al = new ArrayList();

		// Add new elements to the arraylist

		al.add(100);
		al.add("welcome");
		al.add(15.45);
		al.add('a');
		al.add(true);

		System.out.println(al); // [100, welcome, 15.45, a, true]
		System.out.println(al.size()); // 5
		
		al.remove(1);
		System.out.println(al);
		// insert new element
		
		al.add(1,"exam");
		System.out.println(al);
		
		System.out.println(al.get(2));
		 al.set(2,"rty");
		 System.out.println(al);
		 System.out.println(al.isEmpty()); 
		 
		 System.out.println(al.contains("superman"));
		 System.out.println(al.contains("tonystark"));
		 
		 // 1) for loop
//		try {
//		 System.out.println("reading elements using for loop");
//		 
//		 for(int i = 0 ; i<=al.size();i++)
//		 {
//			 System.out.println(al.get(i));
//		 
//		 }}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("something went wrong");
//			
//		}

			 
		 
		 
		 
		 // 2) for each loop
		 
		 System.out.println("reading elements using for each loop");
		 for(Object e:al) {
			 System.out.println(e);
		 }
		 
		 // 3) iterator
		 System.out.println("reading elements using Iterator");
		 Iterator it = al.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
	}
}
