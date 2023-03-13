package newPractice;

public class AEIOU {
	public static void main(String[] args) {
		for(int k=1;k<=5;k++) {
			int count=0;
			for(int i=97;i<=122;i++)
			{
				if(i=='a' ||i=='e'||i=='i'||i=='o'||i=='u')
				{
					System.out.print((char)i);
					count++;
				}
				if(count>=k)
					break;
			}
			System.out.println();
		}
		
		String s="";
		for(int i=97;i<=122;i++)
		{
			if(i=='a' ||i=='e'||i=='i'||i=='o'||i=='u')
			{
				char c=(char)i;
				s=s+c;
				System.out.println(s);
			}
			
		}
	}
}

