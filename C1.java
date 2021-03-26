
public class C1 {
	A1 a2 = new A1(3);
	static A1 a3 = new A1(4);

	public C1() {
		System.out.println("C1 constructor");
		a2.f(2);
	}

	void f(int marker) {
		System.out.println("C1.f(" + marker + ")");
	}

	static A1 a4 = new A1(5);
	
	public static void main(String[] args) {
		System.out.println("C1 main method");
	}
}
