package _Practice_que_till_20;

import java.util.Scanner;

public class Simple_Input {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);

		while (sum >= 0) {
			int num = sc.nextInt();
			sum = sum + num;
			if (sum < 0) {
				break;
			}
			System.out.println(num);
		}
//		Scanner sc = new Scanner(System.in);
//		// simple input
//		for (int i = 0; i >= 0;) {
//			int num = sc.nextInt();
//			i = i + num;
//			if (i >= 0) {
//				System.out.println(num);
//			} else {
//				break;
//			}
//		}
	}
}