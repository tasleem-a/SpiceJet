package ArrayPractice;

public class FirstMaxNumInArr_withoutBubbleSort {
	public static void main(String[] args) {
		int[] arr= {20,80,50,70,10,30};
		int large=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(large<arr[i])
			{
				large=arr[i];
			}
		}
		System.out.println(large);
	}

}
