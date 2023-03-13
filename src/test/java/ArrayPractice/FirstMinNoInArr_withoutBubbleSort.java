package ArrayPractice;

public class FirstMinNoInArr_withoutBubbleSort {
	public static void main(String[] args) {
		int[] arr= {50,10,80,20,40,30};
		int small=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(small>arr[i])
			{
				small=arr[i];
			}
		}
		System.out.println(small);
	}

}
