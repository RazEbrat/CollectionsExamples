package collectiondemos;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableDemo {

	public static void main(String[] args) {

		Hashtable ht1 = new Hashtable(); // capacity is 11, load factor is 0.75
		Hashtable ht2 = new Hashtable(25); // initial capacity is set to 25
		Hashtable ht3 = new Hashtable(25, (float) 0.95);

		Hashtable<Integer, String> ht4 = new Hashtable<Integer, String>();

		ht4.put(101, "John");
		ht4.put(102, "David");
		ht4.put(103, "Smith");
		ht4.put(104, "Micheal");
		ht4.put(105, "Taylor");
		ht4.put(106, "John");

		System.out.println(ht4);

		// getting a value
		System.out.println(ht4.get(103));

		// removing a value from the HashTable
		ht4.remove(103);

		System.out.println(ht4);

		// checking a particular key is present or not
		System.out.println(ht4.containsKey(102));

		System.out.println(ht4.containsKey(103));

		// checking a particular value is present or not
		System.out.println(ht4.containsValue("John"));

		System.out.println(ht4.containsValue("Smith"));

		// HashTable is empty or not
		System.out.println(ht4.isEmpty());
		System.out.println(ht1.isEmpty());

		// return all the keys as a set
		System.out.println(ht4.keySet());

		// return all the values as a collection
		System.out.println(ht4.values());

		System.err.println("returning the keys and values one by one");
		for (int k : ht4.keySet()) {
			System.out.println(k + " " + ht4.get(k));
		}

		// Entry Interface methods
		System.out.println(ht4.entrySet());
		System.out.println("\nreturning the keys and values one by one");
		for (Map.Entry entry : ht4.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		System.out.println("\nreturning the keys and values one by one");
		Set s = ht4.entrySet();
		Iterator it = s.iterator();
		
		while (it.hasNext()) {
			Map.Entry entry =(Entry) it.next();
			System.out.println(entry.getKey() + " * " + entry.getValue());
		}

	}

}
