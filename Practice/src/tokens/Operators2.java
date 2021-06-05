package tokens;

public class Operators2 {

	public static void main(String[] args) {
		int x = 2, y= 5; boolean b;
		int n= x - y + y/x * (x*y++);
		System.out.println(n);
		double n1 = --x - (y + y/x) * (--x*y);
		System.out.println(n1);
		b=!(n > x && n1 < y)?true:false;
		System.out.println(b);
	}

}
