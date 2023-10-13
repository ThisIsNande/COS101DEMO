package sprint;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class Information extends Main{
	private String name;
	private String surname;
	private String email;
	private String DOB;
	private String gender;
	private String address;
	private String number;
	private String course;
	private String password;
	Scanner myWriter;
	private String logname;
	private String logpassword;
	
	
	public Information() {

	}
	
	public Information(String name, String surname, String email, String DOB, String gender, String address, String number, String course, String password) {
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.DOB = DOB;
		this.gender = gender;
		this.address = address;
		this.number = number;
		this.course = course;
		this.password = password;
		this.logname = logname;
		this.logpassword = logpassword;
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getSurname() {
		return this.surname;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setDOB(String DOB) {
		this.DOB = DOB;
	}
	
	public String getDOB() {
		return this.DOB;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getNumber() {
		return this.number;
	}
	
	public void setCourse(String course) {
		this.course = course;
	}
	
	public String getCourse() {
		return this.course;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return this.password; 
	}
	
	public void setLogName(String logname) {
		this.logname = logname;
	}
	
	public String getLogName() {
		return this.logname;
	}
	
	public void setLogPassword(String logpassword) {
		this.logpassword = logpassword;
	}
	
	public String getLogPassword() {
		return this.logpassword;
	}
	
	public void write() {
				
		try {
			File myObj = new File("Record.txt");
			FileWriter  myWriter = new FileWriter(myObj, true);

			myWriter.write("Name: " +  getName() +","+ " Surname: " + getSurname() +","+ " Date of Birth: " + getDOB() +","+ " Gender: " + getGender() +","+ " Address: " + getAddress() +","+ " Email: " + getEmail() +","+ " Phone Number:" + getNumber() +","+ " Course: " + getCourse() +","+ " Password: " + getPassword() + "\n") ;
			myWriter.close();
		} catch (IOException e) {
			System.err.println("An error occurred while writing to the file.");
			e.printStackTrace();
		}
	}
	public void verify() {
		
		String first = getName() +" "+ getSurname() ;
		String second = getLogName();
		String third = getPassword();
		String forth = getLogPassword();
		if (!first.equals(second)) {
			JOptionPane.showMessageDialog(LogInFrame, "Incorrect Password!");
		}else {
			showFrameC();
		}
		if (!third.equals(forth)) {
			JOptionPane.showMessageDialog(LogInFrame, "Incorrect Password!");
		}
	}
	
}
