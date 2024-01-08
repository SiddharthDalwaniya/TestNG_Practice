package Java;

public class JavaThreadsByImplement implements Runnable {
	
	public static int price=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JavaThreadsByImplement obj=new JavaThreadsByImplement()	;
		Thread thread= new Thread(obj);
		
		thread.start();
		System.out.println("This is the main thread.");
		
		while(thread.isAlive()){
		System.out.println("Waitingggggg......");
		
		}
		
		System.out.println("Main : "+ price);
		price++;
		System.out.println("Main : "+price);
	}
	
	public void run() {
		System.out.println("This is the Runnable interfaces' thread.");
		price++;
	}
	

}
