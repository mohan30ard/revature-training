package stringbuilder_task;

public class Regex_prac {

	public static void main(String[] args) {
		String Adhaar ="2578 9444 2685";
		if(Adhaar.matches("[0-9]{4} [0-9]{4} [0-9]{4}"))
		{
			System.out.println("Entered Number is Valid");
		}
		else
		{
			System.out.println("Entered Number is NotValid");
		}
		

	}

}