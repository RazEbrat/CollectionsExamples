package collectiondemos;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {

		HashSet<Integer> evenNums = new HashSet<Integer>();

		evenNums.add(2);
		evenNums.add(4);
		evenNums.add(6);

		System.out.println("Hashset: " + evenNums);

		HashSet<Integer> numbers = new HashSet<Integer>();
		
		//addAll ()
		numbers.addAll(evenNums);
		numbers.add(10);
		
		System.out.println("new HashSet: " + numbers);
		
		//removeAll ()
		numbers.removeAll(evenNums);
		System.out.println(numbers);

	}

}
