package Collections;

import java.util.ArrayList;
import java.util.List;

public class CopyArrayList {

	public static void main(String[] args) {
    //Create  a arraylist <-----Object
	ArrayList<String> array=new ArrayList<String>();
	//Add elements to the array
	array.add("10, 20, 30, 40");
	System.out.println("This is first arraylist: " + array);
	List<String> list=new ArrayList<String>();
	//Add the elements
	list.add("50, 60, 70");
	array.addAll(list);
	System.out.println("Updated arrayList Elements are: " + array);
	}

}
 