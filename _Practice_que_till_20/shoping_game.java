package _Practice_que_till_20;

import java.util.Scanner;

public class shoping_game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long t = sc.nextLong();
		while (t > 0) {
			t--;
			long A = sc.nextLong();
			long H = sc.nextLong();
			long mob = 1;
			while (true) {
				A = A - mob;
				if (A < 0) {
					System.out.println("Harshit");
					break;
				}
				mob++;
				H = H - mob;
				if (H < 0) {
					System.out.println("Aayush");
					break;
				}
				mob++;

			}
		}

	}

}
