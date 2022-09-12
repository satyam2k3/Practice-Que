package _Practice_que_till_20;

import java.util.Scanner;

public class Replacing {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		long i = num.nextLong();
		long mult = 1;
		long rem = 0;
		if (i == 0) {
			i = 5;
		}
		while (i > 0) {
			long digit = i % 10;
			if (digit == 0) {
				digit = 5;
			}
			i = i / 10;
			rem = rem + digit * mult;
			mult = mult * 10;

		}
		System.out.println(rem);
	}
}
