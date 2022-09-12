package _Practice_que_till_63_P2;

public class Finding_CB_Num {
	public static void main(String[] args) {
		String A = "81615";

		System.out.println(A);
		substring(A);
	}

	public static String substring(String A) {
		for (int s = 0; s < A.length(); s++) {
			for (int e = s + 1; e <= A.length(); e++) {
				System.out.println(A.substring(s, e));
			}
		}
		return "";
	}

	public static void CB_num(String A) {
		String str = substring(A);
	}
}
