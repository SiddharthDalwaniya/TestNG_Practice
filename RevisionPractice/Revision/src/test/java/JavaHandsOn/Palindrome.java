package JavaHandsOn;

import java.util.Iterator;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the name here:");
		Scanner sc=new Scanner(System.in);
        String A=(sc.next()).toLowerCase();
        
        
        /* Enter your code here. Print output to STDOUT. */
        char[] characters= new char[A.length()];
        
        String reversName="";
        for(int i =0; i<A.length() ; i++) {
        	
        	characters[i]=A.charAt(A.length()-i-1);
        	reversName+=characters[i];
        }
		
        if(reversName.equalsIgnoreCase(A)) {
        	System.out.println("It's palindrome.");
        }
        else
        	System.out.println("It's not a palindrome. Please enter different word.");
	}

}
