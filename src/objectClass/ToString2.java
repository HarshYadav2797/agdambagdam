package objectClass;

public class ToString2 {
	
	/**
	 * if we are using toString() it will print values
	 * if we are not using toString() method then 'st' variable will print object address
	 */
	
	
	public static void main(String[] args) {
		
		ToString st = new ToString("Infosys", "Harsh",100);
		System.out.println(st);
		
		ToString st1 = new ToString("Wipro","harsh", 899999);
		System.out.println(st1);
		

		ToString st2 = new ToString("Wipro","harsh", 899999);
		System.out.println(st2);

		ToString st3 = new ToString("Wipro","harsh", 899999);
		System.out.println(st3);

		ToString st4 = new ToString("Wipro","harsh", 899999);
		System.out.println(st4);
		
	}
	

}
