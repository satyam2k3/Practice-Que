package _Practice_que_till_20;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class pta_nhi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean dec = false;
		int n = 0;
		int i = sc.nextInt();
		int prev = Integer.MAX_VALUE;
		while (n < i) {
			int num = sc.nextInt();
			if (prev < num) {
				dec = false;
			} else if (prev > num) {
				if(dec == true) {
					dec = false;
					break;
				}
				dec = true;
				
			}
			n++;
			prev = num;
		}
		System.out.println(dec);
	}
}
