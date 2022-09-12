package _Practice_que_till_63_P1;

import java.util.Scanner;

public class Sorting_in_linerar_time {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scn.nextInt();
		int[] arr = arr_input(N);
		sorting(arr);
	}

	public static int[] arr_input(int N) {
		int[] arr = new int[N];
		for (int idx = 0; idx < arr.length; idx++) {
			arr[idx] = scn.nextInt();
		}
		return arr;
	}

	public static void sorting(int[] arr) {
		int cnt_0 = 0;
		int cnt_1 = 0;
		int cnt_2 = 0;
		for (int idx = 0; idx < arr.length; idx++) {
			if (arr[idx] == 0) {
				cnt_0++;
			} else if (arr[idx] == 1) {
				cnt_1++;
			} else if (arr[idx] == 2) {
				cnt_2++;
			}
		}
		int a = 0;
		while (a < cnt_0) {
			System.out.print(0 + " ");
			a++;
		}
		int b = 0;
		while (b < cnt_1) {
			System.out.print(1 + " ");
			b++;
		}
		int c = 0;
		while (c < cnt_2) {
			System.out.print(2 + " ");
			c++;
		}
	}
}
