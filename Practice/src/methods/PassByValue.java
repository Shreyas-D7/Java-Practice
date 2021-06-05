package methods;

public class PassByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int c = 45;				//pass  by value
//		int d = 478 ;
//		
//		swap(c,d);
//		
//		System.out.println(c + " " + d);
//		
	Dog c = new Dog();
	c.legs = 4;
	Dog d = new Dog();
	d.legs = 3;
	
	swap(c,d);
	
	System.out.println(c.legs + " " + d.legs);
	
	
	}

	
//	static void swap( int a, int b) {
//		int temp = a;
//		a = b;
//		b = temp ;
//	}
	
	static void swap(Dog a, Dog b) {
		
		Dog temp = a;
		a = b ;
		b = temp ;
	}
	
		
}

class Dog{
	int legs;
}
