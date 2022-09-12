package _Practice_que_till_63_P2;

import java.util.Scanner;

public class Strings_Remove_Duplicates {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		String str = scn.next();
		StringBuilder sb = new StringBuilder(str + " ");
		char ch = sb.charAt(0);
		for (int idx = 1; idx < sb.length(); idx++) {
			if (sb.charAt(idx) == ch) {
				
			} else {
				System.out.print(ch);
				ch = sb.charAt(idx);
			}
		}
	}

}
