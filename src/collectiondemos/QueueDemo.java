package collectiondemos;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {

		PriorityQueue q = new PriorityQueue();

		PriorityQueue pq = new PriorityQueue();

		// Adding elements add () offer ()

		q.add("A");
		q.add("B");
		q.add("C");
		q.offer("C");
	//	q.offer(100); throws ClassCastException

		System.out.println(q);

		// get head element element () peek ()

		System.out.println(q.element());
		System.out.println(q.peek());

		// if Queue is empty, element () will throw exception while peek () will return
		// null
		// System.out.println(pq.element());
		System.out.println(pq.peek());

		// Return and remove element remove () poll()

		// System.out.println(q.remove());
		System.out.println(q);

		System.out.println(q.poll());
		System.out.println(q);

		// if Queue is empty, remove () will throw exception while poll () will return
		// null

		// System.out.println(pq.remove());
		System.out.println(pq.poll());

		// how to print all of the data from queue
		System.err.println("Printing elements using for each....loop ");
		for (Object ele : q) {
			System.out.println(ele);
		}
		System.err.println("Printing elements using Iterator ");
		Iterator it = q.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
