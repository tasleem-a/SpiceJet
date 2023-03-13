package InterviewQuesPractice;

public class SonyProductOfnumInString {
	public static void main(String[] args) {
		String s="I a1m goi123ng to fi3215nd pro234duct fot the num1212bers ins1212ide th1212is st3245ring";
		String[] str=s.split(" ");
		long pro=1;
		for(int i=0;i<str.length;i++){ 
			String no="";
			String s1=str[i];
			for(int j=0;j<s1.length();j++)
			{
				if(s1.charAt(j)>='0' && s1.charAt(j)<='9')
				{
					no=no+s1.charAt(j);
				}
			}
			if(no!="") {
				int num=Integer.parseInt(no);
				pro=pro*num;
			}
		}
		System.out.println("----->"+pro);
	}
}


