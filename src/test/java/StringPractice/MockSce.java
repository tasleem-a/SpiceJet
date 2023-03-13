package StringPractice;

public class MockSce {
	public static void main(String[] args) {
		String s="tasleem";
		char[] str=s.toCharArray();
		char	c=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<s.length();j++)
			{
				if(str[i]!=str[j])
				{
					if(str[i]=='a' || str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u')
					{
					c=str[i];
						
					}
				}
			}
			System.out.println(c);
		}
	}

}
