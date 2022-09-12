package _Practice_que_till_63_P1;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		int[] arr = { 20, 10, 40, 50, 30 };
//		bubble_sort(arr);
		selection_sort(arr);
		
	}

	public static void bubble_sort(int[] arr) {
		for (int count = 0; count < arr.length; count++) {
			for (int s = 0; s < arr.length - 1; s++) {
				if (arr[s + 1] < arr[s]) {
					int temp = arr[s + 1];
					arr[s + 1] = arr[s];
					arr[s] = temp;
					System.out.println(Arrays.toString(arr));

				}
			}
			System.out.println("===============");
		}
	}

	public static void selection_sort(int[] arr) {
		// finding the max value
		for (int count = arr.length-1; count > 0; count--) {
			int max_idx = 0;
			for (int i = 0; i < count; i++) {
				if (arr[max_idx] < arr[i]) {
					max_idx = i;
				}
			}
		System.out.println(max_idx);
			// now we are swaping the max value with the last value
			int temp = arr[count];
			arr[count] = arr[max_idx];
			arr[max_idx] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
