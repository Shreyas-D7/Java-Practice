package tokens;

public class TypeCasting {

	public static void main(String[] args) {
		int n = 1;
		long ln = n;

		System.out.println(ln);

		char c = 'c';
		ln = c;

		System.out.println(ln);

		char c1 = (char) ln;

		System.out.println(c1);

		float f = 3.2f;
		n = (int) f;

		System.out.println(n);

		double d = (int) f;
		double d1 = (char) f;

		System.out.println(d + "," + d1 + "," + f);
		double d2 = f;

		System.out.println(d2);
		System.out.println(Integer.toBinaryString(Float.floatToRawIntBits(f)));
		System.out.println(Long.toBinaryString(Double.doubleToRawLongBits(d2)));
	}

}
