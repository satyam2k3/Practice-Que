package _Practice_que_till_63_P1;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Target_Triplet {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scn.nextInt();
		int[] arr = input(N);
		int target = scn.nextInt();
		Sorting(arr);
		System.out.println(Arrays.toString(arr));
		print_triplet(arr, target);

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
//				System.out.println(Arrays.toString(arr));
			}
//			System.out.println("==================");
		}
	}

	public static void print_triplet(int[] arr, int tar) {
		int count = 0;
		for (int a = 0; a < arr.length - 1; a++) {
//		int a = 0;
			for (int b = a + 1; b < arr.length; b++) {
				for (int c = 0; c < arr.length && (c != a || c != b); c++) {
					if ((arr[a] + arr[b] + arr[c]) == tar) {
						if (c > b && b > a) {
							System.out.println(arr[a] + ", " + arr[b] + " and " + arr[c]);
							break;
						}
					}
					count++;
				}
			}
		}
		System.out.println(count);
	}
}// the thing left is the repetative occuring of the same sum
