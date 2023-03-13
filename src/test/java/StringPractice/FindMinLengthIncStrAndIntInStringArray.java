package StringPractice;

public class FindMinLengthIncStrAndIntInStringArray {
	public static void main(String[] args) {
		String[] sIn= {"1","124","56","47895","78964","4"};
		String minInt=sIn[0];
		for(int i=0;i<sIn.length;i++) {
			if(sIn[0].length()<sIn.length)
			{
				minInt=sIn[i];
			}
		}
		for(int i=0;i<sIn.length;i++) {
			if(minInt.length()==sIn[i].length())
			{
				System.out.println("Minimum Length is "+sIn[i]);
			}
		}
	}

}
