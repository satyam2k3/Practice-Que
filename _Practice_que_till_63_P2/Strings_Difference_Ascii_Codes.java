package _Practice_que_till_63_P2;

import java.util.Scanner;

public class Strings_Difference_Ascii_Codes {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		String str = scn.next();
		StringBuilder sb = new StringBuilder();
		sb.append(str.charAt(0));
		for (int idx = 1; idx < str.length(); idx++) {
			int num = (int) str.charAt(idx) - (int) str.charAt(idx - 1);
			sb.append(num);
			sb.append(str.charAt(idx));
		}
		System.out.println(sb);
	}

}
