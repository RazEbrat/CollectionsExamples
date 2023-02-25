package collectiondemos;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList ();
		
		l.add("X");
		l.add("Y");
		l.add("Z");
		l.add("A");
		l.add("B");
		l.add("C");
		
		LinkedList ll = new LinkedList ();
		
		ll.addAll(l);
		System.out.println(ll);
		
		ll.removeAll(l);
		System.out.println("after removal:" + ll);
		
		//sort()
		System.out.println("Before sortring: " + l);
		
		Collections.sort(l);
		System.out.println("After sortring: " + l);
		
		
		//sort in reverse order
		Collections.sort(l,Collections.reverseOrder());
		System.out.println("Reverse order sortring: " + l);
		
		//shuffling
		Collections.shuffle(l);
		System.out.println("After shuffling: " + l);
		
		

	}

}
