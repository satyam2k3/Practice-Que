package _Practice_que_till_63_P1;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting_linearTime {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scn.nextInt();
		int[] arr = input(N);
		Sorting(arr);
//		System.out.println(Arrays.toString(arr));
//		print(arr);

	}

	public static int[] input(int N) {
		int[] arr_r = new int[N];
		for (int idx = 0; idx < N; idx++) {
			arr_r[idx] = scn.nextInt();
		}
		return arr_r;
	}

	public static void Sorting(int[] arr) {// by bubble sort
		for (int s = 0; s < arr.length; s++) {
			for (int idx = 0; idx <= arr.length - 2; idx++) {
				if (arr[idx + 1] < arr[idx]) {
					int temp = arr[idx + 1];
					arr[idx + 1] = arr[idx];
					arr[idx] = temp;
				}
//					System.out.println(Arrays.toString(arr));
			}
//				System.out.println("==================");
		}
		for (int ali : arr) {
			System.out.print(ali + " ");
		}
	}

	public static void print(int[] arr) {
		for (int ali : arr) {
			System.out.print(ali + " ");
		}
	}

}
