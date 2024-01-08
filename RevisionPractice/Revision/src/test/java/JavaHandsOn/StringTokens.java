package JavaHandsOn;

import java.util.Scanner;

public class StringTokens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String input=sc.nextLine()	;
		
		String[] parts= input.split("[A-Za-z]");
		
		System.out.println(parts[1]);
		
		sc.close();
	}

}
