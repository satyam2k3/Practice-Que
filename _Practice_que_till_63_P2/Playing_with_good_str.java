package _Practice_que_till_63_P2;

import java.util.ArrayList;
import java.util.Scanner;

public class Playing_with_good_str {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		String str = scn.next();
		ArrayList<Integer> AL = new ArrayList<Integer>();
		for (int idx = 0; idx < str.length(); idx++) {
			char ch = str.charAt(idx);

			if (ch == 'a') {
				AL.add(idx);
			} else if (ch == 'e') {
				AL.add(idx);
			} else if (ch == 'i') {
				AL.add(idx);
			} else if (ch == 'o') {
				AL.add(idx);
			} else if (ch == 'u') {
				AL.add(idx);
			}
		}
//		System.out.println(max(AL));
		System.out.println(AL);
		if (AL.size() == 0) {
			System.out.println(0);
		} else {
			System.out.println(length(AL));
		}
	}

	public static int length(ArrayList<Integer> arr) {
		ArrayList<Integer> Arr = new ArrayList<Integer>();
		int count = 0;
		for (int idx = 0; idx < arr.size(); idx++) {
			if (idx + 1 < arr.size()) {
				if (arr.get(idx + 1) == arr.get(idx) + 1) {
					count++;
				} else {
					Arr.add(count + 1);
					count = 0;
				}
			} else {
				Arr.add(count + 1);
			}
		}
		System.out.println(Arr);
		return max(Arr);

	}

	private static int max(ArrayList<Integer> al) {
		int max = Integer.MIN_VALUE;
		for (int idx = 0; idx < al.size(); idx++) {
			if (al.get(idx) > max) {
				max = al.get(idx);
			}
		}
		return max;
	}
}
/*
 * //**********this is the initial code ******************
 *
 * static Scanner scn = new Scanner(System.in);
 * 
 * public static void main(String[] args) { String str = scn.next(); // String
 * str = "abcdeaei"; // int x = -1; ArrayList<Integer> AL = new
 * ArrayList<Integer>(); for (int idx = 0; idx < str.length(); idx++) { char ch
 * = str.charAt(idx); // System.out.println(a); //
 * System.out.println(str.indexOf(x)); if (ch == 'a') { //
 * System.out.println(idx); // x = idx; AL.add(idx); // break; } else if (ch ==
 * 'e') { // System.out.println(idx); // x = idx; AL.add(idx); // break; } else
 * if (ch == 'i') { // System.out.println(idx); // x = idx; AL.add(idx); //
 * break; } else if (ch == 'o') { // System.out.println(idx); // x = idx;
 * AL.add(idx); // break; } else if (ch == 'u') { // System.out.println(idx); //
 * x = idx; AL.add(idx); // break; } } // System.out.println(AL); if (AL.size()
 * == 0) { System.out.println(0); } else { System.out.println(length(AL)); } }
 * 
 * public static int length(ArrayList<Integer> arr) { //
 * System.out.println(arr.size()); int count = 0; for (int idx = 0; idx <
 * arr.size(); idx++) { if (idx + 1 < arr.size() && arr.get(idx + 1) ==
 * arr.get(idx) + 1) { count++; } }
 * 
 * return count + 1;
 * 
 * }
 * 
 * }
 */