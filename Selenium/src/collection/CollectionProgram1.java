package collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionProgram1 
{
	public static void main(String[] args) 
	{
//		int a =10;
//		int b =20;
//		
//		int c  = a + b;
//		System.out.println(c);
////		double, float, char, String
//		
//		int d[] = {1,2,3,4,5};
//		
//		//int  vs array vs collection
		
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(20);
		a.add('A');
		a.add("Rahul");
		a.add(86.88);
		
		System.out.println(a);
		
		//specific datatype -int
		
		ArrayList<Integer> b = new ArrayList<Integer>();
		
		b.add(10);         //index 0
		b.add(20);          //index 1
		b.add(30);
//		b.add('A');
//		b.add("Rahul");
//		b.add(87.66);
		
		System.out.println(b);
		
		
		List c = new ArrayList();      //upcasting
		
		c.add(10);
		c.add('A');
		c.add("Rahul");
		
		List<Integer> d = new ArrayList<Integer>(); 	
		d.add(10);
//		d.add("Rahul");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}