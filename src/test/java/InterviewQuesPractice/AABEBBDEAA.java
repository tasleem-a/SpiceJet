package InterviewQuesPractice;

public class AABEBBDEAA {
	public static void main(String[] args) {
		String s="aabebbdeaa";
		for(int i=0;i<s.length();i++)
		{
			if(i==s.length()-1)
			{
				break;
			}
			for(int j=i;j<=i+1;j++)
			{
				System.out.print(s.charAt(j));
			}
			System.out.print(" ");
		}

	}
}

