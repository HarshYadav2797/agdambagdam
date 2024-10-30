package arrays;
import java.util.Scanner;

public class DynamicInitializationOfArray {

	public static void main(String[] args) {
	
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value");
    int[] a= new int[sc.nextInt()];
    
    for(int i=0; i<a.length; i++)
    {
    	System.out.println("Enter the "+i+"value");
    	a[i]=sc.nextInt();
    }
    
   
    for( int i=0; i<a.length; i++)
    {
    System.out.println("all values");
    System.out.println(a[i]);
    
	    }
	  }
	}