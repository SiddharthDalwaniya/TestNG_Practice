package Java;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class javaFileActions {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub



		javaFileActions fileAction= new javaFileActions();

		//fileAction.FileCreation("/Users/siddharthdalwaniya/Desktop/PracticeFiles/SeleniumPractice/RevisionPractice/Revision/target/ReadMe.txt");

		//fileAction.FileDeletion("/Users/siddharthdalwaniya/Desktop/PracticeFiles/SeleniumPractice/RevisionPractice/Revision/target/ReadMe.txt");
		
//		fileAction.FileWrite("/Users/siddharthdalwaniya/Desktop/PracticeFiles/SeleniumPractice/RevisionPractice/Revision/target/ReadMe.txt");
	
		fileAction.FileRead("/Users/siddharthdalwaniya/Desktop/PracticeFiles/SeleniumPractice/RevisionPractice/Revision/target/ReadMe.txt");
	}


	public void FileCreation(String file) throws IOException {
		//File creation
		File files= new File(file);

		if(files.createNewFile()) {
			System.out.println("File with the name \""+files.getName()+"\" has been created.");
		}
		else
			if(files.exists())
				System.out.println("The file you are trying to create already exists.");
			else
				System.out.println("Files creation has failed.");
	}



	public void FileDeletion(String file) throws IOException{

		File files=new File(file);

		if(files.exists()) {
			if(files.delete())
				System.out.println("File \""+files.getName()+"\" has been deleted");
			else
				if(files.exists())
					System.out.println("File deletion has failed. Sorry.");
					
		}
		else
			System.out.println("File might not exists.");
	}

	public void FileWrite(String file) throws Exception{
		File files=new File(file);
		try {
			FileWriter filewriter= new FileWriter(files);
			filewriter.write("This is written by java code.");

			filewriter.close();

			System.out.println("File has some texts writteen successfully in it. Thanks.");

		}
		catch(Exception E) {
			throw new Exception("Something has gone wrong. Check the code lawde.");
		}


	}

	public void FileRead(String file) throws Exception{
		try{ 
			File files = new File(file);


			Scanner sc=  new Scanner(files);

			while(sc.hasNext()) {
				System.out.println(sc.nextLine());		
			}

			sc.close();
		}
		catch(Exception E) {
			E.getCause();
		}





	}
}
