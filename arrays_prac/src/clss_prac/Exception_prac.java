package clss_prac;

public class Exception_prac {

	public static void main(String[] args) {
		int x = 20;
		int y = 0;
		int s = 0;
		String s1=null;
		try {
			s = x / y; 
			System.out.println(s1.length());
		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(NullPointerException n) {
			System.out.println(n.getMessage());
		}
		finally {
			System.out.println(s);
		}
		
		System.out.println("Other Code Lines");
	}
}
