package operatorsprac;

public class Switchprac {
	private int x;
	
	public Switchprac(int x)
	{
		this.x=x;
	}
	public void scase() {
		switch (x){
		case 6:
			System.out.println("today is saturday");
			break;
		case 7:
			System.out.println("today is sunday");
			break;
		default:
			System.out.println("lookinf for weekends");
		}
	}

}
