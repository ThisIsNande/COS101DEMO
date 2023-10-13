package PracTest;

public class Student {
	String name;
	int age;
	long mobileNo;
	int year;

	public Student() {

	}

	public Student(String name, int age, long mobileNo, int year) {
		this.name = name;
		this.age = age;
		this.mobileNo = mobileNo;
		this.year = year;
	}

	void displayStudent() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Mobile No: " + this.mobileNo);
		System.out.println("Year: " + this.year);
	}

	public static void main(String args[]) {

		Student s1 = new Student("Alex", 21, 1234567891, 10);
		Student s2 = new Student("Bob", 37, 1987654321, 11);

		s1.displayStudent();
		s2.displayStudent();
	}

}
