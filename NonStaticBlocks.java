
public class NonStaticBlocks {

	{
		System.out.println("Hello from non-static block");
		StaticBlock.f();
		
	}
	
	{
		System.out.println("Hello from 2nd block");
	}
}
