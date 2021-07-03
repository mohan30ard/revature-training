package weeekend_prac;

public class Vowel_Order {

	public static void main(String[] args) {
		String s = "aeiou";
		s = s.replaceAll(" ", "");
		char c=(char)64;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				if(s.charAt(i)<c)
				{
					System.out.println("The String is Not in Vowel Order");
					System.exit(0);
				}else
				{
					c=s.charAt(i);
				}
			}
		}
		System.out.println("The vowels in string are in order");
	}

}
