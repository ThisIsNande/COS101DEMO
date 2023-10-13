package PracTest;

/*
Read a File
In the previous chapter, you learned how to create and write to a file.
In the following example, we use the Scanner class to read the contents of the text file 
*/
import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Arrays;
import java.util.Scanner; // Import the Scanner class to read text files

public class Main {

	public static void main(String[] args) {
		String[] info = null;
		String name;
		int number = 0;
		Person p = new Person(null,null,null,null,null,0);
		Person[] classlist = new Person[9] ;
		
		try {
			File myObj = new File("mainrecord.txt");
			Scanner myReader = new Scanner(myObj);
			
			if (!myReader.hasNext()) {
				System.err.println("File Empty!");
			}
			int i = 0;
			while (myReader.hasNextLine()) {
				info = myReader.nextLine().split(",");
				
				p.setName(info[0]);
				p.setSurname(info[1]);
				p.setEmail(info[2]);
				p.setJob(info[3]);
				p.setFaculty(info[4]);
				number = Integer.parseInt(info[5]);
				p.setNumber(number);
				
				classlist[i++] = p;
				
				p = new Person(info[0],info[1],info[2],info[3],info[4],number);
				
			}myReader.close();
			p.display("Bran");
			p.write();

		} catch (FileNotFoundException e) {
			System.err.println("An error occurred.");
			e.printStackTrace();
		}
	}
}
