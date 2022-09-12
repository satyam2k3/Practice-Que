package _Practice_que_till_63_P1;

import java.util.Arrays;
import java.util.Scanner;

public class Square_of_Arr {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scn.nextInt();
		int[] arr = arr_input(N);
//		System.out.println(Arrays.toString(arr));
		sorting(arr);
//		System.out.println(Arrays.toString(arr));
	}

	public static int[] arr_input(int N) {
		int[] arr = new int[N];
		for (int idx = 0; idx < arr.length; idx++) {
			int n = scn.nextInt();
			n = (int) Math.pow(n, 2);
			arr[idx] = n;
		}
		return arr;
	}

	public static void sorting(int[] arr) {
		for (int last = 0; last < arr.length; last++) {
			for (int idx = 0; idx < arr.length - 2; idx++) {
				if (arr[idx] > arr[idx + 1]) {
					int temp = arr[idx + 1];
					arr[idx + 1] = arr[idx];
					arr[idx] = temp;
				}
			}
		}
		for (int ali : arr) {
			System.out.print(ali + " ");
		}
	}

}
