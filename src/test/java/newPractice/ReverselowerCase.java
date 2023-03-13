package newPractice;

public class ReverselowerCase {
	public static void main(String[] args) {
		String s="TasleemAutomaTioM";
		System.out.println("INPUT_______________"+s);
		char[] ch=new char[s.length()]; int j=0;
		for(int i=(s.length()-1); i>=0;i--)
		{
		ch[j]=s.charAt(i);
		j++;
		}
		String con="";
		System.out.println("reverse__________");
		System.out.println(ch);
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a' && ch[i]<='z')
			{
				con=con+ch[i];
			}
		}
System.out.println(con.toUpperCase());
con="";
for(int i=0;i<ch.length;i++)
{
	if(ch[i]>='A' && ch[i]<='Z')
	{
		con=con+ch[i];
	}
}
System.out.println(con.toLowerCase());

	}

}
