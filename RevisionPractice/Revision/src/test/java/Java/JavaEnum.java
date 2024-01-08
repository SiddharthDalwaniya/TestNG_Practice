package Java;

public class JavaEnum {
	
	enum constants{
		LOW,
		MEDIUM,
		HIGH
	}
	
	public static void main(String args[]) {
		constants EnumVariable=  constants.HIGH;
		
		
		String other = "HIGH";
		if(EnumVariable.equals(other))
		System.out.println(other);
		else
			System.out.println("Fuck off");
	}

}
