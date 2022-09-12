package _Practice_que_till_20;

import java.util.Scanner;

public class Basic_calc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long ans = 0;
		while (true) {
			char ch = sc.next().charAt(0);

			if (ch == '+') {
				long n1 = sc.nextLong();
				long n2 = sc.nextLong();
				ans = n1 + n2;
				System.out.println(ans);
			} else if (ch == '-') {
				long n1 = sc.nextLong();
				long n2 = sc.nextLong();
				ans = n1 - n2;
				System.out.println(ans);
			} else if (ch == '*') {
				long n1 = sc.nextLong();
				long n2 = sc.nextLong();
				ans = n1 * n2;
				System.out.println(ans);
			} else if (ch == '/') {
				long n1 = sc.nextLong();
				long n2 = sc.nextLong();
				ans = n1 / n2;
				System.out.println(ans);
			} else if (ch == '%') {
				long n1 = sc.nextLong();
				long n2 = sc.nextLong();
				ans = n1 % n2;
				System.out.println(ans);

			} else if (ch == 'X' || ch == 'x') {
				break;
			} else {
				System.out.println("Invalid operation. Try again.");
			}
		}

	}

}
