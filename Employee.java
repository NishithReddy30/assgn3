package Encapsulation;

class Employee_info{
	//usn, stfname, stlname, stmarks, stdept, stcity;
	private int empUsn;
	private String empFname;
	private String empLname;
	private String empDesgn;
	private String empLoc;
	private String empCity;
	//we need to create getter and setter
	public int getEmpUsn() {
		return empUsn;
	}
	public void setEmpUsn(int empUsn) {
		this.empUsn = empUsn;
	}
	public String getEmpFname() {
		return empFname;
	}
	public void setEmpFname(String empFname) {
		this.empFname = empFname;
	}
	public String getEmpLname() {
		return empLname;
	}
	public void setEmpLname(String empLname) {
		this.empLname = empLname;
	}
	public String getEmpDesgn() {
		return empDesgn;
	}
	public void setEmpDesgn(String empDesgn) {
		this.empDesgn = empDesgn;
	}
	public String getEmpLoc() {
		return empLoc;
	}
	public void setEmpLoc(String empLoc) {
		this.empLoc = empLoc;
	}
	public String getEmpCity() {
		return empCity;
	}
	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}
	
}
public class Employee {

	public static void main(String[] args) {
     //we need to create an object<======Class <---- Object
		Employee_info em = new Employee_info();
		em.setEmpUsn(1010);
		em.setEmpFname("Nishith");
		em.setEmpLname("B");
		em.setEmpDesgn("Software Engineer");
		em.setEmpLoc("Mumbai");
		em.setEmpCity("Bangalore");
		System.out.println("Employee Usn: " + em.getEmpUsn());
		System.out.println("Employee Firstname: " + em.getEmpFname());
		System.out.println("Employee Lastname: " + em.getEmpLname());
		System.out.println("Employee marks: " + em.getEmpDesgn());
		System.out.println("Employee Department: " + em.getEmpLoc());
		System.out.println("Employee City: " + em.getEmpCity());
	}

}


	


