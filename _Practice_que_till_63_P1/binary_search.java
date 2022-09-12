package _Practice_que_till_63_P1;

public class binary_search {

	public static void main(String[] args) {
		int[] arr = { 5, 7, 11, 12, 15, 20, 31, 33, 35, 40, 45, 55, 58, 66, 71 };
//		find(arr, 58);
		find1(arr, 58);
//		System.out.println(arr.length);

	}

	public static void find(int[] arr, int target) {
		int s = 0;
		int e = arr.length - 1;

		while (s <= e) {

			int mid = ((s - e) / 2) + e;
			if (arr[mid] < target) {
				s = mid + 1;
			} else if (arr[mid] > target) {
				e = mid - 1;
			} else if (arr[mid] == target) {
				System.out.println(mid);
				break;
			} else if (s == e) {
				System.out.println(s);
				break;
			}
		}
		if (s > e) {
			System.out.println("Num not find!");
		}

	}

	public static boolean find1(int[] arr, int target) {
		int s = 0;
		int e = arr.length - 1;
		while (s <= e) {
			int mid = ((s - e) / 2) + e;
			if (arr[mid] < target) {
				s = mid + 1;
			} else if (arr[mid] > target) {
				e = mid - 1;
			} else if (arr[mid] == target) {
				System.out.println(mid);
				System.out.println(true);
				return true;
			} else if (s == e) {
				System.out.println(s);
				System.out.println(true);
				return true;
			}
		}
		System.out.println(true);
		return false;
	}
}
