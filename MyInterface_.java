package InterfacesinJava;

public interface MyInterface_ {
       //interface method
	public static void info() {
      System.out.println("This is interface first method");
	}
	public static void inf() {
		System.out.println("This is interface second method");
	}
	public static void in() {
		System.out.println("This is interface third method");
	}
	//Inheritance applied on interfacey
	interface Interface extends MyInterface_{
		public static void info_again() {
			
		}//Inheritance method closed
	}//Inheritance is close here
	public class Demo implements Interface {
		/*Even though this class is only implementing the interface MyInterface,
		 * it has to implement all methods of MyInterface as well because interface extends to
		 * MyInterface.
		 */
		public void info() {
			
		}
		public void inf() {
		
	}
		public void in() {
}
}
	 public static void main(String[] args) {
		 //we will create the object
		 //parent-------> child
		 Demo obj = new Demo();
		 info();
		 inf();
		 in();//Static interface we do not need to create object
		 obj.info(); //An object created for demo
	 }
}