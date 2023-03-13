package StringPractice;

import java.util.Iterator;

public class ReverseThewordsInString {
	public static void main(String[] args) {
		String str="Hai, I am Softer Test Engineer";
		String[] strarr=str.split(" ");
		for(int i=0;i<strarr.length;i++)
		{
			String s=strarr[i];
			String rev="";
			for(int j=s.length()-1;j>=0;j--)
				System.out.print(s.charAt(j));
			System.out.println();
				
		}
		System.out.println("------------------");
		String str1="i am form sdet44 batch";//batch am from sdet44 i
		String[] str2=str1.split(" ");
		String temp=str2[0];
		str2[0]=str2[str2.length-1];
		str2[str2.length-1]=temp;
		for(String s:str2)
		{
			System.out.print(s+" ");
		}
		System.out.println("------------------");
		String[]	st={"welcome","to","tyss"};
		String last="";
		for(int i=0;i<3;i++)
		{
			
			last=st[0];
			st[0]=st[1];
			st[1]=st[2];
			st[2]=last;
			for(int j=0;j<st.length;j++)
			System.out.print(st[j]+" ");
			System.out.println();
		}
		
	}

}
