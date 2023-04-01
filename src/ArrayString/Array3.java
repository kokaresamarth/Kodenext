package ArrayString;

import java.util.Scanner;

public class Array3 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int arr[][][]=new int[3][3][4];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
					System.out.println("Enter the marks of university "+i+" collage "+j+" student "+k);
					arr[i][j][k]=sc.nextInt();
				}
			}
		}
		System.out.println("Array contacts are");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
					System.out.print(arr[i] [j] [k] );
				}
				System.out.println( );
			}
		}
	}

}
