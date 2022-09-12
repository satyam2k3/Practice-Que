package _Practice_que_till_20;

import java.util.Scanner;

public class gcd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long divident = sc.nextLong();
		long divisor = sc.nextLong();
		long rem =1;

		while (rem > 0) {
			rem = divident % divisor;
			divident = divisor;
			divisor = rem;
		}
		System.out.println(divident);
	}
}
