package ArrayPractice;

public class Array_1stMax2ndMax_withoutBB {
	public static void main(String[] args) {
		int[] arr= {5,1,2,3,5,4};
		int Fmax=arr[0];
		int Smax=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>Smax)
			{
				Smax=Fmax;
				Fmax=arr[i];
				
			}
			else if(arr[i]<Smax)
			{
				if(arr[i]==Fmax)
				{
					
				}
				else
				{
				Smax=arr[i];
				}
			}
		}
		System.out.println(Fmax);
		System.out.println(Smax);
	}

}
