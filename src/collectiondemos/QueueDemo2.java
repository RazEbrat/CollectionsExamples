package collectiondemos;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueDemo2 {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();

		PriorityQueue pq = new PriorityQueue();

		// Adding elements add () offer ()

		ll.add("A");
		ll.add("B");
		ll.add("C");
		ll.offer(100);

		System.out.println(ll);

		// get head element element () peek ()
		System.out.println(ll.element());
		System.out.println(ll.peek());

		// if Queue is empty, element () will throw exception while peek () will return
		// null
		// System.out.println(pq.element());
		System.out.println(pq.peek());

		// Return and remove element remove () poll()

		// System.out.println(q.remove());
		System.out.println(ll);

		System.out.println(ll.poll());
		System.out.println(ll);

		// if Queue is empty, remove () will throw exception while poll () will return
		// null

		// System.out.println(pq.remove());
		System.out.println(pq.poll());

		// how to print all of the data from queue
		System.err.println("Printing elements using for each....loop ");
		for (Object ele : ll) {
			System.out.println(ele);
		}
		System.err.println("Printing elements using Iterator ");
		Iterator it = ll.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
