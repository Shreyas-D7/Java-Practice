package methods;



public class IntroMethod {
	
	public static void main(String[] args) {
		
		int firstNo = 34;
		int secondNo = 23;
		
		int result = maxOf(firstNo , secondNo);//calling a method
		
		System.out.println(result);
		
		sayHi();//calling a method
		sayHi();
	}
	
	
	static int maxOf(int a, int b) { //method with return type int
		if(a > b ) {
			return a;
		}else {
			return b;
		}
			
	}
	
	
	static int maxOf(int c, float d ) { //method overloading
		return 0 ;
	}
	
	
	
static void sayHi() {				//method with no return type, so using void
		System.out.println("hi");
		System.out.println("good morning");
	}

}
