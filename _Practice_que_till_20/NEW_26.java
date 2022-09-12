package _Practice_que_till_20;

import Lecture_08.arr;

public class NEW_26 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60 };
//		RevArr(arr);
		Rot(arr);
		Print(arr);
		System.out.println(arr.length);
		for (int ali : arr) {
			System.out.print(ali + " ");
		}
	}

	public static void Print(int[] arr) {

	}

	public static void Rot(int[] arr) {
		int s = 0;
		int end = arr.length - 1;
		while (s < end) {
			int cpy = arr[end];
			arr[end] = arr[s];
			arr[s] = cpy;
			s++;
			end--;
		}
	}

	public static void RevArr(int[] arr) {
		for (int idx = arr.length - 1; idx >= 0; idx--) {
			System.out.println(arr[idx]);
		}
	}

}
