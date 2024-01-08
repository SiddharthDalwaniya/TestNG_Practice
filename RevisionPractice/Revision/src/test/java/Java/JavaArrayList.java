package Java;

import java.util.*;

public class JavaArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list= new ArrayList<Integer>();
		
		list.add(3);
		list.add(2);
		list.add(5);
		list.add(4);
		
		list.sort(Collections.reverseOrder());
		
		System.out.println(list);
		
		for(int i:list) {
			System.out.println(i);
		}

	}

}
