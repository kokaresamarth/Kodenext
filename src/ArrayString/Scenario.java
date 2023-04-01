package ArrayString;
import java.util.Scanner;
public class Scenario 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0;i<=4;i++)
		{
		System.out.println("enter the no of costember");
		arr[i]=sc.nextInt();
		}
		
		System.out.println("Array contact are");
		for(int i=0;i<=4;i++)
		{
		System.out.print(arr[i]+" ");
		}
	}
}
