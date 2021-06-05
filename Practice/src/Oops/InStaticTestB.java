package Oops;

//static members control flow in inheritance

public class InStaticTestB extends InStaticTestA {

	static int b = m2(); // #4

	static int m2() { // #5
		System.out.println("B sv");
		System.out.println("int B = "+b);
		return 10;
	}

	static { // #6
		System.out.println("B sb");
	}

	public static void main(String[] args) {
		System.out.println("B main"); // #7
		System.out.println("int A = "+a);
		System.out.println("int B = "+b);
	}

}
