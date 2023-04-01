package ArrayString;

import java.util.Iterator;
import java.util.Scanner;

public class Swap {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array length");
		int n=sc.nextInt();
	    int a[]=new int[n];
	    System.out.println("enter array elements");
	    for (int i = 0; i < a.length; i++) {
			System.out.println("enter an elements");
			a[i]=sc.nextInt();
		}
	    System.out.println("enter 2 index to swapping the contects");
	    int i1=sc.nextInt();
	    int i2=sc.nextInt();
	    System.out.println("conects before swapping");
	    for (int i = 0; i < a.length-1; i++) {
			System.out.print(a[i] +" ");
		}
	    System.out.println();
	    int help;
	    help=a[i1];
	    a[i1]=a[i2];
	    a[i2]=help;
	    System.out.println("contect after swapping");
	    for (int i = 0; i < a.length-1; i++) {
			System.out.print(a[i] +" ");
		}
	}

}
