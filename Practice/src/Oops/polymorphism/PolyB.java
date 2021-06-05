package Oops.polymorphism;

public class PolyB extends PolyA {

	static void p1() {				//method hiding - method with static
		System.out.println("B p1");
	}

	void p2() {						//method overriding - method without static 
		System.out.println("B p2");
	}

	void p3(float f, int x) {		//method overloading - with arg
		System.out.println("B p3 float, int parameter");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
