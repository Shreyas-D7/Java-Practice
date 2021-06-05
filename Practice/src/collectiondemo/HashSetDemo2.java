package collectiondemo;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		
		HashSet <Integer> evenNumber = new HashSet <Integer>();
		evenNumber.add(2);
		evenNumber.add(44);
		evenNumber.add(33);
		
		System.out.println(evenNumber);
		
		HashSet<Integer> numbers =  new HashSet<Integer>();
		numbers.addAll(evenNumber);
		numbers.add(234);
		 System.out.println(numbers);
		 
		 numbers.removeAll(evenNumber);
		 System.out.println(numbers);
	}

}
