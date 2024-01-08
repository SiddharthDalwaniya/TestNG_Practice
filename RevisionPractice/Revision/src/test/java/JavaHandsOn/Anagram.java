package JavaHandsOn;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}

	static boolean isAnagram(String a, String b) {
		String first=a.toLowerCase();
		String second=b.toLowerCase();
		
		if(a.length()==b.length()) {

		boolean flag=true;
		for(int i=0; i<first.length();i++) {
			
			
			int n=0;
			int m=0;
			
			
			for(int z=0; z<first.length();z++) {
				if(first.charAt(i)==first.charAt(z))
					n++;				
			}
			
			
			
			for(int z=0; z<b.length();z++) {
				if(first.charAt(i)==second.charAt(z))
					m++;
//				System.out.println(second.charAt(z)+"===="+first.charAt(i));
			}
			//System.out.println(m);

			if(n!=m) {
				
				flag=false;
				break;
			}
			
		}
		return flag;
		
		}
		else
			return false;



	}

}
