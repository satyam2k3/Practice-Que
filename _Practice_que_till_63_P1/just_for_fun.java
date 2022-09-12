package _Practice_que_till_63_P1;

import java.util.Arrays;
import java.util.Scanner;

public class just_for_fun {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter number: ");
		int n = sc.nextInt();
		int a = sum(n);
		int b = prime_sum(n);
//		System.out.println("Sum of number digits= " + a);
//		System.out.println("Sum of prime factors  = " + b);
		if (a == b)
			System.out.print("1");
		else
			System.out.print("0");
	}

	static int prime_sum(int n) {
		int i = 2, s = 0;
		while (n > 1) {
			if (n % i == 0) {
				s += sum(i);
				n /= i;
			} else {
				do {
					i++;
				} while (!isPrime(i));
			}
		}
		return s;
	}

	static int sum(int n) {
		int s = 0;
		while (n > 0) {
			s += n % 10;
			n /= 10;
		}
		return s;
	}

	static boolean isPrime(int num) {
		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

}