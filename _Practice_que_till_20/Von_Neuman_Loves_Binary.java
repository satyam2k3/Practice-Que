package _Practice_que_till_20;

import java.util.Scanner;

public class Von_Neuman_Loves_Binary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		while (N > 0) {
			int num = sc.nextInt();
			int rem = 0;
			int count = 0;
			int digit = 0;
			int ans = 0;
			while (num > 0) {
				digit = num % 10;
				ans = digit * (int) Math.pow(2, count);
				rem = rem + ans;
				num = num / 10;
				count++;
			}
			System.out.println(rem);
			N--;
		}

	}

}
