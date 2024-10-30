package collection;
import java.util.ArrayList;
public class LinkedList {
	public static void main(String[] args) {
		System.out.println("main starts");
		ArrayList<Object> a= new ArrayList<Object>();
		a.add(10);
		a.add("java");
		a.add("java");
		a.add("java");
		a.add("java");
		a.add("java");
		
		//a.add(20,24); // this will throw error becuase first we need to fill all those 10 spaces first
		System.out.println(a);
		System.out.println(a.size()); //this will return an object based on index
		System.out.println(a.get(1)); // this will return object based on index
		System.out.println(a.isEmpty()); //this method is used to find that collection is empty or not
		System.out.println(a.remove(1)); //this will remove object based on the index position
		a.clear(); //this method is used to remove all the object from the collection
		System.out.println("main ends");
		
		
	}

}
