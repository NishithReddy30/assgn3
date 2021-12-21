package AggregationInJava;

class Students
{
	String name;
	int roll_number;
	String Dept;
	//Parameterized constructor for initialising the values for the variables
	public Students(String name, int roll_number, String dept) {
		super();
		this.name=name;
		this.roll_number = roll_number;
		Dept = dept;
	}
	//Method Creation
	void studentDetails()
	{
		System.out.println("=========Student Details=========== ");
		System.out.println("===================================");
		System.out.println("Student Name: "+name);
		System.out.println("Student Roll Number is: "+roll_number);
		System.out.println("Student Department: "+Dept);
	}
}
class Addresss
{
	String door_number;
	String village;
	int pincode;
	String State;
	//Parameterized constructor for initialising the values for the variables
	public Addresss(String door_number, String village, String state,int pincode) {
		super();
		this.door_number = door_number;
		this.village = village;
		this.pincode = pincode;
		State = state;
	}
	//Method creation
	void addressDetails()
	{
		System.out.println("==========Address Details==========");
		System.out.println("===================================");
		System.out.println("Door Number: "+door_number);
		System.out.println("Village: "+village);
		System.out.println("Pincode: "+pincode);
		System.out.println("State: "+State);
	}	
}
public class Aggregation1 
{
	public static void main(String[] args)
	{
		Students student=new Students("Nishith Kumar", 5014 , "ECE");
	    Addresss address=new Addresss("22-7","Dharmavaram","AP",515671);
	    System.out.println("===================================");
	    student.studentDetails();
	    System.out.println("===================================");
	    address.addressDetails();
	}
    
    
}
