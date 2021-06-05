package exceptionHandling;

import java.util.Scanner;

public class ExceptionIntro {

	public static void main(String[] args) {
		
		try {

			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a / b;
			System.out.println("Result : " + c);

		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("please pass atleast two integer numbers");
		}

		catch (ArithmeticException b) {
			System.out.println("please do not pass second value as zero");
		}

		catch (NumberFormatException c) {
			System.out.println("please pass only integers");
		}
		
		finally {
			System.out.println("finally block");
		}
	}

}
