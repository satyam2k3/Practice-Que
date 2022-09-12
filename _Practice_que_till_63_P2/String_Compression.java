package _Practice_que_till_63_P2;

import java.util.ArrayList;
import java.util.Scanner;

public class String_Compression {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		String str = scn.next();
		StringBuilder sb = new StringBuilder(str + " ");
		StringBuilder print = new StringBuilder();
		char ch = sb.charAt(0);
		int count = 0;
		for (int idx = 1; idx < sb.length(); idx++) {
			if (sb.charAt(idx) == ch) {
				count++;
			} else {
				System.out.print(ch);
				if (count > 0) {
					System.out.print(count + 1);
				}
				ch = sb.charAt(idx);
				count = 0;
			}
		}
	}

}

//	static Scanner scn = new Scanner(System.in);
//
//	public static void main(String[] args) {
//		String str = scn.next();
//		StringBuilder sb = new StringBuilder(str);
//		StringBuilder sb_ = new StringBuilder();
////		ArrayList<Character> AL = new ArrayList<Character>();
//		sb_.append(sb.charAt(0));
////		AL.add(sb.charAt(0));
//		for (int st = 1; st < sb.length();) {
//			int count = 0;
////			System.out.println(count);
//			for (int idx = st; idx < sb.length(); idx++) {
////			if (sb.charAt(idx) == AL.get(idx - 1)) {
//				if (sb.charAt(idx) == sb.charAt(idx - 1)) {
//					count++;
////					System.out.println(count + "**********");
////				} else {
//				} else if (sb.charAt(idx) != sb.charAt(idx - 1)) {
//					if (count >= 1) {
//						sb_.append(count + 1);
//					}
//					sb_.append(sb.charAt(idx));
//					break;
//				}
//			}
//			st = st + count + 1;
////			System.out.println(st+"===========");
//		}
//		System.out.println(sb_);
//
//	}
//
//}
