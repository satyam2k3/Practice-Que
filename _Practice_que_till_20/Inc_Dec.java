package _Practice_que_till_20;

import java.util.Scanner;

public class Inc_Dec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 0;
		boolean dec = false;
		int prev_num = 0;
		while (num < n) {
//			int prev_num= sc.nextInt();
			int new_num = sc.nextInt();
			if (prev_num > new_num) {
				dec = true;
			} else {
				dec = false;
//				System.out.println(dec);
			}

		}
		System.out.println(dec);
		num++;

	}

}
/*
 * if form s1 to sn is inc. the it will be false if it is false so in above form
 * s1 to s1 it is dec. and further inc.
 * 
 * if from s1 to sn is dec. so the next numb can be either dec or inc. apply if
 * else
 * 
 * 
 */
