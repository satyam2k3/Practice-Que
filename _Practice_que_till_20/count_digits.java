package _Practice_que_till_20;

import java.util.Scanner;

public class count_digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int n = sc.nextInt();
		int count = 0;
		while (num > 0) {
			int digit = num % 10;
			if (digit == n) {
				count++;
			}
			num = num / 10;
		}
		System.out.println(count);

	}

}
