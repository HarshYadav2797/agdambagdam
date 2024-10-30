package arrays;

public class ToFetchDataFromArray {
	public static void main(String[] args) {
		int[] a = new int[5];
		System.out.println(a.length+ ": length of an array");
		a[0]=10;
		a[1]=45;
		a[2]=66;
		a[3]=99;
		a[4]=34;
		
	    /*System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);*/
		for(int i =0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}

}
