package Program;

public class Scenario {
	public static void main(String[] args) {
		String url="https://abc.com/xyz?user45+user20+a=a1324T#1234";
		String s1="";
		int count=0;
		for(int i=0;i<url.length();i++)
		{
			if(url.charAt(i)=='?')
			{
				for(i=i+1;i<url.length();i++)
				{
					if(url.charAt(i)=='+') {
						System.out.println(s1);
						s1="";
						count++;
					}
					else {
						s1=s1+url.charAt(i);
					}
					if(count==2)
						i=url.length()+1;
				}
			}

		}
		System.out.println(s1);
		
		
//		String Url="https://www.google.com/search?q=selenium+download&oq=selenium+down&aqs=chrome.0.0i433i512j0i512j69i57j0i512l7.4751j0j15&sourceid=chrome&ie=UTF-8";
//		String[] s=Url.
		
	}
}
