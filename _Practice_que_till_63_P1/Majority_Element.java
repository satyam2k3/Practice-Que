package _Practice_que_till_63_P1;

import java.util.Arrays;
import java.util.Scanner;

public class Majority_Element {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scn.nextInt();
		int[] arr = arr_input(N);
//		System.out.println(Arrays.toString(arr));
		maj_element(arr);
	}

	public static int[] arr_input(int N) {
		int[] arr_inp = new int[N];
		for (int idx = 0; idx < N; idx++) {
			arr_inp[idx] = scn.nextInt();
		}
		return arr_inp;
	}

	public static void maj_element(int[] arr) {
		for (int ele = 0; ele < arr.length; ele++) {
			int count = 0;
			for (int idx = 0; (idx < arr.length); idx++) {
//				System.out.println(idx + " = idx");
				if (arr[ele] == arr[idx]) {
					count++;
//					System.out.println(count + " == count");
				}
			}
//			System.out.println(count);
			if (count > (arr.length / 2)) {
				System.out.println(arr[ele]);
				break;
			}
		}
	}
}
