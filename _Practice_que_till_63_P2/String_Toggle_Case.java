package _Practice_que_till_63_P2;

import java.util.Scanner;

public class String_Toggle_Case {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		String str = scn.next();
		StringBuilder sb = new StringBuilder();
		for (int idx = 0; idx < str.length(); idx++) {
			char ch = str.charAt(idx);
			int c = ch;
			sb.append((char) change(c, ch));
		}
		System.out.println(sb);
	}

	public static int change(int c, char ch) {
		if (ch >= 'A' && ch <= 'Z') {
			c = c + 32;
		} else if (ch >= 'a' && ch <= 'z') {
			c = c - 32;
		}
		return c;
	}

}
