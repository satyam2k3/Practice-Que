package _Practice_que_till_63_P1;

import java.util.Arrays;
import java.util.Scanner;

public class Max_Circular_Sum {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scn.nextInt();
		int[] arr = new int[N];
		for (int idx = 0; idx < N; idx++) {
			arr[idx] = scn.nextInt();
		}
		int target = scn.nextInt();
//		System.out.println(Arrays.toString(arr));
		sum(arr, target);
	}

	public static void sum(int[] arr, int target) {
		int a = (int) Math.pow(target, 0.5);
//		System.out.println(a);
		for (int idxo = 0; idxo < arr.length; idxo++) {
			if (arr[idxo] <= a) {
//				System.out.println("=====");
				for (int idx = 0; idx < arr.length; idx++) {
					if (arr[idxo] + arr[idx] == target) {
						if (arr[idxo] == arr[idx]) {
						} else {
							System.out.println(arr[idxo] + " and " + arr[idx]);
						}
					}
				}

			}
		}
	}
}
