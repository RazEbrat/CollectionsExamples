package collectiondemos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {

		// it accepts any type of data
		ArrayList al = new ArrayList();

		// another way of declaration
		List al1 = new ArrayList();

		// we could restrict it to one type
		ArrayList<String> names = new ArrayList<String>();

		// adds new elemetns to the arraylist
		al.add(100);
		al.add("welcome");
		al.add(10.5);
		al.add('A');
		al.add(true);

		System.out.println(al);

		// number of elemets
		al.size();
		System.out.println("Number of elements in array list: " + al.size());

		// remove some elements fromt the array
		// al.remove(1); //here 1 is index
		al.remove("welcome"); // here welcome is an element

		System.out.println("After removing an element form the array list: " + al);

		// insert a new element
		al.add(2, "Python");

		System.out.println("After insertion: " + al);

		// retriev a specific element
		al.get(2);
		System.out.println(al.get(2));

		// replace an element with a new one
		al.set(2, "Java");
		System.out.println("After replacing element: " + al);

		// search an element
		System.out.println(al.contains("Java"));

		System.out.println(al.contains("C++"));

		// isEmpty
		System.out.println(al.isEmpty());

		// how to print all of the data from the array list
		System.err.println("Printing elements using for loop.....");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		System.err.println("Printing elements using for each....loop ");
		
		//storing all elements of al array list in e object
		for (Object e: al) {
			System.out.println(e);
		}
		System.err.println("Printing elements using Iterator ");
		
		// Iterator is the parent interface of collection interface
		//iterator () return every single element from the array list and stores it in the Iterator
		Iterator it = al.iterator();
		
		//this method will return true, if there is a next element
		while (it.hasNext())
		{
			// returns the element and moves to the next element, we could print it
			System.out.println(it.next());
		}
	}
}
