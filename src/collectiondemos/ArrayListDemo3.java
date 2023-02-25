package collectiondemos;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		
		String [] animals = {"dog", "cat", "elephant"};
		
		for (String value : animals) {
			System.out.println(value);
		}
		
		//converting the animals array into an array list
		ArrayList al = new ArrayList (Arrays.asList(animals));
		
		System.out.println(al);

	}

}
