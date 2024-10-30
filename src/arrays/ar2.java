package arrays;

public class ar2 {
public static void main(String[] args) {
	
	System.out.println("main starts");
	int a[]=new int[5];
	a[0]=10;
	a[1]=12;
	a[2]=12;
	a[3]=12;
	a[4]=12;
	
	System.out.println(a[0]);
	System.out.println(a[1]);
	System.out.println(a[2]);
	System.out.println(a[3]);
	System.out.println(a[4]); 
	
	for(int i=0; i<a.length; i++)
	{
		System.out.println(a[i]);
	}
	
	System.out.println("main ends");
}
}
