package LinkedList;

import java.util.LinkedList;


public class LinkedListRepresentation {

	public static void main(String[] args) {
     //Creating a LinkedList
		LinkedList<String> list=new LinkedList<String>();
		list.add("Bangalore");
		list.add("Mumbai");
		list.add("Hydearabad");
		list.add("Chennai");
		System.out.println("Elements of the list is: " + list);
		//I want to add some more elements to the linked list
		//1st position
		list.addFirst("Delhi");
		//last position
		list.add("Gujarath");
		//2nd position
		list.add(2, "Bihar");
		System.out.println("Linked list after adding few more elements: " + list);
	}

}
