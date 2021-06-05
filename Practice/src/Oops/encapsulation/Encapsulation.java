//encapsulation
//private data member with setter and getter methods
package Oops.encapsulation;

public class Encapsulation {
	//private data members
	private long acc_no;
	private String name,email;
	private float amount;
	
	//public getter and setter method 
	public  long getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(long acc_no) {
		this.acc_no= acc_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name; 
	}
	public float getamount() {
		return amount;
	}
	public void setamount(float amount) {
		this.amount=amount;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
}
	
		
	
}