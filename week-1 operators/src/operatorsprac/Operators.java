package operatorsprac;

public class Operators {

	private int x;
	private int y;
	
	public Operators(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	public void compare()
	{
		if(x>y)
		{
			System.out.println("x is greater than y");
		}
		else if(x<y)
		{
			System.out.println("y is greater than x");
		}
		else if(x == y)
		{
			System.out.println("both are equal values");
		}
	}
	
	public void increment()
	{
		int x=0;
		while(x<5)
		{
			System.out.println(" x value is :"+x);
			x++;
		}
	}
	public void forinc() {
		for(int x = 0;x<10;x=x+2)
		{
			System.out.println("i value is :"+x);
		}
	}
	
}
