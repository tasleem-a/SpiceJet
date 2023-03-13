package StringPractice;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class CountNoofVowelsInaStringwithoutDuplicate {

	public static void main(String[] args) {
		for(;;)
		{
			Scanner sc=new Scanner(System.in);
			String s=sc.next();
			s=s.toLowerCase();
			int count=0;
			char[] ch=s.toCharArray();
			LinkedHashSet<Character> set=new LinkedHashSet();
			for(int i=0;i<ch.length;i++)
				set.add(ch[i]);
			for(char c:set)
			{
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
				{
					count++;
					System.out.print(c);
				}
			}
			System.out.println( " ="+count);
		}
	}

}
