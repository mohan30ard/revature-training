package clss_prac;

public class prac1 {

	public static void main(String[] args) {
		int x = 20;
		int y = 0;
		int s = 0;
		
		try{
			s=x/y;
			//System.out.println(s);
		}catch(ArithmeticException g){
			System.out.println("you cannot divide zero");
		}finally {
			System.out.println(s);
		}
		System.out.println(s);
	}

}
