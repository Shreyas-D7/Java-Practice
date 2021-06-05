package collectiondemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueDemo2 {

	public static void main(String[] args) {
		
		LinkedList q =new LinkedList();
		
		//adding elements add() , offer()

//		q.add("a");
//		q.add("b");
//		q.add("wer");
//		q.offer("wer");
//		q.add(100);      //heterogeneous data are allowed
//		q.add(100);      // duplicates are allowed		
		System.out.println(q);
		
		//get head element - element() , peak()
		
//		 System.out.println("asdfgh "+q.element()); //  if empty returns NoSuchElementException
//		 System.out.println(q.peek());      // if empty returns null
//		
//		// return & remove head element from queue -  remove(), poll().
//		 
//		 System.out.println(q.remove()); //  if empty returns NoSuchElementException
//		System.out.println(q);
//		
//		System.out.println(q.poll());   //// if empty returns null
//		System.out.println(q);
//		
		Iterator it = q.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		for(Object ob:q) {
			System.out.println(ob);
		}
		
		
	}

}
