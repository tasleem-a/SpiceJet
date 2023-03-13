package StringPractice;

public class SumOfDigitInString {
public static void main(String[] args) {
	String s="a1b2c4";
	int sum=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)>='0' && s.charAt(i)<='9')
		{
			int no=s.charAt(i)-48;
			//int no=Character.getNumericValue(s.charAt(i));
			sum=sum+no;
		}
	}
	System.out.println(sum);
	
}
}
