package StringPractice;

import java.util.LinkedHashSet;

public class DuplicateScenarioForInteger {
	public static void main(String[] args) {
		int[] a= {5,6,6,7,1,5,0};
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
			set.add(a[i]);
		System.out.println("1) Remove duplicate no in a integer arrar");
		System.out.println("-----------------------------------------");
		for(int num:set)
			System.out.print(num+" ");
		System.out.println();
		System.out.println("-----------------------------------------");
		System.out.println("2) occourance of each no in a integer arrar");
		System.out.println("-----------------------------------------");
		for(int num:set)
		{
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				if(num==a[i])
					count++;
			}
			System.out.println(num+" occured "+count+" time");
		}
		System.out.println("-----------------------------------------");
		System.out.println("3) count the duplicate no in a integer array");
		System.out.println("-----------------------------------------");
		for(int num:set)
		{
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				if(num==a[i])
					count++;
			}
			if(count>1)
			System.out.println(num+" duplicate "+count+" time");
		}
		System.out.println("-----------------------------------------");
		System.out.println("4) count the unique no in integer array");
		System.out.println("-----------------------------------------");
		for(int num:set)
		{
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				if(num==a[i])
					count++;
			}
			if(count==1)
			System.out.println(num+" duplicate "+count+" time");
		}
		System.out.println("-----------------------------------------");
		System.out.println("5) print the position of num with duplicate");
		System.out.println("-----------------------------------------");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]+" position is "+(i+1));
		System.out.println("-----------------------------------------");
		System.out.println("5) print the position of num with duplicate");
		System.out.println("-----------------------------------------");
		for(int num:set)
		{
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				if(num==a[i])
				{
					System.out.println(num+" position is "+(i+1));
					break;
				}
			}
		}
		
		
		
	}

}
