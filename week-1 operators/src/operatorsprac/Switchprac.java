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
			System.out.println("entered value is 6");
			break;
		case 7:
			System.out.println("entered value is 7");
			break;
		default:
			System.out.println("some other value");
		}
	}

}
