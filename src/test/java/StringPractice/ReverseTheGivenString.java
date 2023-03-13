package StringPractice;

public class ReverseTheGivenString {
	public static void main(String[] args) {
		String str="Hai, I am Softer Test Engineer";
		String[] strarr=str.split(" ");
		for(int i=strarr.length-1;i>=0;i--)
			System.out.print(strarr[i]+" ");
		
	}

}
