package StringPractice;

import java.util.Scanner;

public class StringPalindrome {
public static void main(String[] args) {
	String str="Madam";
	String rev="";
	int i=str.length()-1;
	while(i>=0)
	{
		rev=rev+str.charAt(i);
		i--;
	}
	if(rev.equalsIgnoreCase(str))	System.out.println("it is palindrome");
	for(;;)
	{
		Scanner s=new Scanner(System.in);
		String checkStr=s.next();
	String reverse=""; 
		for(int j=checkStr.length()-1;j>=0;j--)
			reverse=reverse+checkStr.charAt(j);
		if(checkStr.equalsIgnoreCase(reverse))
			System.out.println(checkStr+" is palindrome");
		else
			System.out.println(checkStr+" it is not palindrome");
			
	}
		
	
}
}
