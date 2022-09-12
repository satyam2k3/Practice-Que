package _Practice_que_till_63_P1;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_an_Array {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int arr_length = scn.nextInt();
		int[] arr = new int[arr_length];
		arr_input(arr, arr_length);
//		System.out.println(Arrays.toString(arr));
		arr_rev(arr);
		disp(arr);
//		System.out.println(Arrays.toString(arr));

	}

	public static void arr_input(int[] arr, int length) {
		for (int idx = 0; idx < length; idx++) {
			arr[idx] = scn.nextInt();
		}
	}

	public static void arr_rev(int[] arr) {
		int s = 0;
		int end = arr.length - 1;
		while (s <arr.length / 2) {
			int temp = arr[s];
			arr[s] = arr[end];
			arr[end] = temp;
			s++;
			end--;
		}
	}

	public static void disp(int[] arr) {
//		System.out.println(arr.length);
		for (int ali : arr) {
			System.out.println(ali);
		}
	}
}
