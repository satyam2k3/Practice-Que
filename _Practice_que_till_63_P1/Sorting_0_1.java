package _Practice_que_till_63_P1;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting_0_1 {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scn.nextInt();
		int num = scn.nextInt();
		int rev = hello(N, num);
//		rev(r, N);
		int[] a = input(N, rev);
//		System.out.println(Arrays.toString(a));

	}

	public static int hello(int N, int num) {
		int sum = 0;
		int count = N - 1;
		for (int idx = 0; idx < N; idx++) {
			int digit = num % 10;
			if (digit == 1) {
				sum = sum + digit * (int) Math.pow(10, count);
				count--;
			}
			num = num / 10;
		}
		System.out.println(sum);
		return sum;
	}

	public static int[] input(int N, int num) {
		int[] arr = new int[N];
		for (int idx = 0; idx < N; idx++) {
			int digit = num % 10;
			arr[idx] = digit;
			num = num / 10;
		}
		for (int ali : arr) {
			System.out.print(ali);
		}
		return arr;
	}

//	public static void rev(int rev, int N) {
//		int sum = 0;
//		for (int idx = 0; idx < N; idx++) {
//			int digit = rev % 10;
//			sum = sum + digit * (int) Math.pow(10, N - 1 - idx);
//			rev = rev / 10;
//		}
//		System.out.println(sum);
//	}

//	============================giving time line exceded error
//	public static int[] input(int N, int num) {
//		int[] arr = new int[N];
//		for (int idx = 0; idx < N; idx++) {
//			int digit = num % 10;
//			arr[idx] = digit;
//			num = num / 10;
//		}
//		return arr;
//	}

//	public static void main(String[] args) {
//		int N = scn.nextInt();
//		int num = scn.nextInt();
//		int[] arr1 = input(N, num);
////		System.out.println(Arrays.toString(arr1));
//		Selection_sort(arr1);
//	}
//
//	public static int[] input(int N, int num) {
//		int[] arr = new int[N];
//		for (int idx = 0; idx < N; idx++) {
//			int digit = num % 10;
//			arr[idx] = digit;
//			num = num / 10;
//		}
//		return arr;
//	}
//
//	public static void Selection_sort(int[] arr) {
//		int last = arr.length - 1;
//		for (int e = last; e > 0; e--) {
//			int max = 0;
//			for (int idx = 0; idx <= e; idx++) {
//				if (arr[max] < arr[idx]) {
//					max = idx;
////					System.out.println(max);
//				}
//			}
//			int temp = arr[e];
//			arr[e] = arr[max];
//			arr[max] = temp;
////			System.out.println(temp);
////			System.out.println(Arrays.toString(arr));
//		}
//		for (int ali : arr) {
//			System.out.print(ali);
//		}
//	}
}
//1 0 0 1 1 0 1
