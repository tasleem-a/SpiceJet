package StringPractice;

public class SumOfDoubleDigitInAString {
public static void main(String[] args) {
	String s="a11b10d3";
	int dob=0;
	int sum=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)>='0' && s.charAt(i)<='9')
		{
			int no=s.charAt(i)-48;
			dob=dob*10+no;
		}
		else{
			sum=sum+dob;
			dob=0;
		}
	}
	sum=sum+dob;
	System.out.println(sum);
}
}
