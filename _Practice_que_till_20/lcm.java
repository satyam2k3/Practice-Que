package _Practice_que_till_20;

import java.util.Scanner;

public class lcm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long divident = sc.nextLong();
		long divisor = sc.nextLong();
		long rem = 1;
		long N1 = divident;
		long N2 = divisor;

		while (rem > 0) {
			rem = divident % divisor;
			divident = divisor;
			divisor = rem;
		}
		long ans = (N1 * N2) / divident;
		System.out.println(ans);

	}

}