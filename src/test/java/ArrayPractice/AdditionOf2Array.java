package ArrayPractice;

import java.util.Arrays;

//40900====o/p--49000
public class AdditionOf2Array {
	public static void main(String[] args) {
		int[] a= {2,1,3,4,2};
		int[] b= {3,4,1,5};
		int[] c=a;
		for(int i=0;i<c.length;i++)
		{try {
			c[i]=a[i]+b[i];
		}
		catch (Exception e) {
			// TODO: handle exception
			if(a.length>b.length)
			{
				c[i]=a[i];
			}
			else
			{
				c[i]=b[i];
			}
		}
		}
		
		for(int i=0;i<c.length;i++)
		{
			
			System.out.print(c[i]);
		}
		System.out.println();
		Arrays.sort(c);
	
		for(int i=0;i<c.length;i++)
		{
			
			System.out.print(c[i]);
		}
		
	}

}
