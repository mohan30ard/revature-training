package task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;



public class main {

	public static void main(String[] args) {
		
		List<Products> ProductsList=new ArrayList<>();
		ProductsList.add(new Products(10,"cello","pen",10,4.3f,'y'));
		ProductsList.add(new Products(34,"ball","pencil",14,3.3f,'y'));
		ProductsList.add(new Products(56,"fine","eraser",24,2.8f,'n'));
		ProductsList.add(new Products(23,"blue","sharpner",4,4.3f,'y'));
		ProductsList.add(new Products(98,"abc","blackpen",13,4.5f,'y'));
		
		System.out.println("printing list");
		printProductsList(ProductsList);
		Collections.sort(ProductsList);
		System.out.println("After sorting");
		printProductsList(ProductsList);
		
		Collections.sort(ProductsList,new ProductComparator());
		System.out.println("After sorting");
		printProductsList(ProductsList);
		
		Collections.sort(ProductsList,(Products p1,Products p2)->{
			Float f1=p1.getRatings();
			Float f2=p2.getRatings();
			return f1.compareTo(f2);
		});
		System.out.println("After sorting");
		printProductsList(ProductsList);
		
		Collections.sort(ProductsList,(Products p1,Products p2)->{
			int x=0;
			Float f1=p1.getRatings();
			Float f2=p2.getRatings();
			x= f1.compareTo(f2);
			if(x==0) {
				Double d1=p1.getCost();
				Double d2=p2.getCost();
				x=d1.compareTo(d2);
				}
			return x;
		});
		System.out.println("After sorting");
		printProductsList(ProductsList);
		

	}

	public static void printProductsList(List<Products> ProductsList) {
		// TODO Auto-generated method stub
		Iterator<Products> i =ProductsList.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
