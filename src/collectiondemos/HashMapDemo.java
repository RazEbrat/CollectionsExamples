package collectiondemos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap hm = new HashMap();

		hm.put(101, "John");
		hm.put(102, "David");
		hm.put(103, "Scott");
		hm.put(104, "Mary");
		hm.put(105, "Taylor");
		hm.put(106, "Scott");
		hm.put(104, "Adkin"); // the new entry replaces the old one
		hm.put(107, "John"); // the new entry replaces the old one

		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();

		hm1.put(10, "Raz");
		hm1.put(20, "Qiyam");
		hm1.put(30, "Tamiz");
		hm1.put(40, "Anas");

		System.out.println(hm);

		// get () returns the value
		System.out.println(hm.get(103));

		// removing a pair from HashMap
		hm.remove(106);
		System.out.println(hm);

		// to check if a key is present in the HashMap
		System.out.println(hm.containsKey(101));
		System.out.println(hm.containsKey(106));

		// to check if a value is present in the HashMap
		System.out.println(hm.containsValue("John"));
		System.out.println(hm.containsValue("Mary"));

		// to check if HashMap is empty or not
		System.out.println(hm.isEmpty());

		// return all the keys as a set
		System.out.println(hm.keySet());

		// we could use a foreach loop to get every single key
		System.err.println("printing the keys an individual entities");
		for (Object i : hm.keySet()) {
			System.out.println(i);
		}

		// return all the values as a collection
		System.out.println(hm.values());

		// we could use a foreach loop to get every single value
		System.err.println("printing the values as individual entities");
		for (Object i : hm.values()) {
			System.out.println(i);
		}

		// return all the entries/pairs from the HashMap as a set
		System.out.println(hm.entrySet());

		// print keys and values one-by-one alongside eachother
		System.err.println("printing keys and values side-by-side");

//		for (Object i: hm.keySet()) {
//			System.out.println(i + " " + hm.get(i));
//		}
//		
//		System.err.println("using Entry Interface Methods");
//		for (Map.Entry entry: hm1.entrySet()) {
//			System.out.println(entry.getKey() + "  " + entry.getValue());
//		}

		System.err.println("\nusing Iterator");

		Set s = hm1.entrySet();
		Iterator it = s.iterator();

		while (it.hasNext()) {
			Map.Entry entry = (Entry) it.next();
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
	}
}
