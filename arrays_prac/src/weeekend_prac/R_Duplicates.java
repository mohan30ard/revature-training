package weeekend_prac;

import java.util.Arrays;

public class R_Duplicates {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 22, 3, 1, 4, 4, 55, 55, 55, 68, 45, 65, 56, 56 };
		Arrays.sort(arr);
		int temp[] = new int[arr.length];
		int j = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[arr.length - 1];

		for (int i = 0; i < j; i++) {
			System.out.println(temp[i]);
		}

	}

}
