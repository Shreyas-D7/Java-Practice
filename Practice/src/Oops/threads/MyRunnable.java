package Oops.threads;


public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Run executed");
	}

	public static void main(String[] args) {

		Runnable mr =  new MyRunnable();
		
		Thread th = new Thread(mr);
		th.start();
		
		System.out.println("Main executed");
	}

}
