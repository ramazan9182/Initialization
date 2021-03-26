
public class InitializationOrder {

	/**
	 * 0 --  static field access for triggering .class file load process if .class file is not exists.
	 * 
	 * 1 --  Class object is created for the .class file, static fields are initialized/run
	 * 
	 * 2 --  new --> allocates "enough memory" for the .class object(A1,B1, House etc..) from Heap area
	 * 
	 * 3 --  member field initialization occured for allocated class fields, zero values for the primitive fields and "null" value for the reference fields.
	 * 
	 * 4 --  Any initialization is occur at the point of field definition. 
	 * 
	 * 5 --  Constructor is called.
	 * 
	 * 
	 */
		
	
		// 	new // House();
	
}
