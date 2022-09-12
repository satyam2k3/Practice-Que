package _Practice_que_till_63_P2;

import java.util.ArrayList;
import java.util.Scanner;

public class Longest_Substring_k_distinct_characters {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int T = scn.nextInt();
		for (int t = 0; t < T; t++) {
			String str = scn.next();
			int k = scn.nextInt();
			ArrayList<Integer> al = new ArrayList<Integer>();
			for (int s = 0; s <= str.length(); s++) {
				for (int e = s + 1; e <= str.length(); e++) {
					if (str.substring(s, e).length() >= k) {
						al.add(check(str.substring(s, e), k));
					}
				}
			}
			System.out.println(max(al));
//		System.out.println(str.lastIndexOf("e"));
		}
	}

	public static int check(String str, int k) {
		int characters = str.length();
		int max = Integer.MIN_VALUE;
		for (int idx = 0; idx < str.length(); idx++) {
			for (int i = idx + 1; i < str.length(); i++) {
				if (str.charAt(idx) == str.charAt(i)) {
					characters = characters - 1;
				}
			}
			if (characters == k) {
				return str.length();
//				System.out.println(str + characters);
			}
		}
//		System.out.println(str + characters);
		return -1;
	}

	public static int max(ArrayList<Integer> al) {
		int max = Integer.MIN_VALUE;
		for (int idx = 0; idx < al.size(); idx++) {
			if (al.get(idx) > max) {
				max = al.get(idx);
			}
		}
		return max;
	}
}
