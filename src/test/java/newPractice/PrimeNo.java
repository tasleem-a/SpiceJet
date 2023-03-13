package newPractice;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String args[])
	{
		int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

		for (int i=0;i<arr.length;i++)
		{
			int num=arr[i];
			boolean flag=true;
		for(int j=2;j<num;j++)
		{
			if(num%j==0)
			{
				flag=false;
				break;
			}
		}
		if(flag)
		{
			System.out.println(num+" is prime Number");
		}

		}
		
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		boolean flag=true;
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println(no+" is prime no");
	}
}




