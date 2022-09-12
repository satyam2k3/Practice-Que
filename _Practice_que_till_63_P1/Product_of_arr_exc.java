package _Practice_que_till_63_P1;

import java.util.Arrays;
import java.util.Scanner;

public class Product_of_arr_exc {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scn.nextInt();
		int[] arr = new int[N];
		for (int idx = 0; idx < N; idx++) {
			arr[idx] = scn.nextInt();
		}
		long[] ans = new_arr(arr);
	}

	public static long[] new_arr(int[] arr) {
		long[] arr1 = new long[arr.length];
		for (int exc_ele = 0; exc_ele < arr.length; exc_ele++) {
			long product = 1;
			for (int idx = 0; idx < arr.length; idx++) {
				product = product * arr[idx];
			}
			arr1[exc_ele] = product / arr[exc_ele];
		}
//		System.out.println(Arrays.toString(arr1));
		for (long ali : arr1) {
			System.out.print(ali + " ");
		}
		return arr1;
	}
}
