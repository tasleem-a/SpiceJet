package StringPractice;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class ToPrintPositionOfEachChar {
	public static void main(String[] args) {
		String st="Tester";
		st=st.toLowerCase();
		for(int i=0;i<st.length();i++) {
			System.out.println(st.charAt(i)+" is in"+(i+1)+" position");
		}
		
		System.out.println("without duplicate");
		LinkedHashSet<Character> list=new LinkedHashSet<Character>();
		for(int i=0;i<st.length();i++)
			list.add(st.charAt(i));
		for(Character ch: list)
		{
			
			for(int i=0;i<st.length();i++)
			{
				if(ch==st.charAt(i)) {
					System.out.println(ch+" is in"+(i+1)+" position");
				break;
				}
			}
		}
		
	}

}
