package _Practice_que_till_20;

import java.util.Scanner;

public class odd_even {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int num = 12345;
		int carno = sc.nextInt();
		int x = 0;
		while (x < carno) {
			int num = sc.nextInt();
			int even = 0;
			int odd = 0;
			while (num > 0) {
				int digit = num % 10;

				num = num / 10;
				if (digit % 2 == 0) {
					even = even + digit;
				} else if (digit % 2 != 0) {
					odd = odd + digit;
				}
			}
//		System.out.println(odd);
//		System.out.println(even);
			if (even % 4 == 0) {
				System.out.println("Yes");
			} else if (odd % 3 == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			x++;
		}
	}

}
