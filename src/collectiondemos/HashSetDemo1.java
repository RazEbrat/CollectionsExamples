package collectiondemos;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main(String[] args) {

		HashSet hs = new HashSet(); // default capacity is 16 and Load Factor is 0.75

//		HashSet hs1 = new HashSet(100); // initial capacity is 100
//		
//		HashSet hs2 = new HashSet(100, (float)0.90); // initial capacity is 100
//		
//		HashSet<Integer> hs3 = new HashSet<Integer> (); 

		// Add elements
		hs.add(100);
		hs.add("welcome");
		hs.add(16.4);
		hs.add('A');
		hs.add(true);
		hs.add(null);

		System.out.println(hs);

		// remove ()
		hs.remove(16.4);
		System.out.println("after removing the element: " + hs);

		// contains
		System.out.println(hs.contains("welcome"));

		System.out.println(hs.contains("Welcome"));

		// to check if it is empty or not
		System.out.println(hs.isEmpty());

		System.err.println("Printing elements using for each....loop ");

		for (Object e : hs) {
			System.out.println(e);
		}

		System.err.println("Printing elements using Iterator ");

		// Iterator is the parent interface of collection interface
		// iterator () return every single element from the HashSet and stores it in
		// the Iterator
		Iterator it = hs.iterator();

		// this method will return true, if there is a next element
		while (it.hasNext()) {
			// returns the element and moves to the next element, we could print it
			System.out.println(it.next());
		}

	}

}
