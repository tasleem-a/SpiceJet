
package ArrayPractice;

public class Array_1stMinand2ndMin_withoutBB_dupl {
	public static void main(String[] args) {
		int[] arr= {80,20,40,30,20,40,20};
		int FirstMin=arr[0];
		int SecMin=arr[1];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<FirstMin)
			{
				SecMin=FirstMin;
				FirstMin=arr[i];

			}
			else if(arr[i]<SecMin)
			{
				if(arr[i]==FirstMin)
				{	
				}
				else {
					SecMin=arr[i];
				}
			}
			}	
		System.out.println(FirstMin);
		System.out.println(SecMin);
		
	}

}
