package Java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Pattern pattern= Pattern.compile("W3Schhols", Pattern.CASE_INSENSITIVE);
		if(pattern.matcher("W3Schhols is the great web to learn").find()) {
			System.out.println("Match found");
		}
		else
			System.out.println("No match found");
		
	}

}
