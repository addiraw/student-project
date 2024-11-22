package com.student.src;

import java.util.Scanner;

public class main {
	static int max = 10, counter = 0, flag = 0, option;

	static Scanner take_input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();

	}

	static Student[] students = new Student[max];

	private static void viewAllSstudent() {
		// TODO Auto-generated method stub

		for (Student s : students) {
			if (s != null) {
				System.out.println("Student Id: " + s.getStudent_id());
				System.out.println("Student Roll No: " + s.getRoll_number());
				System.out.println("Student Name: " + s.getName());
				System.out.println("Student Father Name: " + s.getFather_name());
				System.out.println("Student Mother Name: " + s.getMother_name());
				System.out.println("Studetns FatherName: " + s.getFather_name());
				System.out.println("Student Home Address: " + s.getHome_address());
			}
		}

	}

	public static void menu() {
		System.out.println("welcome please select from below");
		System.out.println("1. Add a new student");
		System.out.println("2. Display student details");
		System.out.println("3. Search for student by their id or name");
		System.out.println("4. Delete student records");
		System.out.println("5. Update student information");
		System.out.println("6. View all students");
		System.out.println("0  For exit");

		do {

			option = take_input.nextInt();

			switch (option) {
			case 1:
				System.out.println("Add a new student");
				addstudent();
				break;
			case 2:
				System.out.println("Display student details");
				System.out.println("Enter the roll no:");
				int roll_no = take_input.nextInt();
				displayStudent(roll_no);
				break;
			case 3:
				System.out.println("Search for student by their id or name");
				searchStudent();
				break;
			case 4:
				System.out.println("Delete student records");
				System.out.println("please enter the roll no to delete");
				take_input.nextLine();
				roll_no = Integer.parseInt(take_input.nextLine());
				deleteStudent(roll_no);
				break;
			case 5:
				System.out.println("Update student information");
				System.out.println("please enter the roll no to update");
				roll_no = Integer.parseInt(take_input.nextLine());
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

		} while (option != 0);

	}

	private static void updateStudent(int roll_no) {
		// TODO Auto-generated method stub

		for (Student s : students) {
			if (s != null && s.getRoll_number() == roll_no) {

				System.out.println("please enter the name");
				String name = take_input.nextLine();
				students[counter].setName(name);

				System.out.println("please enter the mother name");
				String mother_name = take_input.nextLine();
				students[counter].setFather_name(mother_name);

				System.out.println("please enter the father name");
				String father_name = take_input.nextLine();
				students[counter].setMother_name(father_name);

				System.out.println("please etner the home address");
				String home_address = take_input.nextLine();
				students[counter].setHome_address(home_address);
				displayStudent(roll_no);
			}

		}
	}

	private static void deleteStudent(int roll_no) {
		// TODO Auto-generated method stub
		int index = -1;
		for (int i = 0; i < students.length; i++) {
			
			if (students[i]!=null) {
				if (students[i].getRoll_number() == roll_no)
					index = i;
			}

		}
		Student[] students_1 = new Student[students.length - 1];
		for (int i = 0, j = 0; i < students_1.length; i++) {
			if (i != index)
				students_1[j++] = students[i];

		}
		students=students_1;
		

	}

	private static void searchStudent() {
		// TODO Auto-generated method stub
		System.out.println("Please enter the search criteria");
		System.out.println("By Roll No: ");
		System.out.println("please enter the rol no:");
		take_input.nextLine();
		int roll_no = Integer.parseInt(take_input.nextLine());
		System.out.println("Student with roll no:" + roll_no);
		for (Student s : students) {
			if (s != null && s.getRoll_number() == roll_no) {
				System.out.println(roll_no);
				displayStudent(roll_no);
				break;
			}

		}

	}

	private static void displayStudent(int roll_no) {
		int flag = 0;
		// TODO Auto-generated method stub
		for (Student s : students) {
			if (s != null && roll_no == s.getRoll_number()) {
				System.out.println("Student Id: " + s.getStudent_id());
				System.out.println("Student Roll No: " + s.getRoll_number());
				System.out.println("Student Name: " + s.getName());
				System.out.println("Student Father Name: " + s.getFather_name());
				System.out.println("Student Mother Name: " + s.getMother_name());
				System.out.println("Studetns FatherName: " + s.getFather_name());
				System.out.println("Student Home Address: " + s.getHome_address());
				flag = 1;

			}
		}
		if (flag == 0)
			System.out.println("Not found");

	}

	private static void addstudent() {
		// TODO Auto-generated method stub

		students[counter] = new Student();
		take_input.nextLine();

		System.out.println("please enter the roll no:");
		int roll_no = Integer.parseInt(take_input.nextLine());
		/*
		 * Check duplicate roll number
		 */
		for (int i = 1; i < students.length; i++) {

			if (students[i] != null) {
				if (roll_no == students[i].getRoll_number()) {
					System.out.println("please provide unique roll no the number you have provided is duplicate:");
					roll_no = Integer.parseInt(take_input.nextLine());
					i = 0;
				}

			}

		}

		students[counter].setRoll_number(roll_no);

		System.out.println("please enter the student_id");
		int student_id = Integer.parseInt(take_input.nextLine());
		
		students[counter].setStudent_id(student_id);

		System.out.println("please enter the name");
		String name = take_input.nextLine();
		students[counter].setName(name);

		System.out.println("please enter the mother name");
		String mother_name = take_input.nextLine();
		students[counter].setFather_name(mother_name);

		System.out.println("please enter the father name");
		String father_name = take_input.nextLine();
		students[counter].setMother_name(father_name);

		System.out.println("please etner the home address");
		String home_address = take_input.nextLine();
		students[counter].setHome_address(home_address);
		counter++;

	}

}
