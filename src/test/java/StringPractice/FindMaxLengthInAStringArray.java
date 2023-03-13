package StringPractice;

public class FindMaxLengthInAStringArray {
	public static void main(String[] args) {
		String[] s= {"ab","abcd","a","abc","b","qrst"};
		String maxLen=s[0];
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()>maxLen.length())
			{
				maxLen=s[i];
			}
		}
		for(int i=0;i<s.length;i++)
		{
			if(maxLen.length()==s[i].length())
			{
				System.out.println("Maximum length in a String array is :"+s[i]);
			}
		}
	}

}
