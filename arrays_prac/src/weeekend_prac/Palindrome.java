package weeekend_prac;

public class Palindrome {
	public static void main(String[] args) {
		int arr[] = { 121, 111, 131, 5665, 6788, 45654, 7676, 6666, 7654, 8998 };

		for (int i = 0; i < arr.length; i++) {
			int n = arr[i];
			int s = 0, t = 0;
			while (n > 0) {
				t = n % 10;
				s = s * 10 + t;
				n = n / 10;
			}
			if (s == arr[i])
				System.out.println("This is a Palindrome number :" + arr[i]);
		}
	}
}
