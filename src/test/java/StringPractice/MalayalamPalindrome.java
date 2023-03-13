package StringPractice;

public class MalayalamPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="malayalam";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			
			char c=str.charAt(i);
			for(int j=i+1;j<str.length();j++)
			{
				if(c==str.charAt(j))
				{String copy="";
				int cno=i;
				while(cno<=j)
				{		
					copy=copy+str.charAt(cno);
					cno++;
				}
				String rev="";
				int no=copy.length()-1;

				while(no>=0)
				{
					rev=rev+copy.charAt(no);
					no--;
				}
				if(copy.equalsIgnoreCase(rev)) {
					count++;
					System.out.println(count+"st palindrome is "+rev);
				}
				}
			}
		}
		System.out.println("totally "+count+" palindrome is present in "+str);
		
		
	}

}
