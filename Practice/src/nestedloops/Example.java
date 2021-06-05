package nestedloops;

import java.util.Scanner;

public class Example {
	
//sum of digits using for loop
		public static void main(String[]args) {
			
			Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
			int temp = n;
			int sum =0 ;
			for(int  i = 1;i<temp;i++) {
				int lastDigit = temp %10 ;
				temp /=10 ;
				
				sum += lastDigit;
				System.out.println(lastDigit +" " + temp +" " + sum );
				
			}
			
			System.out.println("the sum of digits of " + n +" is " + sum);
			
			
		}
	}


