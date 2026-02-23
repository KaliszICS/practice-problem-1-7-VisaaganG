/**
	* File: Lesson 1.7 - Booleans (and, or, not)
	* Author: Visaagan Gunabalachandran
	* Date Created: Feb 14, 2023
	* Date Last Modified: Feb 23, 2026
	*/

import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner input = new Scanner(System.in);
		boolean bool1;
		boolean bool2;
		bool1 = true;
		bool2 = false;
		System.out.println(bool1 && bool2); 
		System.out.println(bool1 || bool2);
	}

	public static void q2() {
		//Write question 2 code here
		Scanner input = new Scanner(System.in);
		String letter1;
		String letter2;
		boolean bool;
		System.out.print("Input a lowercase letter: ");
		letter1 = input.next();
		System.out.print("Input another lowercase letter: ");
		letter2 = input.next();
		char l1 = letter1.charAt(0);
		char l2 = letter2.charAt(0);
		bool = l1 < l2;
		System.out.println(bool)
;	
	}

	public static void q3() {
		//Write question 3 code here
		Scanner input = new Scanner(System.in);
		boolean bool;
		double num;
		System.out.print("Input a number: ");
		num = input.nextDouble();
		bool = num >= 0 && num <= 10;
		System.out.println(bool);
	}

	public static void q4() {
		//Write question 4 code here
		Scanner input = new Scanner(System.in);
		boolean bool;
		double num;
		System.out.print("Input a number: ");
		num = input.nextDouble();
		bool = num > 0 && num != 5;
		System.out.println(bool);
	}

	public static void q5() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		boolean bool;
		String word1;
		word1 = "banana";
		System.out.print("Input a word: ");
		word1 = input.nextLine();
		bool = !word1.equals("banana");
		System.out.println(bool);
	}

	public static void q6() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		int num;
		System.out.print("Enter an integer: ");
		num = input.nextInt();
		boolean bool;
		bool = num % 2 == 0;
		System.out.println("The integer " + num + " is " + bool);
	}

}
