package collectiondemo;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo1 {

	public static void main(String[] args) {
		
		PriorityQueue q =new PriorityQueue();
		
		//adding elements add() , offer()

		q.add("a");
		q.add("b");
		q.add("wer");
		q.offer("wer");
		q.add("y");
		
		
		System.out.println(q);
		
		//get head element - element() , peak()
		
//		 System.out.println(q.element()); //  if empty returns NoSuchElementException
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
