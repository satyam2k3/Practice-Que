package _Practice_que_till_20;

import java.util.Scanner;

public class Sum_odd_even_places {
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int num = scn.nextInt();
		int count = 0;
		int sum_odd = 0;
		int sum_even = 0;
		while (num > 0) {
			int digit = num % 10;
			num = num / 10;
			count++;
			if (count % 2 == 0) {
				sum_even = sum_even + digit;
			} else {
				sum_odd = sum_odd + digit;
			}
		}
		System.out.println(sum_odd);
		System.out.println(sum_even);
	}

}
