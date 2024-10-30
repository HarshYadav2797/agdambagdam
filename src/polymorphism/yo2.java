package polymorphism;

import java.util.ArrayList;
import java.util.Iterator;

public class yo2 {
	
	public static void main(String[] args) {
		ArrayList<Object> ar = new ArrayList<>();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		
		ArrayList<Object> ar2= new ArrayList<>();
		ar2.add(10);
		ar2.add(20);
		ar2.add(30);
		
		System.out.println(ar2);
		System.out.println(ar);
		
		ar.add(ar2);
		System.out.println(ar);
		Iterator<Object> it = ar.iterator();
		//Iterator<Object> it2 = ar.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		/* Object hs = it.next();
		 System.out.println(hs);
		
		 Object hs1 = it.next();
		 System.out.println(hs1);
		 
		 Object hs2 = it.next();
		 System.out.println(hs2);
		 
		 
		// Iterator<Object> it2 = ar.iterator();
		 Object hs3 = it.next();
		 System.out.println(hs3);*/
		 
		
	} 

}
