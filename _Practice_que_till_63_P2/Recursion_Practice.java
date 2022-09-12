package _Practice_que_till_63_P2;

public class Recursion_Practice {

	public static void main(String[] args) {
//		PI(5);
		int[] arr = { 1000, 250, -10, 40000 };
		int[] arr1 = { 20, 10, 10, 40 };
//		Rev_Prt(arr, 0);
//		Print(arr, 0);
//		System.out.println(Max(arr, 0));
//		System.out.println(First_occr(arr1, 0, 10));
		System.out.println(Last_occur(arr1, 0, 10));
	}

	public static void PI(int i) {
		// bp = pi(4);
		// sp = pi(3)
		if (i == 0) {
			return;
		}
		System.out.println(i);
		PI(i - 1);
	}

	public static void Print(int[] arr, int idx) {
		if (arr.length == idx) {
			return;
		}
		System.out.print(arr[idx] + " ");
		Print(arr, idx + 1);
	}

	public static void Rev_Prt(int[] arr, int idx) {
		if (idx == arr.length) {
			return;
		}
		Rev_Prt(arr, idx + 1);
		System.out.print(arr[idx] + " ");
	}

	public static int Max(int[] arr, int i) {
		if (i == arr.length - 1) {
			return arr[i];
		}
		int sp = Max(arr, i + 1);
		return Math.max(sp, arr[i]);
	}

	public static int First_occr(int[] arr1, int i, int ali) {
		if (i == arr1.length) {
			return -1;
		}
		int sp = First_occr(arr1, i + 1, ali);
		if (ali == arr1[i]) {
			return i;
		} else {
			return sp;
		}
	}

	public static int Last_occur(int[] arr1, int i, int ali) {
		if (i == arr1.length) {
			return -1;
		}
		int sp = Last_occur(arr1, i + 1, ali);
		if (ali == arr1[i]) {
			return i;
		} else {
			return sp;
		}
	}
}
