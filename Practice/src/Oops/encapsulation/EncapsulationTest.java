package Oops.encapsulation;



public class EncapsulationTest {
	public static void main (String[]args) {
		Encapsulation acc = new Encapsulation ();
		acc.setAcc_no(12344444);
		acc.setamount(12234);
		acc.setName("shreyas");
		acc.setEmail("imshreyas@gamil.com");
		System.out.println(acc.getAcc_no()+" \n"+acc.getamount()+"\n "+acc.getEmail()+"\n "+acc.getName());
		
		
	}
}
