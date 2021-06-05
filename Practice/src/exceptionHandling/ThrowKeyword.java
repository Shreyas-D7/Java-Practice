package exceptionHandling;

public class ThrowKeyword {
	
	static void m2() {
		 
		try {
			throw new ArithmeticException();
		}
		catch(ArithmeticException ae) {
			System.out.println(ae);
			
		}
	}
	
	public static void main(String[] args) {
		m2();
	}

}
