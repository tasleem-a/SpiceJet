package InterviewQuesPractice;

import java.util.LinkedHashSet;

public class CountOccuranceOfString {
	public static void main(String[] args) {
		String s="The grass is green";
		String s1=s.replace(" ", "");
		char[] ch=s1.toCharArray();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<ch.length;i++)
		{
			set.add(ch[i]);
		}
		for(char c: set) {
			int count=0;
			for(int i=0;i<ch.length;i++)
			{
				if(c==ch[i])
					count++;
			}
			System.out.println(c+" count is "+count);
		}
		System.out.println("-----------------");
		String str="aabbcdef";
		LinkedHashSet<Character> set1=new LinkedHashSet<Character>();
		for(int i=0;i<str.length();i++)
		{
			set1.add(str.charAt(i));
		}
		System.out.println(set1);
		System.out.println(str);
		for(char st: set1) {
			int count = 0;
			for(int j=0;j<str.length();j++)
			{
				if(st==str.charAt(j))
				{
					count++;
				}
			}
			if(count <2)
			{
				System.out.println("first non-duplicate character: "+st);
				break;
			}
		}
	}

}

