package weeekend_prac;

public class Vowel_Valid {

	public static void main(String[] args) {
		String s = "hello my name is mohan kumar";
		if (s.contains("a") && s.contains("e") && s.contains("i") && s.contains("o") && s.contains("u")) {
			System.out.println("All Vowels are Present ");
		}else
		{
			System.out.println("All Vowels are Not Present ");
		}

	}

}
