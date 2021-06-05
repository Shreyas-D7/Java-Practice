package collectiondemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args) {
		
			//HashMap h =  new HashMap();

			HashMap <Integer, String> h= new HashMap <Integer, String>();
			
			h.put(101,"shrey");
			h.put(102,"shrey");
			h.put(103,"shrey");
			h.put(104,"shrey");
			h.put(101,"shrettt");// if key is duplicated, value will be replaced
			
			System.out.println(h);
			
			
			System.out.println(h.get(103));
			h.remove(101);
			System.out.println(h);
			
			System.out.println(h.containsKey(109));
			System.out.println(h.containsKey(102));
			
			System.out.println(h.containsValue("shrey"));
			System.out.println(h.containsValue("dev"));
			
			System.out.println(h.isEmpty());
			
			System.out.println(h.keySet());// returns all the key as set
			
			for(int i :h.keySet()) { // all the values individually
				System.out.println(i);
			}
			
			System.out.println(h.values()); // returns all values as collection
			
			for (Object i :h.values()) { // returns all values as individual
				System.out.println(i);
			}
			
			for (Object i : h.keySet()) {
				System.out.println(i+ "    "+ h.get(i)); 
			}
			
			System.out.println(h.entrySet()); // returns all the enteries as scollection
			
			// Entry Interface method
			
			for(Map.Entry entry : h.entrySet())
			{
				System.out.println(entry.getKey()+ "     " +entry.getValue());
			}
			
			
			// Iterator Method
			System.out.println("************************************************************");
			Set s =h.entrySet();
			Iterator it = s.iterator();
			while(it.hasNext()) {
				Map.Entry entry =(Entry) it.next();
				System.out.println(entry.getKey()+"    "+ entry.getValue());
			}
			
	}

}
