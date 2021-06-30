package objectcasting_prac;

public class Object_castMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Object_cast2 o1= new Object_cast2();
		//o1.gameLvl1();
		//o1.gameLvl2();
		
		Object o=new Object_cast2(); //implicit casting from parent class to child class(big to small)
		System.out.println(o.getClass());
		
		
		Object_cast1 o1=(Object_cast2)o; //explicit casting from child to parent (small to big)
		System.out.println(o1.getClass());
		o1.gameLvl2();
		
		Object_cast2 o2=(Object_cast2)o;
		System.out.println(o2.getClass());
		o2.gameLvl3();
		
	}

}
