package Oops.threads;

public class MyThread1 extends Thread {
	
	PrintNumbers pn  ;
	
	MyThread1(PrintNumbers pn){
		 this.pn = pn ;
		 }

		@Override
		public void run() {
			pn.display();
		}
	public static void main(String[] args) {
			
	}

}
