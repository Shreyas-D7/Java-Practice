package arrays;

import java.util.Scanner;

public class AverageOfStudents {

	public static void main(String[] args) {

		System.out.print("Enter no. of students : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int marks[] = new int[5];
		
		System.out.println("Enter the marks now : ");
		
		 for(int i = 0; i<n; i++) {
			 marks[i] = sc.nextInt();
		 }
		 
		 int sum = 0 ;
		 
		 for(int i = 0; i<n; i++) {
			sum += marks[i];
		 }
		 double averageMarks = sum/n;
		 System.out.println(" the average marks is " +averageMarks);
		
	}

}
