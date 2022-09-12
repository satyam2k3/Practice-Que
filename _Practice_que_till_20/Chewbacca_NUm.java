package _Practice_que_till_20;

import java.util.Scanner;

public class Chewbacca_NUm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		long digit;
		long rem = 0;
		long mult = 1;
		while (num > 0) {
			digit = num % 10;
			if (num != 9 && digit > 9 - digit) {
				digit = 9 - digit;
			}
			rem = rem + digit * mult;
			num = num / 10;
			mult = mult * 10;
		}
		System.out.println(rem);

	}

}
