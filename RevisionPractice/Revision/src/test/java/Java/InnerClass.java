package Java;

public class InnerClass {

	public static void main(String args[]) {
		OuterClass out=new OuterClass();
		OuterClass.InnerClass inner= out.new InnerClass();
		System.out.println(out.x+"   "+inner.y);
		inner.InnerMethod();


		//PRIVATE CLASS EXAMPLE BELOW
		POuterClass Pout=new POuterClass();
		POuterClass.PInnerClass Pinner= Pout.new PInnerClass(); 

		/****
		Had to user the protected  for the PInnerClass because it allows the the class/attribute to be visible in the same page for the sub/super class 

		If we use the private class, then it will give a error while compiling the code because private class/attribute can only be visible withing the declared class
		 ****/
		System.out.println();


	}
}

class OuterClass{
	int x=10;

	 public void OuterMethod() {
	  System.out.println("This is the outer method.");
	}
	class InnerClass{
		int y=20;
		public void InnerMethod() {
			OuterMethod();
		}
	}
}


//Example for the private out/inner class

class POuterClass{
	int a=11;
	public void OuterMethod() {

	}

	protected class PInnerClass{
		int b=22;

		public void PInnerMethod() {

		}
	}
}