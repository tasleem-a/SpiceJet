package ArrayPractice;

public class MultiplyOf1st_3minNo {
	public static void main(String[] args) {
		int[] arr= {10,8,5,9,70,80,1};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		int mul=1;
		for(int m=0;m<3;m++)
		{
			mul=mul*arr[m];
		}
		System.out.println("Multiply of first min no: "+mul);
	}

}
