package _Practice_que_till_63_P1;

import java.util.Scanner;

public class Revising_Quadratic_Equations {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		int dis = (int) Math.pow(b, 2) + (-1 * (4 * a * c));
		boolean bool = discriminant(dis);
		roots(a, b, c, dis, bool);
	}

	public static boolean discriminant(int dis) {
//		System.out.println(dis);
		if (dis > 0) {
			System.out.println("Real and Distinct");
			return true;
		} else if (dis == 0) {
			System.out.println("Real and Equal");
			return true;
		} else if (dis < 0) {
			System.out.println("Imaginary");
			return false;
		}
		return false;
	}

	public static void roots(int a, int b, int c, int dis, boolean bool) {
		if (a == 0) {
			int x = -c / b;
			System.out.println(x);
		} else if (bool == true) {
			int x1 = (-b + (int) Math.pow(dis, 0.5)) / (2 * a);
			int x2 = (-b - (int) Math.pow(dis, 0.5)) / (2 * a);
			if (x1 < x2) {
				System.out.print(x1 + " " + x2);
			} else {
				System.out.print(x2 + " " + x1);
			}
		}
	}
}
