package newPractice;

public class Output000 {

	public static void main(String args[])
	{
		int[] arr={9,2,0,0,3,0,1};
		int[] output=new int[arr.length];
		int a=0;
		int b=arr.length-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				output[a]=arr[i];
				a++;
			}
			else
			{
				output[b]=arr[i];
				b--;
			}
		}
		for(int j=0;j<output.length;j++)
		{
			System.out.print(output[j]);
		}
			  
	}
}



