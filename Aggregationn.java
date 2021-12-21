package AggregationInJava;


class Staff
{
	//Declaring Staff variables
	String Name;
	String Dept;
	String Subject;
	//Parameterized Constructor for Initialization of the variables
	public Staff(String name, String dept, String subject) {
		super();
		Name = name;
		Dept = dept;
		Subject = subject;
	}
	//Creating method
	void staffDetails()
	{
		System.out.println("=========================================");
		System.out.println("===========Staff Details=================");
		System.out.println("=========================================");
		System.out.println("Staff Name: "+Name);
		System.out.println("Staff Department: "+Dept);
		System.out.println("Staff Main Subject: "+Subject);
	}
}
class College
{
	//Declaring College Variables
	String college_name;
	int no_of_depts;
	int students_strength;
	int no_of_staff;
	String college_city;
	//Creating Constructor for initialization
	public College(String collegename, int noofdepts, int studentsstrength, int noofstaff,String collegecity) {
		super();
		this.college_name = collegename;
		this.no_of_depts = noofdepts;
		this.students_strength = studentsstrength;
		this.no_of_staff = noofstaff;
		this.college_city=collegecity;
	}
	//Creating method
	void collegeDetails()
	{
		System.out.println("========================================");
		System.out.println("============College Details=============");
		System.out.println("========================================");
		System.out.println("College Name is: "+college_name);
		System.out.println("No Of Departments in college: "+no_of_depts);
		System.out.println("No Of students in college: "+students_strength);
		System.out.println("No of staff in college: "+no_of_staff);
		System.out.println("College City: "+college_city);
	}
}
public class Aggregationn 
{
	public static void main(String[] args)
	{
		//Creating Objects for Both Staff and College
		Staff Object1=new Staff("Sachin","Cse","Java");
		College Object2=new College("JAIN",6,2000,250,"Bangalore");
		//System.out.println("===============================");
		//Invoking/Calling Staff_Details method
		Object1.staffDetails();
		//Invoking/Calling College_Details method
		Object2.collegeDetails();
	}

}