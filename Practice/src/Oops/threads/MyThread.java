package Oops.threads;

public class MyThread extends Thread {

	public void run() { // overriding run method in Class Thread
		System.out.println("Run executed");
	}

	public static void main(String[] args) {

		MyThread mt = new MyThread();
		mt.start(); /*
					 * calling start method in class Thread -> 
					 * then it will call run method and override run method
					 */

		System.out.println("main executed");
	}

}
