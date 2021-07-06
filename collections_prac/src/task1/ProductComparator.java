package task1;

import java.util.Comparator;

public class ProductComparator implements Comparator<Products>{

	@Override
	public int compare(Products o1, Products o2) {
		return o1.getProductName().compareTo(o2.getProductName());
	}

}
