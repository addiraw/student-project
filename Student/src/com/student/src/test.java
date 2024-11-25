package com.student.src;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		Map<String, Integer> s1= Map.of(
				"I",1,
				"V",2,
				"X",3
				
		);
		

		String str = "";
		Scanner s = new Scanner(System.in);
		str = s.nextLine();
		str = str.toLowerCase();
		System.out.print(funct(str));

	}
	
	public static int funct1(String s) {
		
		int sum=0;
		
		return sum;
	}

	public static int funct(String s) {
		int sum = 0, flagVX = 0, flagLC = 0, flagDM = 0;
		char[] sToChar = s.toCharArray();
		for (int i = 0; i < sToChar.length; i++) {
			switch (sToChar[sToChar.length - i - 1]) {

			case 'i':
				/*
				 * concept for check previous element is for subtraction.
				 */
				if (flagVX == 0)
					sum += 1;
				else if (flagVX == 5 || flagVX == 10)
					sum -= 1;
				break;
			case 'v':
				sum += 5;
				flagVX = 5;
				break;
			case 'x':
				sum+=10;
				flagVX = 10;
				
				
				/*
				 * concept for check previous element is for subtraction.
				 */
				if (flagLC == 0)
					sum += 10;
				else if (flagLC == 50 || flagLC == 100)
					sum = -10;
				break;
			case 'l':
				sum += 50;
				flagLC = 50;
				break;
			case 'c':
				/*
				 * concept for check previous element is for subtraction.
				 */
				flagLC = 100;
				flagDM = 10;
				if (flagDM == 0)
					sum += 100;
				else if (flagDM == 50 || flagDM == 100)
					sum = -100;
				break;
			case 'd':
				sum += 500;
				flagDM = 500;
				break;
			case 'm':
				sum += 1000;
				flagDM = 1000;
				break;
			default:
				System.out.print("wrong input !!!");
			}
		}
		return sum;

	}

}

class Mymain {
	int a;
}