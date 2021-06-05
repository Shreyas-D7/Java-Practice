package strings;

public class StringOperations {

	public static void stringLength() {
		// String length

		String s3 = "";
		String s4 = "abc";
		String s5 = new String("shrey");

		System.out.println("s3 length:" + s3.length());
		System.out.println("s4 length:" + s4.length());
		System.out.println("s5 length:" + s5.length());
		System.out.println("**************************************");
	}

	public static void emptyTest() {
		// sString emptyTest
		String s1 = "";
		String s2 = "a";

		System.out.println("s1 empty:" + s1.isEmpty());
		System.out.println("s2 empty:" + s2.isEmpty());
		System.out.println("**************************************");
	}

	public static void toStringTest() {
		// ToStringTest

		String s6 = "Shreyas";
		System.out.println("s6:" + s6.toString());
	}

	public static void equalsTest() {
		// Equals test
		String s7 = "a";
		String s8 = "gh";
		String s9 = new String("a");
		System.out.println("compares address : " + s7 == s8); // compares address
		System.out.println("compare two objects data : " + s7.equals(s8)); // compare two objects data which is inside
																			// reference
		System.out.println("compare two objects data : " + s7.equals(s9));

		// Equals Ignore case

		String s10 = "a";
		String s11 = "A";
		System.out.println("Equals Ignore case : " + s10.equalsIgnoreCase(s11));
	}

	public static void compareToTest() {
		// Compare to test
		String s12 = "a";
		String s13 = "gh";
		String s14 = new String("a");
		String s15 = "A";

		System.out.println("compare to : " + s12.compareTo(s13)); // if not equal gives value + or - value
		System.out.println("compare to : " + s12.compareTo(s14)); // if it is equal gives value 0
		System.out.println("compare to ignore case : " + s12.compareToIgnoreCase(s15));// doesnt consider uper or lower
	}
	

	public static void main(String[] args) {

		emptyTest();

		stringLength();

		toStringTest();

		equalsTest();

		compareToTest();

	}

}
