package Oops.polymorphism;

public class PolyTest {

	public static void main(String[] args) {

		PolyB pb = new PolyB();
		pb.p1();
		pb.p2();
		pb.p3(12.0f, 23);
		pb.p3();			//inherting p3() method -no arg from PolyA
	
		PolyA pa = new PolyA();
		pa.p1();
		pa.p2();
		pa.p3();
		pa.p3("shrey");
		}
	}

