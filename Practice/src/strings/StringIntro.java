package strings;
//Strings are immutable.

public class StringIntro {

	public static void main(String[] args) {
		
		//string initializatin
		
		String name = "shrey";  //initialization through literals in String pool area
		//initialization through object
		String anotherName = new String("dev"); // creates new String in heap memory area and a copy in String pool area
		System.out.println(name);
	}

}
