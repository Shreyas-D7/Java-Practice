package exceptionHandling;

public class ExceptionPropagation {

	static void m1() {

		System.out.println("in m1()  method start");
		System.out.println(10 / 0);
		System.out.println(" in m1() method end");

	}

	public static void main(String[] args) {
		System.out.println("in main method start");

		/*
		  we should catch exception in calling method(main method), not from called
		  method(m1() method
		 */

		try {
			m1();
		} catch (ArithmeticException ae) {
			System.out.println("ArithmeticException (in main method catch)");
		}
		System.out.println("in main method end");

	}

}
