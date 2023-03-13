package StringPractice;

import org.apache.poi.util.SystemOutLogger;

public class SegregateAlphaNumSpec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="a2Bc%a&d";
		String apha="";
		String num="";
		String spe="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>'0' && s.charAt(i)<='9')
			{
				num=num+s.charAt(i);
			}
			else if(s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z')
			{
	
				apha=apha+s.charAt(i);
			}
			else
			{
				spe=spe+s.charAt(i);
			}
			
		}
//					for(int i=0;i<s.length();i++)
//					{
//						if(Character.isAlphabetic(s.charAt(i)))
//						{
//							apha=apha+s.charAt(i);
//						}
//						else if(Character.isDigit(s.charAt(i)))
//							num=num+s.charAt(i);
//						else
//							spe=spe+s.charAt(i);
//							
//					}
		System.out.println(apha);
		System.out.println(num);
		System.out.println(spe);

	}

}


