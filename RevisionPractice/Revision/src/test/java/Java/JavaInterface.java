package Java;

//import java.time.*;

public class JavaInterface implements FirstInterface{

	public void FirstMethod() {
		// TODO Auto-generated method stub
		System.out.println("It is the first method.");
	}

	public void SecondMethod() {
		// TODO Auto-generated method stub
		System.out.println("It is the second method.");
	}
	
	public static void main(String args[]) {
		JavaInterface inter= new JavaInterface();
		inter.FirstMethod();
		inter.SecondMethod();
		//System.out.println(x);
	}
	
}

interface FirstInterface{
	//int x=1;
	void FirstMethod();
	void SecondMethod();
	
	
}
