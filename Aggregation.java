package AggregationInJava;
class Address{
	int StreetNum;
	String city;
	String state;
	String country;
	//Parameterized constructor to initialize the values for variables
	Address(int Street, String c, String s, String Coun){
		this.StreetNum=Street;
		this.city=c;
		this.state=s;
		this.country=Coun;
	}
}
//Created student class and assigned with states of the same
class Student{
	int rollno;
	String studentName;
	Address studentaddr;
	//Parameterized constructor to initialize the values for variables
	Student(int roll, String Sname, Address addr){
		this.rollno=roll;
		this.studentName=Sname;
		this.studentaddr=addr;
	}
}
public class Aggregation {
 public static void main(String[] args) {
     //we need to create an object for the classes.
		//Object create for Address class 
		Address ad = new Address(7  ,"Dharmavaram","AP","India");
		//Object created for student class
		Student obj = new Student(5014, "Nishith", ad);
		System.out.println("studentRollNum: "+obj.rollno);
		System.out.println("studentName: "+obj.studentName);
		System.out.println("StreetNum: "+obj.studentaddr.StreetNum);
		System.out.println("Cityname: "+obj.studentaddr.city);
		System.out.println("StateName: "+obj.studentaddr.state);
		System.out.println("Country: "+obj.studentaddr.country);
	}
}