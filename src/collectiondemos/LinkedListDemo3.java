package collectiondemos;

import java.util.LinkedList;

public class LinkedListDemo3 {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList ();
		
		ll.add("dog");
		ll.add("dog");
		ll.add("cat");
		ll.add("horse");
		
		System.out.println(ll);
		
		//add first 
		ll.addFirst("tiger");
		
		//add last
		ll.addLast("camel");
		
		System.out.println(ll);
		
		//get first element
		System.out.println(ll.getFirst());
		
		//get last element
		System.out.println(ll.getLast());
		
		//remove the first element
		ll.removeFirst();
		
		//remove the last element
		ll.removeLast();
		
		System.out.println("after removal first and last elments from linked list: " + ll);
		

	}

}
