package newPractice;

public class I_love_india {
	public static void main(String[] args) {
		String s="I Love India";
		String str=s.replace(" ", "");
		System.out.println(str);
		int rev=str.length()-1;
		for(int i=0;i<s.length();i++)
		{
			if(' '!=s.charAt(i))
			{
			System.out.print(str.charAt(rev));
			rev--;
			}
			else
			{	System.out.print(" ");
			
			}
			
		}
		
	}

}
