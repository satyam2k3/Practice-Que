package _Practice_que_till_63_P1;

import java.util.Scanner;

public class Conversion_Farhenhit_to_Celsius {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int Min_f = scn.nextInt();
		int Max_f = scn.nextInt();
		int Step = scn.nextInt();
		conversion(Min_f, Max_f, Step);
	}

	public static void conversion(int min, int max, int step) {
		while (min <= max) {
			int celsius = (5 * (min - 32)) / 9;
			System.out.println(min+"\t"+celsius);
			min = min + step;
		}
	}

}
