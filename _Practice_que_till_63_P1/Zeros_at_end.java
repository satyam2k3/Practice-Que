package _Practice_que_till_63_P1;

import java.util.Scanner;

public class Zeros_at_end {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		int[] arr = new int[n];
		int cnt_0 = 0;

		for (int idx = 0; idx < n; idx++) {
			arr[idx] = scn.nextInt();
			if (arr[idx] == 1) {
				System.out.print(1 + " ");
			} else {
				cnt_0++;
			}
		}
		for (; cnt_0 > 0; cnt_0--) {
			System.out.print(0 + " ");
		}
//		System.out.println();
//		System.out.println(cnt_1 + "----");
//		System.out.println(cnt_0 + "=====");
	}

}
