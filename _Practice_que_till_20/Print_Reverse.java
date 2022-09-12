package _Practice_que_till_20;

import java.util.Scanner;

public class Print_Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		long numn = num;
		long rem =0;
		long count = 0;
		while(numn>0) {
			numn = numn/10;
			count++;
		}
		long mult =(long)Math.pow(10, count-1);
//		System.out.println(count);
		while (num>0&&mult>=1) {
			long digit = num %10;
			num = num /10;
			rem = rem + digit*mult;
			mult= mult/10;
			
			
		}
		System.out.println(rem);

	}

}
