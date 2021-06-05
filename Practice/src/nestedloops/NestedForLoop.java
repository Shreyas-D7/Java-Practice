package nestedloops;
import java.util.Scanner;

public class NestedForLoop {
	public static void main (String[]args) {
		
		for(int i = 1;i<=5;i++) {
			for(int j = 1;j<=10;j++) {
			 System.out.print(j *i + " ");	
			}
			
			System.out.println();
		}
		NestedForLoop obj = new NestedForLoop();
		
		obj.fizzBuzz();
	}

	
	 public void fizzBuzz() {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 for (int i = 1;i<=n;i++) {
			 if(i % 3 == 0 && i % 5 == 0 ) {
				 System.out.println("fizzbuzz");
			 }else if(i % 3 == 0) {
				 System.out.println("fizz");
			 }else if (i % 5 == 0) {
				 System.out.println("buzz");
			 }else {System.out.println(i);
		 }
	}sc.close();
}
}

