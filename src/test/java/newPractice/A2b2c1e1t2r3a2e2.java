package newPractice;

import java.util.LinkedHashSet;

public class A2b2c1e1t2r3a2e2 {
	public static void main(String[] args) {
		String s="aabbcettrrraaee";
		LinkedHashSet<Character> set=new LinkedHashSet();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		int k=0;
		int count=0;
		for(char ch:set) {
			for(int i=k;i<s.length()-1;i++)
			{
				
				if(ch==s.charAt(i))
				{
					count++;
				}
				else {
					k=i;
					break;
				}
			}
			System.out.print(ch);
			System.out.print(count);
			count=0;
		}


System.out.println();
		for(int i=0;i<s.length()-1;i++)
		{
			char c=s.charAt(i);
			count=0;
			for(int j=i;j<s.length();j++)
			{if(c==s.charAt(j))
				count++;
			else
			{
				i=j-1;
				break;
			}
			}
			System.out.print(c);
			System.out.print(count);
		}
	}
}
