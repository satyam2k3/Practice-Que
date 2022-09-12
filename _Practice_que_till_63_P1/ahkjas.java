package _Practice_que_till_63_P1;

import java.util.Scanner;

public class ahkjas {

	public static void main(String[] args) {
		int a = 0, b = 1;
		int c = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter till how many numbers ");
		int ab = in.nextInt();
		if (ab == 0)
			c = 0;
		else if (ab == 1)
			c = 1;
		else {
			for (int i = 2; i <= ab; ++i) {
				c = a + b;
				a = b;
				b = c;
			}
			System.out.println(c);
		}
	}

}
