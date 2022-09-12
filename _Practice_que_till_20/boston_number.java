package _Practice_que_till_20;

import java.util.Scanner;

public class boston_number {

	public static void main(String[] args) {
		// first finding prime
				Scanner sc = new Scanner(System.in);
				int num = sc.nextInt();
				int nw_num = num;
				int lft_sum = 0;
				for (; nw_num > 0;) {
					int digit = nw_num % 10;
					nw_num = nw_num / 10;
					lft_sum = lft_sum + digit;
				}
//				System.out.println(lft_sum);
				int rt_sum = 0;
				for (int div = 2; div <= num;) {
					if (num % div != 0) {
						div++;
					} else {
						num = num / div;
						rt_sum = rt_sum + div;
//						System.out.println(div);
					}

				}
//				System.out.println(rt_sum);
				int f_lftsum = 0;
				int f_rtsum = 0;

				if (lft_sum / 10 != 0) {
					while (lft_sum > 0) {
						int digit = lft_sum % 10;
						lft_sum = lft_sum / 10;
						f_lftsum = f_lftsum + digit;
					}
				} else {
					f_lftsum = lft_sum;
				}
//				System.out.println(f_lftsum);

				if (rt_sum / 10 != 0) {
					while (rt_sum > 0) {
						int digit = rt_sum % 10;
						rt_sum = rt_sum / 10;
						f_rtsum = f_rtsum + digit;
					}
				} else {
					f_rtsum = rt_sum;
				}
//				System.out.println(f_rtsum);

				if (f_rtsum == f_lftsum) {
					System.out.println("1");
				} else {
					System.out.println("0");
				}
	}

}
