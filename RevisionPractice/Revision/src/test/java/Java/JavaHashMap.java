package Java;

import java.util.HashMap;

public class JavaHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
		hashmap.put("Gujarat", 1);
		hashmap.put("Madhyapradesh", 2);
		hashmap.put("Delhi",3);
		
		for (String i : hashmap.keySet()) {
			System.out.println("Key: "+ i + " & Value: "+ hashmap.get(i));
			
		}
	
	}

}
