package StringPractice;

public class ReverseAString {

	public static void main(String[] args) {
		String str="Bangalore";
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		
		StringBuilder strBuild=new StringBuilder("Bangalore");
		System.out.println(strBuild.reverse());
		
	}
}
