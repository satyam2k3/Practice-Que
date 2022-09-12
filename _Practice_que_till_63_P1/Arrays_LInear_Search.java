package _Practice_que_till_63_P1;

import java.util.Scanner;

public class Arrays_LInear_Search {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scn.nextInt();
		int[] arr = new int[N];
		Array_input(arr, N);
		int M = scn.nextInt();
		int idx =Linear_Search(arr, M);
		System.out.println(idx);

	}

	public static void Array_input(int[] arr, int N) {
		for (int idx = 0; idx < N; idx++) {
			arr[idx] = scn.nextInt();
		}
	}

	public static int Linear_Search(int[] arr, int M) {
		int idx = 0;
		while (idx < arr.length) {
			if (arr[idx] == M) {
				return idx;
			}
			idx++;
		}
		return -1;
	}

}
