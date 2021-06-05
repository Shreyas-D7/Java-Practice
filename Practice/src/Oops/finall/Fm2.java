package Oops.finall;

public class Fm2 extends FinalMethods {

	void m1() {
		System.out.println("fm2 m1");
	}

	// final method cannot be overridden

//	void m2() {
//		System.out.println("fm2 m2");
//	}

	public static void main(String[] args) {
		Fm2 f2 = new Fm2();
		f2.m1();
		f2.m2(); // we are inheriting final method m2 from superclass
		f2.m3();
	}
}
