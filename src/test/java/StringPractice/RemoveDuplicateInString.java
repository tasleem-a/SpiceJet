package StringPractice;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class RemoveDuplicateInString {

	public static void main(String[] args) {
		String str="AmjathKhan";
		str	=str.toLowerCase();
		
		System.out.println("//without collection");
		char[] arr=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{char ch=str.charAt(i);
		for(int j=i+1;j<str.length();j++)
		{
			if(ch==arr[j])
			{
				arr[j]='*';
			}
		}	
		}
		System.out.println(arr);
		for(int j=0;j<arr.length;j++)
		{
			if('*'==arr[j])
			{
				
			}
			else
				System.out.print(arr[j]);
		}	
		
		
		System.out.println("//using collection");
		
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<str.length();i++)
			set.add(str.charAt(i));
		for(Character ch:set)
			System.out.println(ch);
		
		
		System.out.println("//removing Duplicate and counting");
		for(Character ch:set)
		{
			int count=0;
			for(int i=0;i<str.length();i++)
			{	
				if(ch==str.charAt(i))
				{
					count++;
				}
			}
			System.out.println(ch + "is "+count+" times");

		}
	}

}
