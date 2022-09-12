package _Practice_que_till_63_P1;

import java.util.Arrays;
import java.util.Scanner;

public class Max_value_in_Array {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = new int[sc.nextInt()];
		Array_input(arr, arr.length);
		int max_value = maxvalue(arr);
//		System.out.println(Arrays.toString(arr));
		System.out.println(max_value);
	}

	public static void Array_input(int[] a, int length) {
		for (int idx = 0; idx < length; idx++) {
			a[idx] = sc.nextInt();
		}
	}

	public static int maxvalue(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int idx = 0; idx < arr.length; idx++) {
			if (max < arr[idx]) {
				max = arr[idx];
			}
		}
		return max;
	}
}
