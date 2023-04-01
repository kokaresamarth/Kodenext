package ArrayString;
import java.util.Scanner;
public class Scenario2 
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int arr[][]=new int[5][3];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[j].length-1;j++)
			{
				System.out.println("Enter the amount of Bank " +i+ " costomer " +j );
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Array contects are");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[j].length-1;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}