package ArrayPractice;

public class FirstMinInArray {
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
		System.out.println("firstMax is"+arr[arr.length-1]);
		System.out.println("SecondMax is"+arr[arr.length-2]);
		System.out.println("first Min is"+arr[0]);
		System.out.println("last min is"+arr[arr.length-1]);
		//System.out.println("sum of first 3 min"+a[]);
	}

}
