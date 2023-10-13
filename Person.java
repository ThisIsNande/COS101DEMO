package PracTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Person  {
	private String name;
	private String surname;
	private String email;
	private String job;
	private String faculty;
	private int number;
	Scanner myReader;

	public Person() {

	}

	public Person(String name, String surname, String email, String job, String faculty, int number) {
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.job = job;
		this.faculty = faculty;
		this.number = number;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJob() {
		return this.job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getFaculty() {
		return this.faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public int getNumber() {
		return this.number;
	}

	public void setNumber(int number) {
		this.number = number;

	}

	public void display(String name) {

		String[] info = null;
		int number = 0;
		Person p = new Person(null, null, null, null, null, 0);
		Person[] classlist = new Person[9];

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
				p = new Person(info[0], info[1], info[2], info[3], info[4], number);

				for (i = 0; i < info.length; i++) {

					if (name.equals(p.getName())) {
						System.out.println("Name: " + info[0]);
						System.out.println("Surname: " + info[1]);
						System.out.println("Email: " + info[2]);
						System.out.println("Job: " + info[3]);
						System.out.println("Faculty: " + info[4]);
						System.out.println("Number: 0" + number + "\n");
						break;
					}
				}
			}
		} catch (FileNotFoundException e) {
			System.err.println("An error occurred.");
			e.printStackTrace();
		}

	}

	public void write() {
		try {
			File myObj = new File("mainrecord.txt");
			myReader = new Scanner(myObj);

			if (!myReader.hasNext()) {
				System.err.println("File Empty!");
				return;
			}

			while (myReader.hasNextLine()) {
				String[] info = myReader.nextLine().split(",");
				String job = info[3];

				FileWriter myWriter = null;
				if ("student".equals(job)) {
					myWriter = new FileWriter("studentrecord.txt", true);
				}if ("staff".equals(job)) {
					myWriter = new FileWriter("staffrecord.txt", true);
				} 

				myWriter.write("Name: " + info[0] + "\n" + "Surname: " + info[1] + "\n" + "Email: " + info[2] + "\n"
						+ "Job: " + info[3] + "\n" + "Faculty: " + info[4] + "\n" + "Number: 0" + info[5] + "\n");

				myWriter.close();
			}
		} catch (FileNotFoundException e) {
			System.err.println("An error occurred.");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("An error occurred while writing to the file.");
			e.printStackTrace();
		} finally {
			if (myReader != null) {
				myReader.close();
			}
		}
	}
}
