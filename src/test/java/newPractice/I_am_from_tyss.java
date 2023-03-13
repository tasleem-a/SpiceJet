package newPractice;

import java.util.LinkedHashSet;

public class I_am_from_tyss {
	public static void main(String[] args) {
		String s="I am from tyss";
		String[] str=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			for(int j=str[i].length()-1;j>=0;j--)
			{
				System.out.print(str[i].charAt(j));
			}
			System.out.print(" ");
		}
		System.out.println();
		System.out.println("-----------------------------");
		String s1="3ab2c";
		int no=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='a' && s1.charAt(i)<='z')
			{
			}
			else{
			no=no+(s1.charAt(i)-48);
			}
		}
		System.out.println(no);
		System.out.println("-----------------------------");
		String s2="Mandyae";
	
		s2=s2.toLowerCase();
		LinkedHashSet<Character> set=new LinkedHashSet();
		int count=0;
		char[] ch=s2.toCharArray();
		for(char c:ch)
			set.add(c);
		for(char check:set) {
			if(check=='a' || check=='e' ||check=='i' || check=='o'|| check=='u' )
			{
				count++;
				System.out.println("vowels is "+check);
			}
			
		}
	System.out.println("count of Vowels "+count);
	
	System.out.println("--------------------------------------");
	
	String[] str1= {"Rakshith", "Chat", "Zoom"};
	System.out.println('A'+10);
	
int num=123;
	String n = String.valueOf(num);
char z = n.charAt(0);
		
	}

}
