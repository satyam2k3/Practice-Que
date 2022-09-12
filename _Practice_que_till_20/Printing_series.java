package _Practice_que_till_20;

import java.util.Scanner;

public class Printing_series {
	public static void main(String[] args) {

		boolean isPositive = true;
		int sum = 0;
		int n;
		Scanner sc = new Scanner(System.in);
		{
			sum = sum + sc.nextInt();
			if (sum < 0) {
				isPositive = false;
				break;
			}
			if (isPositive == true) {
				System.out.println(sum);
			}

		}
	}

}
