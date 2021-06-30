package objectcasting_prac;

public class Object_cast2 extends Object_cast1 {

	public void gameLvl3() {
		System.out.println("Game Lvl 3 created");
	}
	@Override
	public void gameLvl2()
	{
		//super.gameLvl2();
		System.out.println("Game Lvl2 updated sucessfully");
	}
}
