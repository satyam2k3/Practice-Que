package _Practice_que_till_20;

import java.util.Scanner;

public class binary_to_decimal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		long num = sc.nextLong();
		long rem = 0;
		long count = 0;
		while (num > 0) {
			long digit = num % 10;
			digit = digit * (long) Math.pow(2, count);
			count++;
			rem = rem + digit;
			num = num / 10;
		}
		System.out.println(rem);

	}

}
