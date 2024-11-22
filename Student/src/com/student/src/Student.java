package com.student.src;

public class Student {
	
	private int roll_number;
	private int student_id;
	private String name;
	private String father_name;
	private String mother_name;
	private String home_address;
	
	
	void setRoll_number(int roll_number) {
	this.roll_number=roll_number;
	}
	int getRoll_number() {
		return roll_number;
	}
	void setStudent_id(int student_id) {
		this.student_id=student_id;
	}
	int getStudent_id() {
		return student_id;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name=name;
	}
	String getFather_name()
	{
		return father_name;
	}
	void setFather_name(String father_name) {
		this.father_name=father_name;
	}
	String getMother_name() {
		return mother_name;
	}
	void setMother_name(String mother_name) {
		this.mother_name=mother_name;
	}
	void setHome_address(String home_address) {
		this.home_address=home_address;
	}
	String getHome_address() {
		return home_address;
	}
	Student()
	{
		this.roll_number=0;
		this.student_id=0;
		this.father_name="";
		this.mother_name="";
		this.home_address="";
	}
	@Override
	public String toString() {
		return "Student [roll_number=" + roll_number + ", student_id=" + student_id + ", name=" + name
				+ ", father_name=" + father_name + ", mother_name=" + mother_name + ", home_address=" + home_address
				+ "]";
	}
}
