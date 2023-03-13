package StringPractice;

import java.util.Scanner;

public class CountNoofVowelsInaStringwithDuplicate {

	public static void main(String[] args) {
		for(;;) {
			Scanner sc=new Scanner(System.in);
			String s=	sc.next();
		s=s.toLowerCase();
		char[] ch=s.toCharArray();
//		for(int i=0;i<ch.length;i++)
//		{ char c=ch[i];
//			for(int j=i+1;j<ch.length;j++)
//			{
//				if(c==ch[j])
//				{
//					ch[j]='*';
//				}
//			}
//		}
		System.out.println(s);
		
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if('a'==ch[i] || 'e'==ch[i]|| 'i'==ch[i]|| 'o'==ch[i]|| 'u'==ch[i])
			{
			count++;
			System.out.print(ch[i]);
			}
		}
		System.out.println(s+" contains "+count+" vowels");
		}
	}
}
