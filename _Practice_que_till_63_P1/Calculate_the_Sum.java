package _Practice_que_till_63_P1;

import java.util.Arrays;
import java.util.Scanner;

public class Calculate_the_Sum {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scn.nextInt();
		int[] a = array_input(N);
//		System.out.println(Arrays.toString(a));
		int Q = scn.nextInt();
		int[] arr_x = val_X(Q);
//		System.out.println(Arrays.toString(arr_x));
		operation();
	}
 
	public static int[] array_input(int N) {
		int[] arr = new int[N];
		for (int idx = 0; idx < N; idx++) {
			arr[idx] = scn.nextInt();
		}
		return arr;
	}

	public static int[] val_X(int Q) {
		int[] arr = new int[Q];
		for (int idx = 0; idx < Q; idx++) {
			arr[idx] = scn.nextInt();
		}
		return arr;
	}

	public static void operation() {
		
	}
}
