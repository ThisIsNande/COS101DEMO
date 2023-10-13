package sprint;

import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Main {

	public static JFrame frame, LogInFrame, HomeFrame;
	public static JLabel label, label2, label3, label4, label5, label6, label7, labels1, labels2, labels3, labels4;
	public static JButton button, buttons, buttons2, button3, button4, button5, button6, button7, button8, button9, button10;
	public static JTextField name, surname, number, email, FullName, DOB, gender, address, course, comments;
	public static JPasswordField password, password2;
	public static JMenuBar mb;
	public static JMenu x, y, z;
	public static JMenuItem m1,m2,m3, m4, m5, m6, m7;

	public static void main(String[] args) {

		Information info = new Information();

		LogInFrame = new JFrame("Log In");
		LogInFrame.setSize(400, 500);// 400 width and 500 height
		LogInFrame.setLayout(null);// using no layout managers

		labels1 = new JLabel("Log in ");
		labels1.setFont(new Font("Verdana", Font.BOLD, 15));
		labels1.setPreferredSize(new Dimension(250, 100));
		labels1.setBounds(60, 20, 250, 60);
		LogInFrame.add(labels1);

		labels2 = new JLabel("Full Name:");
		labels2.setBounds(50, 50, 250, 60);
		LogInFrame.add(labels2);

		FullName = new JTextField();
		FullName.setBounds(50, 90, 150, 30);
		LogInFrame.add(FullName);

		labels3 = new JLabel("Password:");
		labels3.setBounds(50, 100, 250, 60);
		LogInFrame.add(labels3);

		password2 = new JPasswordField();
		password2.setBounds(50, 140, 200, 30);
		LogInFrame.add(password2);

		buttons = new JButton("Get Started");
		buttons.setBounds(50, 190, 200, 30);
		LogInFrame.add(buttons);
		buttons.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String fullname = FullName.getText();
				info.setLogName(fullname);
				String passwords = password2.getText();
				info.setLogPassword(passwords);
				info.verify();
				
			}

		});

		buttons2 = new JButton("Register Here");
		buttons2.setBounds(200, 285, 120, 15);
		LogInFrame.add(buttons2);
		buttons2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				showFrameB();
			}

		});

		labels4 = new JLabel("Don't have an account?");
		labels4.setBounds(50, 260, 150, 60);
		LogInFrame.add(labels4);

		frame = new JFrame("Registration Form ");
		frame.setSize(400, 600);// 400 width and 500 height
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		button = new JButton("Submit");
		button.setBounds(80, 510, 250, 30);
		frame.add(button);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showFrameA();
				String Name = name.getText();
				info.setName(Name);
				String SurName = surname.getText();
				info.setSurname(SurName);
				String birthday = DOB.getText();
				info.setDOB(birthday);
				String Email = email.getText();
				info.setEmail(Email);
				String Gender = gender.getText();
				info.setGender(Gender);
				String Address = address.getText();
				info.setAddress(Address);
				String Number = number.getText();
				info.setNumber(Number);
				String Course = course.getText();
				info.setCourse(Course);
				String Password = password.getText();
				info.setPassword(Password);
				info.write();
			}
		});

		label = new JLabel("Registration Form ");
		label.setFont(new Font("Verdana", Font.BOLD, 15));
		label.setPreferredSize(new Dimension(250, 100));
		label.setBounds(80, 20, 250, 30);
		frame.add(label);

		label2 = new JLabel("First Name:");
		label2.setBounds(50, 40, 250, 30);
		frame.add(label2);

		name = new JTextField();
		name.setBounds(50, 70, 150, 25);
		frame.add(name);

		label3 = new JLabel("Last Name:");
		label3.setBounds(220, 40, 250, 30);
		frame.add(label3);

		surname = new JTextField();
		surname.setBounds(220, 70, 150, 25);
		frame.add(surname);

		label4 = new JLabel("Date of Birth:");
		label4.setBounds(50, 95, 250, 30);
		frame.add(label4);

		DOB = new JTextField();
		DOB.setBounds(50, 125, 150, 25);
		frame.add(DOB);

		label5 = new JLabel("Gender:");
		label5.setBounds(220, 95, 250, 30);
		frame.add(label5);

		gender = new JTextField();
		gender.setBounds(220, 125, 150, 25);
		frame.add(gender);

		label6 = new JLabel("Address:");
		label6.setBounds(50, 150, 250, 30);
		frame.add(label6);

		address = new JTextField();
		address.setBounds(50, 180, 200, 80);
		frame.add(address);

		label6 = new JLabel("Email:");
		label6.setBounds(50, 260, 250, 30);
		frame.add(label6);

		email = new JTextField();
		email.setBounds(50, 290, 200, 25);
		frame.add(email);

		label6 = new JLabel("Phone Number:");
		label6.setBounds(50, 315, 250, 30);
		frame.add(label6);

		number = new JTextField();
		number.setBounds(50, 345, 200, 25);
		frame.add(number);

		label6 = new JLabel("Course:");
		label6.setBounds(50, 370, 250, 30);
		frame.add(label6);

		course = new JTextField();
		course.setBounds(50, 400, 200, 25);
		frame.add(course);

		label6 = new JLabel("Create Password:");
		label6.setBounds(50, 425, 250, 30);
		frame.add(label6);

		password = new JPasswordField();
		password.setBounds(50, 455, 200, 30);
		frame.add(password);

		button3 = new JButton("Back");
		button3.setBounds(20, 570, 80, 15);
		frame.add(button3);
		button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				showFrameA();
			}
		});

		LogInFrame.setVisible(true);// making the Log in frame visible
		
		HomeFrame = new JFrame("Home Page ");
		HomeFrame.setSize(450, 600);// 400 width and 500 height
		HomeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mb = new JMenuBar();
		HomeFrame.setJMenuBar(mb);
		
		x = new JMenu("Modules");
		mb.add(x);
		
		y = new JMenu("My Certificates");
		mb.add(y);
		
		z = new JMenu("Library");
		mb.add(z);
		
		m1 = new JMenuItem("COS101");
		x.add(m1);
		m2 = new JMenuItem("MAT105");
		x.add(m2);
		m3 = new JMenuItem("PHY111");
		x.add(m3);
		
		m4 = new JMenuItem("Marks");
		y.add(m4);
		
		m5 = new JMenuItem("Course Resourses");
		z.add(m5);
		m6 = new JMenuItem("Articles");
		z.add(m6);
		
		label7 = new JLabel("Get Started on your path to becom an expert. ");
		label7.setFont(new Font("Georgia", Font.BOLD, 15));
		label7.setPreferredSize(new Dimension(250, 200));
		label7.setBounds(50, 30, 400, 50);
		HomeFrame.add(label7);
		
		button4 = new JButton("Get Started");
		button4.setBounds(50, 90, 150, 80);
		HomeFrame.add(button4);
		
		button5 = new JButton("Lessons");
		button5.setBounds(230, 90, 150, 80);
		HomeFrame.add(button5);
		
		button6 = new JButton("Calender");
		button6.setBounds(50, 230, 150, 80);
		HomeFrame.add(button6);
		
		button7 = new JButton("Time Table");
		button7.setBounds(230, 230, 150, 80);
		HomeFrame.add(button7);
		
		button8 = new JButton("Document " +"\n" +"Management");
		button8.setBounds(50, 370, 150, 80);
		HomeFrame.add(button8);
		
		button9 = new JButton("Countinouos " +"\n" +"Assessment");
		button9.setBounds(230, 370, 150, 80);
		HomeFrame.add(button9);
		
		button10 = new JButton("Log Out");
		button10.setBounds(100, 490, 200, 30);
		HomeFrame.add(button10);
		button10.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				showFrameA();
			}
		});
		
//		HomeFrame.setVisible(true);// making the Home frame visible
	}
	public static void showFrameA() {
		LogInFrame.setLayout(null);
		frame.setVisible(false);
		LogInFrame.setVisible(true);
		
		HomeFrame.setVisible(false);
	}

	public static void showFrameB() {
		frame.setLayout(null);
		frame.setVisible(true);
		
		LogInFrame.setVisible(false);
		HomeFrame.setVisible(false);
	}

	public static void showFrameC() {
		HomeFrame.setLayout(null);
		frame.setVisible(false);
		LogInFrame.setVisible(false);
		HomeFrame.setVisible(true);
		
	}

}
