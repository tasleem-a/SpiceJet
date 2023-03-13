package StringPractice;

public class FindMinLengthInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s= {"ab","abcd","a","abc"};
		String minLen=s[0];
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()<minLen.length())
			{
				minLen=s[i];
			}
		}
		System.out.println("min length in a string is "+minLen
				);
		
		}

	}
