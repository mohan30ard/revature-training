package weeekend_prac;

public class Prime_Number {

	public static void main(String[] args) {
		int arr[] = { 12, 13, 17, 18, 25, 45, 23, 43, 68 };

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 1; j <= arr[i]; j++) {
				if (arr[i] % j == 0)
					count++;
			}
			if (count == 2) {
				System.out.println("it is a prime number :" + arr[i]);
				count = 0;
			}
		}
	}
}
