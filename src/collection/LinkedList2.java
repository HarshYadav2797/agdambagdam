package collection;
import java.util.ArrayList;
import java.util.LinkedList;
public class LinkedList2 {
	public static void main(String[] args) {
		        LinkedList<Object> l = new LinkedList<>();
		        l.add(10);
		        l.add(25);
		        l.add(67);
		        l.add("harsh");
		        l.add(true);
		        l.add(1,23);
		        System.out.println(l);
		     
		        ArrayList<Object> al = new ArrayList<>();	
		        al.add(24);
		        al.add(23);
		        al.add(24);
		        al.add(23);
		        al.add(23);
		        al.add(67);
		        al.add(23);
		        al.add(23);
		        al.add(2,56);
		        al.remove(2);
		        al.contains(24);
		        al.remove(0);
		        al.isEmpty();
		        System.out.println(al);
	}

}
