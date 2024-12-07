package com.student.src;

import java.util.Scanner;

import com.student.db.DbConnectionCheck;

public class Main {
	static int max = 10, counter = 0, flag = 0, option;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student s = new Student();
//		s.menu();
		DbConnectionCheck.check();;
	}

}
