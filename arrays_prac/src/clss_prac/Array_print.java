package clss_prac;

import java.util.Arrays;

public class Array_print {

	public static void main(String[] args) {
		int ar[]= {11,22,33,434,55,66,77,88};
		
		System.out.println(ar[1]);
		System.out.println(Arrays.toString(ar));
		
		int s=0,t=0;
		int n = ar[3];
		while(n>0)
		{
		t=n%10;
		//System.out.println(n);
		System.out.println(t);
		s=s*10+t;
		System.out.println(s);
		n=n/10;
		System.out.println(n);
		}

	}

}
