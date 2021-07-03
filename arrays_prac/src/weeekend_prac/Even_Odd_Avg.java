package weeekend_prac;

public class Even_Odd_Avg {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int evenCount = 0, oddCount = 0;
		int E_sum = 0, O_sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenCount++;
				E_sum += arr[i];
			} else {
				oddCount++;
				O_sum += arr[i];
			}
		}
		System.out.println("Average of Even Numbers : " + E_sum / evenCount);
		System.out.println("Average of Odd Numbers : " + O_sum / oddCount);

	}

}
