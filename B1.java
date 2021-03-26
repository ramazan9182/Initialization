
public class B1 {
	static A1 a = new A1(2);

	
	// implicit STATIC METHODS
	public B1() {
		System.out.println("B1 constructor");
		a.f(1);
	}

	void f(int marker) {
		System.out.println("B1.f(" + marker + ")");
	}

	static A1 a1 = new A1(1);
}
