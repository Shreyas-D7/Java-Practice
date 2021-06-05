package Oops;

//static members control flow in inheritance

public class InStaticTestA {
	
	static int a =  m1(); //#1
	
	static int m1() {	//#2
		System.out.println(" A sv");
		System.out.println("int A = "+a);
		return 20 ;
	}
	
	static {	//#3
		System.out.println("A sb");
	}
	
	public static void main (String[]args) {
		System.out.println("A main");
	}
}
