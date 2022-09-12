package _Practice_que_till_63_P1;

import java.util.Scanner;

public class Pair_of_Roses {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int T = scn.nextInt();
		for (int i = 0; i < T; i++) {
			int avail_r = scn.nextInt();
			int[] price = Rose_price(avail_r);
			int M = scn.nextInt();
//			System.out.println();
			Roses(avail_r, price, M);
		}
	}

	public static int[] Rose_price(int r) {
		int[] arr = new int[r];
		for (int idx = 0; idx < r; idx++) {
			arr[idx] = scn.nextInt();
		}
		return arr;
	}

	public static void Roses(int avail_r, int[] price, int M) {
		int[] arr = new int[2];
		int diff = Integer.MAX_VALUE;
		int t_diff = 0;
		int t_diff1 = 0;
		for (int A = 0; A < price.length; A++) {
			for (int B = 0; B < price.length; B++) {
				if (price[A] + price[B] == M) {
					t_diff = price[B] - price[A];
					t_diff1 = Math.abs(t_diff);
//					System.out.println(t_diff);
					if (t_diff1 <= diff) {
						arr[0] = price[A];
						arr[1] = price[B];
						diff = t_diff1;
//						System.out.println(diff);
					}
				}
			}
		}
		System.out.println("Deepak should buy roses whose prices are " + arr[0] + " and " + arr[1] + ".");
	}
}
