package _Practice_que_till_63_P1;

import java.util.Arrays;
import java.util.Scanner;

public class Minimum_Swaps {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scn.nextInt();
		int[] arr = new int[N];
		for (int idx = 0; idx < arr.length; idx++) {
			arr[idx] = scn.nextInt();
		}
//		System.out.println(Arrays.toString(arr));
		swap(arr);

	}

	public static void swap(int[] arr) {
		// finding maximum
		int count = 0;
		for (int last = arr.length; last > 1; last--) {
			int max = 0;
			for (int idx = 0; idx < last; idx++) {
				if (arr[idx] > arr[max]) {
					max = idx;
				}
			}
//				System.out.println(max);
			int temp = arr[last - 1];
			arr[last - 1] = arr[max];
			arr[max] = temp;
			count++;
//			System.out.println(Arrays.toString(arr));
		}
		System.out.println(count);

	}
}
