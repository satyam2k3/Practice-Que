package _Practice_que_till_63_P1;

import java.util.Scanner;

public class Lower_Upper {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char ch = scn.next().charAt(0);
		// if else ladder it is
		if (ch >= 'A' && ch <= 'Z') {
			System.out.println("UPPERCASE");
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println("lowercase");
		} else {
			System.out.println("Invalid");
		}

	}

}
