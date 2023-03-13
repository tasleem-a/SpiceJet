package ArrayPractice;

public class Array_1stMin2ndMin_withoutBubble {
	public static void main(String[] args) {
		int[] arr= {50,20,10,40,80,30,10};
		int firstMin=arr[0];
		int SecMin=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(firstMin>arr[i])
			{
				SecMin=firstMin;
				firstMin=arr[i];
				
			}
			else if(SecMin>arr[i])
			{
				SecMin=arr[i];
			}
		}
		System.out.println(firstMin);
		System.out.println(SecMin);
	}

}
