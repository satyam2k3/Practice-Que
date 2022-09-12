package _Practice_que_till_63_P2;

import java.util.ArrayList;
import java.util.Scanner;

public class Can_You_Read_This {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String inp = scn.next();
		ArrayList<Integer> AL = new ArrayList<Integer>();

		for (int idx = 0; idx < inp.length(); idx++) {
			if (inp.charAt(idx) >= 'A' && inp.charAt(idx) <= 'Z') {
				System.out.println(idx);
				AL.add(idx);
			}
		} 
		System.out.println(AL);
		for (int i = 0; i < AL.size(); i++) {
			if (i == AL.size() - 1) {
				System.out.println(inp.substring(AL.get(i)));
			} else {
				System.out.println(inp.substring(AL.get(i), AL.get(i + 1)));
			}
		}
	}

}
