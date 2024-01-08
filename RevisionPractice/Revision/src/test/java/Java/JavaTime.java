package Java;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class JavaTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date=LocalDate.now();
		
		LocalTime time=LocalTime.now();
		
		LocalDateTime dateAndTime = LocalDateTime.now();
		
	    DateTimeFormatter myFormatObj1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	    DateTimeFormatter myFormatObj2 = DateTimeFormatter.ofPattern("E dd/MMM/yyyy HH:mm:ss");
	    
	    System.out.println(dateAndTime.format(myFormatObj2));
	}

}
