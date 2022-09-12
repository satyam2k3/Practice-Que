package _Practice_que_till_20;

import java.util.Scanner;

public class Inverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		long pos = 1;
		long mult = 1;
		long inv = 0;
		while (num > 0) {
			long digit = num % 10;
			System.out.println(digit + "-" + pos);
			num = num / 10;
			mult = pos * (long) (Math.pow(10, digit - 1));
			inv = inv + mult;
			pos++;

		}
		System.out.println(inv);
	}

}
