package nestedloops;

import java.util.Scanner;

public class Pattern3 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i<=n;i++) {
			for( int j=n;j>=i;j--){
				System.out.print(" 2");
			}
			System.out.println();
		}
	}

}
