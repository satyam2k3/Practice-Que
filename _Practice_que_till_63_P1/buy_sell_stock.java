package _Practice_que_till_63_P1;

import java.util.Arrays;
import java.util.Scanner;

public class buy_sell_stock {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scn.nextInt();
		int[] arr = arr_input(N);
//		System.out.println(Arrays.toString(arr));
//		profit(arr);
		profit_1(arr);
	}

	public static int[] arr_input(int N) {
		int[] arr = new int[N];
		for (int idx = 0; idx < N; idx++) {
			arr[idx] = scn.nextInt();
		}
		return arr;
	}

	public static void profit(int[] arr) {// giving tle errot in half of the test cases
		int profit = 0;
		int max = 0;
		for (int end = arr.length - 1; end > 0; end--) {
			for (int idx = end - 1; idx >= 0; idx--) {
				profit = arr[end] - arr[idx];
				if (profit > max) {
					max = profit;
//					System.out.println(max);
				}
			}
		}
		System.out.println(max);
	}

	public static void profit_1(int[] arr) {// successful test case
		// primarily finding min taking first as the min value
		// the fiding the max profit
		int min = arr[0];
		int profit = Integer.MIN_VALUE;	
		for (int idx = 0; idx < arr.length; idx++) {
			if (min > arr[idx]) {
				min = arr[idx];
//				System.out.println(min);
			}
			int max = arr[idx] - min;
//			System.out.println(max);
			if (profit < max) {
				profit = max;
			}
		}
		System.out.println(profit);
	}
}
