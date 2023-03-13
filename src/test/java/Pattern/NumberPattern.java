package Pattern;

public class NumberPattern {
public static void main(String[] args) {
	int no=5;
	for(int i=1;i<=no;i++) {
		for(int j=1;j<=no;j++)
		System.out.print("1 ");
		System.out.println();
	}
	System.out.println("--------------------");
	for(int i=1;i<=no;i++) {
		for(int j=1;j<=no;j++)
		System.out.print(j+" ");
		System.out.println();
	}
	System.out.println("--------------------");
	for(int i=1;i<=no;i++) {
		for(int j=1;j<=no;j++)
		System.out.print(i+" ");
		System.out.println();
	}
	System.out.println("---------------------");
	for(int i=1;i<=no;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}
	System.out.println("---------------------");
	for(int i=1;i<=no;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	System.out.println("---------------------");
	no=5;
	for(int i=1;i<=no;i++)
	{
		for(int j=i;j<=no;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
	}
	System.out.println("---------------------");
	no=5;
	for(int i=1;i<=no;i++)
	{
		for(int j=1;j<i;j++)
		{
			System.out.print(" ");
		}
		for(int k=i;k<=no;k++)
			System.out.print(i+" ");
		System.out.println();
	}
	System.out.println("---------------------");
	no=5;
	int space=no-1;
	int p=1;
	for(int i=1;i<=no;i++)
	{
		for(int j=1;j<=space;j++)
		{
			System.out.print("  ");
		}space--;
		for(int j=1;j<=p;j++)
		{
			if(j>i)
			{
				for(int k=j-2;k>=1;k--)
					System.out.print(k+" ");
break;
			}
			else
				System.out.print(j+" ");
		}p=p+2;
		System.out.println();
	}
	System.out.println("------------------------");
	no=5;
	int add=0;
	int upp=0;
	for(int i=1;i<=no;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j+add+" ");
			add=j+1;
		}
		//add=upp;
		System.out.println();
	}

	
}
}
