package collectiondemo;

import java.util.HashSet;
import java.util.Iterator;


public class HashSetDemo1 {

	public static void main(String[] args) {
		
//		HashSet hs = new HashSet(); //deafult capacity 16 , load factor 0.75
		
//		HashSet a = new HashSet(100) ; // intial capacity 100,further we can configure
//		
//		HashSet b = new HashSet(100,(float)0.90); //intial capacity 100,load factor 0.90
//		
//		HashSet <Integer> c =  new HashSet<Integer>(); 
		
		HashSet hs = new HashSet();
		
		hs.add(100);
		hs.add("WELCOME");
		hs.add(16.8);
		hs.add(true);
		hs.add(null);
		
		System.out.println(hs); // doesn't preserved insertion order
		
		hs.remove(16.8);
		System.out.println(hs);
		
		System.out.println(hs.contains(16.8));
		System.out.println(hs.contains("shreyas"));
		
		System.out.println(hs.isEmpty());
		
		
		//Reading objects /elements from hashset using for each loop
		
		for(Object e:hs) {
			System.out.println(e);
		}
		
		Iterator it =  hs.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		
		
		
		
	}

}
