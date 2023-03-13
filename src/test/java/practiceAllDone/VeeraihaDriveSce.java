package practiceAllDone;

import java.util.ArrayList;

public class VeeraihaDriveSce {
public static void main(String[] args) {
	String str="welcome to tyss";
	ArrayList<String> list=new ArrayList();
	String s="";
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)!=' ')
		{
			s=s+str.charAt(i);
		}
		else {
			list.add(s);
			s="";
		}
	}
	list.add(s);
	System.out.println(list);
	//
	for(int i=0;i<list.size();i++)
	{
		String temp=list.get(0);
		list.add(1, temp);
	}
	
}
}
