package newPractice;

public class WithoutBubbleSort {public static void main(String[] args) {
	int[] arr= {7,-3,0,2,1,-9};
	int large=0;
	int sec=0;
	int third=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>large) {
			third=sec;
			sec=large;
			large=arr[i];
		}
		else if(arr[i]>sec){
				third=sec;
				sec=arr[i];
				}
			else if(arr[i]>third)
			{
				third=arr[i];
				
			}
				}
		
		
	
	System.out.println(large);
	System.out.println(sec);
	System.out.println(third);
}

}
