package _Practice_que_till_20;

import java.util.Scanner;

public class Print_Primes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n1 = 2;
		while (n1 <= num) {
			int n = n1;
			int count = 1;
			int div = 2;
			while (div <= n1) {
				if (n % div == 0) {
					count++;
					n = n / div;
				} else {
					div++;
				}
			}
			if (count == 2) {
				System.out.println(n1);
				n1++;
			} else {
//				System.out.println("Not Prime");
				n1++;
			}
		}
	}
}
