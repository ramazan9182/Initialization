


public class DriverInitialization {
	
	public static void main(String[] args) {
		System.out.println("main method is starting...");
		new C1();
		System.out.println("new C1 instance");
		new C1();
		b.f(1);
		c.f(4);
	}
	
	static B1 b = new B1();
	static C1 c = new C1();
}
