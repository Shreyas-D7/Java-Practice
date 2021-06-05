package Oops.polymorphism;

//polymorphism - by using overriding, by overloading.
public class PolyA {

	static void p1() {				//method hiding - method with static
		System.out.println("A p1");
	}

	void p2() {						//method overriding - method without static 
		System.out.println("A p2");
	}

	static void p3() {				//method overloading - no arg
		System.out.println("A p3 no-argument");
	}

	int p3(String s) {				//method overloading - with arg
		System.out.println("A p3 String parameter");
		return 20;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
