package weeekend_prac;

import java.util.Arrays;

public class D_Highest {

	public static void main(String[] args) {
		int arr[] = { 2, 22, 3, 1, 4, 4, 55, 55, 55, 68, 45, 65, 56, 56 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int count = 0, n, r = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			n = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					n++;
				}
			}
			if (n > count) {
				r = arr[i];
				count = n;
			}
		}
		System.out.println(r + " :" + count);
	}

}
