package weeekend_prac;

public class Prime_index {

	public static void main(String[] args) {
		String s = "hello my name is mohan kumar ";
		s = s.replace(" ", "");
		String arr[] = s.split("");
		System.out.println("Prime Index Characters are :");
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println();
				System.out.println(i + "=" + arr[i].toUpperCase() + " ");
				count = 0;
			}
		}

	}
}
