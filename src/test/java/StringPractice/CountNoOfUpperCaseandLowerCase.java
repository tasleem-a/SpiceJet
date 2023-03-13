package StringPractice;

public class CountNoOfUpperCaseandLowerCase {
	public static void main(String[] args) {
		String str="BanGaLOre";
		int uppercase=0;
		int lowercase=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
				uppercase++;
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z')
				lowercase++;
			
		}
		System.out.println(uppercase+ "uppercase");
		System.out.println(lowercase+ "Lowercase"
				+ "");
	}

}
