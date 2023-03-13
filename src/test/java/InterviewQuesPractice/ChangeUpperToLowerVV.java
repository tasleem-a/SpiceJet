package InterviewQuesPractice;

public class ChangeUpperToLowerVV {
	public static void main(String[] args) {
		
		String s="HelloTasleem";
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=65 && ch[i]<=92)
			{
				//int ascc=ch[i];
				ch[i]=(char) (ch[i]+32);
			}
			else if(ch[i]>=97 && ch[i]<=122)
			{
			ch[i]=(char) (ch[i]-32);
				//System.out.println(ch[i]);
			}
		}
		for(char c:ch)
		{
			System.out.print(c);
		}
	String[] str= {"hi", "Java","python","bye"};
	for(int i=1;i<str.length-1;i++)
	{
		System.out.println(str[i]);
	}
	
	
	
	System.out.println("-------------");
	
String s1="aabbcdef";
for(int i=0;i<s1.length();i++)
{
	int count=1;
	for(int j=i+1;j<s1.length();j++)
	{
		if(s1.charAt(i)==s1.charAt(j))
				{
			count++;
			System.out.println(s1.charAt(i)+"-----"+count);
				}
	}
	if(count==1)
	{
		System.out.println(s1.charAt(count));
		break;
	}
}
System.out.println("--------------------");
String
	}

}
