package AssociationsWithJava;
 
class CarClass{
	String carName;
	int CarId;
	
	//Parameterized constructor
	CarClass(String name, int id){
		this.carName=name;
		this.CarId=id;
	}
}
class Driver extends CarClass{
	String driverName;
	Driver(String name, String cname, int cid){
		super(cname,cid);
		this.driverName=name;
	}
}
public class Associations {
    public static void main(String[] args) {
        Driver object = new Driver("Nishith", "Chevy Corvette", 9999);
        System.out.println(object.driverName + " Is a driver of : " + object.carName + " And CarId is: " 
        		+ object.CarId);
       	}
}
