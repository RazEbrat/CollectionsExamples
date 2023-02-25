package collectiondemos;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		al.add("C");

		ArrayList alDup = new ArrayList();

		alDup.addAll(al);

		System.out.println(alDup);

		alDup.removeAll(al);

		System.out.println("After removing: " + alDup);

		// Sorting...Collections.sort ();

		System.out.println("elemetns in the array list: " + al);
		Collections.sort(al);

		System.out.println("after sorting: " + al);

		// sorting in reverse order

		Collections.sort(al, Collections.reverseOrder());
		System.out.println("after sorting in reverse order: " + al);

		// Shuffling ... Collecitons.shuffle ()

		Collections.shuffle(al);
		System.out.println("elements in the array list after shuffling: " + al); // will take random order
		
		

	}

}
