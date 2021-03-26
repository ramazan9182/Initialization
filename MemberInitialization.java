
public class MemberInitialization {

	static int count;
	
	int a = 65;	// 0
	double d;	// 0.0
	short s;  	// 0
	char c;		// \u0000
	String str; // null --> reference type
	
	public MemberInitialization() {
		this.a = 650;
	}
	
//	int a = 5;
//	double d = 45.9;
//	short s = 678;
//	String str = "abc";
	
	public static void main(String[] args) {
		
		MemberInitialization initialization = new MemberInitialization();
		
		System.out.println(initialization.a);
		System.out.println(initialization.d);
		System.out.println(initialization.s);
		System.out.println(initialization.c);
		System.out.println(initialization.str);
		
	}
}
