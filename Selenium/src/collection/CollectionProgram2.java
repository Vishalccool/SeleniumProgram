package collection;

//Collection Practice Program-2



import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CollectionProgram2 
{
	public static void main(String[] args) 
     {
////		int a =10;
////		int b =20;
////		
////		int c  = a + b;
////		System.out.println(c);
//////		double, float, char, String
////		
////		int d[] = {1,2,3,4,5};
////		
////		//int  vs array vs collection
//		
//		ArrayList a = new ArrayList();
//		a.add(10);
//		a.add(20);
//		a.add('A');
//		a.add("Rahul");
//		a.add(86.88);
//		
//		System.out.println(a);
//		
//		//specific datatype -int
//		
//		ArrayList<Integer> b = new ArrayList<Integer>();
//		
//		b.add(10);         //index 0
//		b.add(20);          //index 1
//		b.add(30);
////		b.add('A');
////		b.add("Rahul");
////		b.add(87.66);
//		
//		System.out.println(b);
//		
//		
//		List c = new ArrayList();      //upcasting
//		
//		c.add(10);
//		c.add('A');
//		c.add("Rahul");
//		
//		List<Integer> d = new ArrayList<Integer>(); 	
//		d.add(10);
////		d.add("Rahul");
		
		
//		List<Integer> a = new ArrayList<Integer>();
//		a.add(10);           //0
//		a.add(30);           //1
//		a.add(40);           //2
//		a.add(50);           //3
//		
//		System.out.println(a);
//		
////		a.add(20);           //4
//		
//		System.out.println(a);
		
		
//		//adding with help of index
//		a.add(1, 20);
//		System.out.println(a);
//		
//		//remove
//		a.remove(0);
//		
//		System.out.println(a);
//		
//		//replace
//		a.set(3, 55);
//		System.out.println(a);
		
		
		//particular value print
//		System.out.println(a.get(0));
//		
//		for(int i=0; i<=3; i++)
//		{
//			System.out.println(a.get(i));
//		}

//		a.add(55);
//		System.out.println(a);
		
		
		//set
//		HashSet b = new HashSet();
//		b.add(10);
//		b.add(20);
//		b.add('A');
//		b.add("Rahul");
		
//		System.out.println(b);
		
		
////		Set a = new HashSet();
//		Set<String> a = new HashSet<String>();
////		a.add(10);
//		a.add("ABC");
//		a.add("DEF");
//		a.add("XYZ");
////		System.out.println(a);
//		
//		a.add("PQR");
//		a.add("Rahul");
//		a.add("AJAY");
//		
////		System.out.println(a);
//		a.add("AJAY");
//		
//		System.out.println(a);
//		
//		a
//		.it
		
		Set<Integer> a = new HashSet<Integer>();
//		a.add(10);
		a.add(10);
		a.add(20);
		a.add(30);

//		System.out.println(a);
		a.add(40);
		
		System.out.println(a);
		
	//no such index concept present here
		
		Iterator x = a.iterator();
		
		System.out.println(x.next());
		System.out.println(x.next());
		System.out.println(x.next());
		System.out.println(x.next());
		
		a.add(null);
		a.add(null);
		
		System.out.println(a);	
		
	}

}