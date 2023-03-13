package newPractice;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

public class Duplicates {
	public static void main(String[] args) {
//	String s="Technologies";
//		s=s.toLowerCase();
//		char[] ch=s.toCharArray();
//		
//		int duplicates=0;
//		int unique=0;
//		for(int i=0;i<s.length();i++)
//		{
//			for(int j=i+1;j<s.length();j++)
//			{
//				if(ch[i]==ch[j])
//				{
//					ch[j]='*';
//				}
//				
//			}
//			
//		}
//
//		for(int i=0;i<s.length();i++)
//		{
//			if(ch[i]!='*')
//			{
//				System.out.print(ch[i]);
//				unique++;
//			}
//			else
//			{
//				duplicates++;
//			}
//		}
//		System.out.println();
//		System.out.println("duplicates count is "+ duplicates);
//		System.out.println("unique count is "+unique);
		
		
		
//		String s="Technologies";
//		s=s.toLowerCase();
//		char[] ch=s.toCharArray();
//		HashMap<Character,Integer> map=new HashMap();
//		for(int i=0;i<s.length();i++)
//		{
//			if(!map.containsKey(ch[i]))
//			{
//			map.put(ch[i],1);
//			}
//			else{
//			Integer count=map.get(ch[i]);
//			map.put(ch[i],count+1);
//			}
//		}
//		for(Entry<Character,Integer> m:map.entrySet())
//		{
//		if(m.getValue()>1)
//		{
//		System.out.println(m.getKey()+"-------------"+m.getValue());
//		}
//		}
//		}
		
		
		String s="Technologies";
		s=s.toLowerCase();
		char[] ch=s.toCharArray();
		LinkedHashSet<Character> set=new LinkedHashSet();
		for(char c:ch)
		{
			set.add(c);
		}
		for(char un:set) {
			int count=0;
			for(int i=0;i<ch.length;i++)
			{
				if(un==ch[i])
				{
					count++;
				}
			}
			System.out.println(un+"-------------"+count);
		}
		
	
	
	}	
		

	}


