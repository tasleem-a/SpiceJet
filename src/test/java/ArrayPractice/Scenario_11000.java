package ArrayPractice;

public class Scenario_11000 {
	public static void main(String[] args) {
		int[] a= {1,0,1,0,0};
		int i=0;
		while(i<a.length)
		{if(a[i]==1)
			System.out.println(a[i]);
		i++;
		}
		int j=0;
		while(j<a.length)
		{if(a[j]==0)
			System.out.println(a[j]);
		j++;
		}
		
		System.out.println("-----------------");
		
		int[] b=new int[a.length];
		int big=0;
		int small=a.length-1;
		for(int m=0;m<b.length;m++)
		{
			if(a[m]==1)
			{
				b[big]=a[m];
				big++;
			}
			else
			{
				b[small]=a[m];
				small--;
			}
		}
		for(int k:b)
		{
			System.out.print(k+" ");
		}
		
	}

}
