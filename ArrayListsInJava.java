package Collections;

import java.util.ArrayList;

public class ArrayListsInJava {

	public static void main(String[] args) {
		//We had created an array-list
        ArrayList<String> Names = new ArrayList<String>();
        //Add an elements to the array-list     
        //In built method and i.e., add(); //This will takes only one parameter <Int, String>
        Names.add("Nishith");//<======0
        Names.add("Java");//<======1
        Names.add("Programming");//<=====2
        Names.add("ArrayList");//<======3
        Names.add("Dharmavaram");//<=====4
        //Displaying the array elements
        System.out.println("Array elements are: " + Names);
        //If you want to add any elements at any place of the position within the array....!
        Names.add(5,"OnePlus");
        System.out.println("New elements added and the array is: ");
        System.out.println(Names);
        //We can change the elements of arrays at any moment of time
        Names.add(3,"Technical");
        System.out.println("Element is been changed at position no.3");
        System.out.println(Names);
        
        //In order to remove any element from the array
        Names.remove("ArrayList");
        System.out.println("List elements after removing 'ArrayList' : ");
        System.out.println(Names);
        
        
	}

}
