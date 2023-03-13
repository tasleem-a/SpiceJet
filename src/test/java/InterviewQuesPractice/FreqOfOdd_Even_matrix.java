package InterviewQuesPractice;

public class FreqOfOdd_Even_matrix {
	public static void main(String[] args) {
		int[][] arr= {{2,2,2},{6,5,6},{7,8,9}};
		int odd=0;
		int even=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i][j]%2==0)
				{System.out.println(arr[i][j]+"even");
					even++;
				}
				else
				{System.out.println(arr[i][j]);
					odd++;
				}
			}
		}
		System.out.println(odd+"  "+even);
		
	}

}
