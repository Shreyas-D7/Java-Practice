package strings;

public class StringCreation {

	public static void main(String[] args) {
		String s1 = new String("String Constructor");
		System.out.println(s1);

		// String(String value)
		String s2 = "String value";
		System.out.println(s2);
		
		//String(StringBuffer sb)
		StringBuffer sb =  new StringBuffer("StringBuffer");
		String s3 = new String(sb);
		System.out.println(s3);
		
		//String(StringBUilder sb2)
		StringBuilder sb2 = new StringBuilder("StringBUilder");
		String s4 = new String(sb2);
		System.out.println(s4);
		
		//String(char[]ch)
		char[] ch= {'c','h','a','r'};
		String s5 = new String(ch);
		System.out.println(s5);
		
		//String(char[]cg,int offset, int count)
		char[] ch1 = {'w','r','t','s'};
		String s6 = new String(ch1,2,2);
		System.out.println(s6);
		
		//String(byte[]b)
		byte[] b = {97,98,68,65,64,1};
		String s7 = new String(b);
		System.out.println(s7);
	}

}
