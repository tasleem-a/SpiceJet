package StringPractice;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class DuplicateScenarioForString {
	public static void main(String[] args) {
		String str="i am am from a sdet44 a batch";
		String[]	strarr=str.split(" ");
		System.out.println("1) Removing Duplicate word in a string");
		System.out.println("------------------------------------");
		LinkedHashSet<String>	set=new LinkedHashSet();
		for(int i=0;i<strarr.length;i++)
			set.add(strarr[i]);

		for(String s:set)
			System.out.print(s+" ");
		System.out.println();
		System.out.println("------------------------------------");
		System.out.println("2) Occurance of Each word in a string");
		System.out.println("------------------------------------");
		for(String s:set)
		{	int count=0;
		for(int i=0;i<strarr.length;i++)
		{	
			if(s.equalsIgnoreCase(strarr[i]))
			{
				count++;
			}
		}
		System.out.println(s+" occured "+count+" time");

		}
		System.out.println("--------------------"
				+ "----------------");
		System.out.println("3) count the duplicate word in a string");
		System.out.println("------------------------------------");
		for(String s:set)
		{int count=0;
		for(int i=0;i<strarr.length;i++)
		{
			if(s.equalsIgnoreCase(strarr[i]))
				count++;
		}
		if(count>1)
			System.out.println(s+" duplicate count is "+count);
		}
		System.out.println("------------------------------------");
		System.out.println("4) count the unique values in string");
		System.out.println("------------------------------------");

		System.out.println("count of the unique words is "+set.size());
		System.out.println("------------------------------------");

		System.out.println("5) print position of each word with duplicate");
		System.out.println("------------------------------------");
		for(int i=0;i<strarr.length;i++)
			System.out.println(strarr[i]+" position is "+(i+1));
		System.out.println("------------------------------------");
		System.out.println("6) print position of each word without duplicate");
		System.out.println("-------------------------------------");
		for(String s:set) {
			for(int i=0;i<strarr.length;i++)
			{
				if(s.equalsIgnoreCase(strarr[i]))
				{
					System.out.println(s+" position is"+(i+1));
					break;
				}
			}
		}





	}

}
