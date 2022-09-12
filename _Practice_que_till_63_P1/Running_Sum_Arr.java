package _Practice_que_till_63_P1;

import java.util.Scanner;

public class Running_Sum_Arr {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scn.nextInt();
		int[] arr = arr_input(N);
		Running_sum(arr);
	}

	public static int[] arr_input(int N) {
		int[] arr_scn = new int[N];
		for (int idx = 0; idx < N; idx++) {
			arr_scn[idx] = scn.nextInt();
		}
		return arr_scn;
	}

	public static void Running_sum(int[] arr) {
		int[] arr_out = new int[arr.length];
		for (int last = 0; last < arr.length; last++) {
			int Sum = 0;
			for (int idx = 0; idx <= last; idx++) {
				Sum = Sum + arr[idx];
				if (idx == last ) {
					arr_out[idx] = Sum;
				}
			}
		}
		for (int ali : arr_out) {
			System.out.print(ali + " ");
		}
	}
}
