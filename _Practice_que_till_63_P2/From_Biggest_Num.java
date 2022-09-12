package _Practice_que_till_63_P2;

import java.util.*;

//import java.util.Scanner;
//54 546 548 60
public class From_Biggest_Num {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int T = 1;
		int size = 4;
		ArrayList<Integer> arr = arr_scn(size);
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int idx = 0; idx < arr.size(); idx++) {
//			System.out.println(arr[idx]);
			int a = (int) (arr.get(idx) / Math.pow(10, count_digit(arr.get(idx))));
			if (idx + 1 < al.size() && al.get(idx + 1) == al.get(idx)) {
				a = (int) (arr.get(idx) / Math.pow(10, count_digit(arr.get(idx) - 1)));
			}
//			System.out.println(a);
			al.add(a);
		}
		System.out.println(max_value(al));
		System.out.println(arr.get(max_value(al)));
//		arr.remove(max_value(al));
//		al.remove(max_value(al));
//		System.out.println(arr);
//		System.out.println(al);
//		
	}

	public static ArrayList<Integer> arr_scn(int size) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int idx = 0; idx < size; idx++) {
			arr.add(idx, scn.nextInt());
		}
		return arr;
	}

	public static int count_digit(int num) {
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		return count - 1;
	}

	public static int max_value(ArrayList<Integer> al) {
		int max = Integer.MIN_VALUE;
		for (int idx = 0; idx < al.size(); idx++) {
			if (max < al.get(idx)) {
				max = idx;
			}
		}
		return max;
	}

}
