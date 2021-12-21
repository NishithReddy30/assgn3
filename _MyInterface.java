package InterfacesinJava;

public class _MyInterface {
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
		//Inheritance applied on interface
		interface Interface extends MyInterface_{
			public static void info_again() {
				
			}//Inheritance method closed
		
		public class Demo implements Interface {
			/*Even though this class is only implementing the interface MyInterface,
			 * it has to implement all methods of MyInterface as well because interface extends to
			 * MyInterface.
			 */
			public void info() {
				if(true)
				System.out.println("This is if block");
				System.out.println("and I am demo class inherited from MyInterface");
			}
			public void inf() {
			int a=20;
			if(a%2==0)
				System.out.println(a + "Even Number");
		}
			public void in() {
				String name="Nishith";
				if(name=="Nishith");
				System.out.println("My name is : " + name);
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
}


