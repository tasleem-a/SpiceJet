package Pattern;

public class SquarePattern {
	public static void main(String[] args) {
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
				System.out.print("* ");
			System.out.println();
		}
		System.out.println("--------------------");
		for(int i=0;i<5;i++)
		{
			for(int j=i;j>=0;j--)
				System.out.print("* ");
			System.out.println();		
		}
		System.out.println("--------------------");
		for(int i=0;i<5;i++)
		{
			for(int j=i;j<5;j++) 
				System.out.print("* ");
			System.out.println();
		}
		System.out.println("--------------------");
		int space=4;
		int star=1;
		for(int i=1;i<=5;i++)	
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("* ");
			}
			space--;
			star++;
			System.out.println();

		}
		System.out.println("--------------------");
		int star1=5;
		int space1=0;
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=space1;k++)
			{
				System.out.print("  ");
			}
			space1++;
			for(int j=1;j<=star1;j++)
			{
				System.out.print("* ");
			}
			star1--;
			System.out.println();
		}

		System.out.println("------------------------");
		int no=4;
		int star2=1;
		int space2=3;
		for(int i=1;i<=no;i++)
		{
			for(int j=1;j<=space2;j++)
			{
				System.out.print("  ");
			}
			space2--;
			for(int k=1;k<=star2;k++)
			{
				System.out.print("* ");
			}
			star2=star2+2;
			System.out.println();
		}
		System.out.println("--------------------------");
		int num=4;
		int star3=4;
		int space3=0;
		for(int i=1;i<=no;i++)
		{
			for(int j=1;j<=space3;j++)
			{
				System.out.print(" ");
			}
			space3++;
			for(int k=1;k<=star3;k++)
			{
				System.out.print("* ");
			}
			star3--;
			System.out.println();
		}
		System.out.println("----------------------------");
		int n=5;
		int st=1;
		int sp=n-1;
		for(int i=1;i<=5;i++){
			for(int l=1;l<=sp;l++)
			{
				System.out.print("  ");
			}
			sp--;
			for(int m=1;m<=st;m++)
			{
				System.out.print("* ");
			}
			st=st+2;
			System.out.println();

		}
		st=(n-1)*2;
		sp=1;
		for(int j=n-1;j>=1;j--){
			for(int l=1;l<=sp;l++)
			{
				System.out.print("  ");
			}
			sp++;
			for(int m=1;m<st;m++)
			{
				System.out.print("* ");
			}
			st=st-2;
			System.out.println();
		}
		
		System.out.println("------------------------------");


	}

}
