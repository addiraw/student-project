package com.student.src;

import java.util.ArrayList;
import java.util.List;

public class Student {

	private int rollNumber;
	private int studentId;
	private String name;
	private String fatherName;
	private String motherName;
	private String homeAddress;
	private static List<Student> allObjects = new ArrayList<>();

	void setrollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	int getRollNumber() {
		return rollNumber;
	}

	void setstudentId(int studentId) {
		this.studentId = studentId;
	}

	int getstudentId() {
		return studentId;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getfatherName() {
		return fatherName;
	}

	void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	String getMotherName() {
		return motherName;
	}

	void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	String getHomeAddress() {
		return homeAddress;
	}

	Student() {
		this.rollNumber = 0;
		this.studentId = 0;
		this.fatherName = "";
		this.motherName = "";
		this.homeAddress = "";
		allObjects.add(this);
		System.out.println(allObjects);
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", studentId=" + studentId + ", name=" + name + ", fatherName="
				+ fatherName + ", motherName=" + motherName + ", homeAddress=" + homeAddress + "]";
	}

	void viewAllSstudent() {
		// TODO Auto-generated method stub

		System.out.println("Student Id: " + getstudentId());
		System.out.println("Student Roll No: " + getRollNumber());
		System.out.println("Student Name: " + getName());
		System.out.println("Student Father Name: " + getfatherName());
		System.out.println("Student Mother Name: " + getMotherName());
		System.out.println("Studetns FatherName: " + getfatherName());
		System.out.println("Student Home Address: " + getHomeAddress());
	}

	void addstudent() {
		// TODO Auto-generated method stub
		Student newStudent = new Student();
		
		main.take_input.nextLine();

		System.out.println("please enter the roll no:");
		int roll_no = Integer.parseInt(main.take_input.nextLine());
		setrollNumber(roll_no);

		System.out.println("Enter the studentId");
		int studentId = Integer.parseInt(main.take_input.nextLine());

		setstudentId(studentId);

		System.out.println("Enter the name");
		String name = main.take_input.nextLine();
		setName(name);

		System.out.println("Enter the father name");
		String fatherName = main.take_input.nextLine();
		setFatherName(fatherName);

		System.out.println("Enter the mother name");
		String motherName = main.take_input.nextLine();
		setMotherName(motherName);

		System.out.println("Etner the home address");
		String homeAddress = main.take_input.nextLine();
		setHomeAddress(homeAddress);
	}

	void displayStudent(int roll_no) {
		// TODO Auto-generated method stub

		System.out.println("Student Id: " + getstudentId());
		System.out.println("Student Roll No: " + getRollNumber());
		System.out.println("Student Name: " + getName());
		System.out.println("Student Father Name: " + getfatherName());
		System.out.println("Student Mother Name: " + getMotherName());
		System.out.println("Studetns FatherName: " + getfatherName());
		System.out.println("Student Home Address: " + getHomeAddress());

	}

	void searchStudent() {
		// TODO Auto-generated method stub

	}

	void deleteStudent(int roll_no) {
		// TODO Auto-generated method stub

	}

	void updateStudent(int roll_no) {
		// TODO Auto-generated method stub

		System.out.println("please enter the name");
		String name = main.take_input.nextLine();
		setName(name);

		System.out.println("Enter the father name");
		String fatherName = main.take_input.nextLine();
		setFatherName(fatherName);

		System.out.println("Enter the mother name");
		String motherName = main.take_input.nextLine();
		setMotherName(motherName);

		System.out.println("Enter the home address");
		String homeAddress = main.take_input.nextLine();
		setHomeAddress(homeAddress);

	}

	void menu() {

		do {
			System.out.println("welcome please select from below");
			System.out.println("1. Add a new student");
			System.out.println("2. Display student details");
			System.out.println("3. Search for student by their id or name");
			System.out.println("4. Delete student records");
			System.out.println("5. Update student information");
			System.out.println("6. View all students");
			System.out.println("0  For exit");
			main.option = main.take_input.nextInt();

			switch (main.option) {
			case 1:
				System.out.println("Add a new student");
				addstudent();
				break;
			case 2:
				System.out.println("Display student details");
				System.out.println("Enter the roll no:");
				int roll_no = main.take_input.nextInt();
				displayStudent(roll_no);
				break;
			case 3:
				System.out.println("Search for student by their id or name");
				searchStudent();
				break;
			case 4:
				System.out.println("Delete student records");
				System.out.println("please enter the roll no to delete");
				main.take_input.nextLine();
				roll_no = Integer.parseInt(main.take_input.nextLine());
				deleteStudent(roll_no);
				break;
			case 5:
				System.out.println("Update student information");
				System.out.println("please enter the roll no to update");
				roll_no = Integer.parseInt(main.take_input.nextLine());
				updateStudent(roll_no);
				break;
			case 6:
				System.out.println("View all students");
				viewAllSstudent();
				break;
			case 0:
				System.out.println("exiting to program");
				return;
			default:
				System.out.println("Wrong choice");
				break;
			}

		} while (main.option != 0);

	}
}
