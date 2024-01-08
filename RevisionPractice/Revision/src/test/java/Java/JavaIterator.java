package Java;

import java.util.*;

public class JavaIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arraylist=new ArrayList<Integer>();
		
		arraylist.add(1);
		arraylist.add(2);
		arraylist.add(3);
		
		Iterator<Integer>	it= arraylist.iterator()	;
		
		while(it.hasNext()) {
			Integer i=it.next();
			if(i<3) {
				it.remove();
			}
		}
		
		System.out.println(arraylist);
//		
		
		///-------_A code from ChatGPT------///
//		 ArrayList<Integer> numbers = new ArrayList<Integer>();
//
//	        // Add integers from 1 to 10
//	        for (int i = 1; i <= 10; i++) {
//	            numbers.add(i);
//	        }
//
//	        // Use a for loop to remove numbers less than 5
//	        for (int i = 0; i < numbers.size(); i++) {
//	            if (numbers.get(i) < 5) {
//	                numbers.remove(i);
//	               
//	                i--; // Decrement the index to recheck the current position
//	            }
//	        }
//
//	        // Print the modified ArrayList
//	        System.out.println("Integers greater than or equal to 5:");
//	        for (int number : numbers) {
//	            System.out.println(number);
//	            
//	        }
		
		
		////----------Concise cofr from chat GPT------///
//		List<Integer> numbers = new ArrayList<Integer>();
//
//        // Add integers from 1 to 10
//        for (int i = 1; i <= 10; i++) {
//            numbers.add(i);
//        }
//
//        // Use removeIf with a lambda expression to remove numbers less than 5
//        numbers.removeIf(number -> number < 5);
//
//        // Print the modified ArrayList
//        System.out.println("Integers greater than or equal to 5:");
//        numbers.forEach(System.out::println);
		
	}

}
