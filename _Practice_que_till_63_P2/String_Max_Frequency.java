package _Practice_que_till_63_P2;

import java.util.ArrayList;
import java.util.Scanner;

public class String_Max_Frequency {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		String str = scn.next();
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int s = 0; s < str.length(); s++) {
			char ch = str.charAt(s);
			int count = 0;
			if (s > 0 && str.charAt(s - 1) == ch) {
//				al.add(s, 0);
			} else {
				for (int idx = s + 1; idx < str.length(); idx++) {
					if (ch == str.charAt(idx)) {
						count++;

					} else {
						al.add(count + 1);
					}
				}
			}
		}
//		al.add(15,0);
		System.out.println(al);
	}

}
