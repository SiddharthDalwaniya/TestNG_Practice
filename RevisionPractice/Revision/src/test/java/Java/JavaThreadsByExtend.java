package Java;

public class JavaThreadsByExtend extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JavaThreadsByExtend thread= new JavaThreadsByExtend();
		thread.start();
		System.out.println("Main class is running.");
		
	}
	
	
	public void run() {
		System.out.println("The thread is running.");
	}

}
