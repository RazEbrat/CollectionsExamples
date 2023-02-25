package collectiondemos;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {

		// Declaring Linked List

//		LinkedList l = new LinkedList ();
//		LinkedList <Integer> l = new LinkedList <Integer> ();
//		LinkedList <String> l = new LinkedList <String> ();

		LinkedList l = new LinkedList();

		// add elements
		l.add(100);
		l.add("welcome");
		l.add(15.50);
		l.add('A');
		l.add(true);
		l.add(null);

		System.out.println(l);

		// finding the size
		System.out.println(l.size());

		// removing an element
		l.remove(3);
		System.out.println("after removing, new list: " + l);

		// adding elment in the middle of the linked list
		l.add(3, "Java");
		System.out.println("after inserting element, new list: " + l);

		// retrieving value/object
		l.get(3);
		System.out.println(l.get(3));

		// replacing the elements
		l.set(5, "X");
		System.out.println("after replacing the element, new list: " + l);

		// contains ();
		System.out.println(l.contains("Java"));
		System.out.println(l.contains("Python"));

		// isEmpty()
		System.out.println(l.isEmpty());

		// how to print all of the data from the linked list
		System.err.println("Printing elements using for loop.....");
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}

		System.err.println("Printing elements using for each...loop ");

		// storing all elements (hetrogenous) of l linked list in e object
		for (Object e : l) {
			System.out.println(e);
		}
		System.err.println("Printing elements using Iterator ");

		// Iterator is the parent interface of collection interface
		// iterator () return every single element from the linked list and stores it in
		// the Iterator
		Iterator it = l.iterator();

		// this method will return true, if there is a next element
		while (it.hasNext()) {
			// returns the element and moves to the next element, we could print it
			System.out.println(it.next());
		}
	}
}
