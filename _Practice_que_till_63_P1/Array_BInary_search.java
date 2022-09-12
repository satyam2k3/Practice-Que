package _Practice_que_till_63_P1;

import java.util.Arrays;
import java.util.Scanner;

public class Array_BInary_search {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scn.nextInt();
		int[] arr = Array_input(N);
//		System.out.println(Arrays.toString(arr));
		int M = scn.nextInt();
		System.out.println(Binary_Search(M, arr));

	}

	public static int[] Array_input(int N) {
		int[] arr = new int[N];
		for (int idx = 0; idx < N; idx++) {
			arr[idx] = scn.nextInt();
		}
		return arr;
	}

	public static int Binary_Search(int M, int[] arr) {
		int s = 0;
		int e = arr.length - 1;
		while (s <= e) {
			int mid = (s + e) / 2;
			if (arr[mid] > M) {
				e = mid - 1;
			} else if (arr[mid] < M) {
				s = mid + 1;
			} else if (arr[mid] == M) {
				return mid;
			} else if (s == e) {
				return s;
			}
		}
		return -1;
	}

}
