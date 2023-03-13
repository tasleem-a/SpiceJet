package newPractice;

public class MaxlengthInStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s={"4564","345","23","5678"};
		int max=s[0].length();

			for(int j=0;j<s.length;j++)
			{
				if(s[j].length()<max)
				{
					max=s[j].length();
				}
			}

		for(int i=0;i<s.length;i++)
		{
			if(max==s[i].length())
			{
				System.out.println(max+" legth in String array is "+s[i]);
			}
		}

	}

}
