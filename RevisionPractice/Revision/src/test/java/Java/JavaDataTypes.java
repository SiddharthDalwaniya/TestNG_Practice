package Java;

public class JavaDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=1,b=3;
		
		boolean x=a>b?true:false;
		
		if(!(x)) {
			System.out.println("Hey you fucking expert!!");
		}
		else {
			System.out.println("Hey you learn some more things!");
		}
		
		
		print();
		
	}
	
	public static void print() {
	 System.out.println("Hello world!");
	 recurssion();
	}
	
	public static void  recurssion() {
		print();
	}

}
