package Oops.threads;

public class PrintNumbers {
	
	synchronized void display() {
		for(int i = 1; i<=20; i++) {
			System.out.println(Thread.currentThread().getName()+ "run:" +i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
