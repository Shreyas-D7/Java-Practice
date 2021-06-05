package Oops.threads;

public class TestSync {

	public static void main(String[] args) {
		// case 1 : sharing same object
		
		PrintNumbers pn = new PrintNumbers();
		MyThread1 mt1 = new MyThread1(pn);
		MyThread1 mt2 = new MyThread1(pn);
		
		mt1.start();
		mt2.start();
		
		//case 2: using diff objects
		
		PrintNumbers pn1 =  new PrintNumbers();
		PrintNumbers pn2 =  new PrintNumbers();
		MyThread1 mt3 = new MyThread1(pn1);
		MyThread1 mt4 = new MyThread1(pn2);
		
		mt3.start();
		mt4.start();
		
	}

}
