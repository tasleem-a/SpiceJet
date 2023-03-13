package newPractice;

public class Ip123_op123112233111222333 {
	public static void main(String[] args) {
		int ip=123;
		while(ip!=0)
		{
			int no=ip%10;
			for(int j=1;j<=3;j++)
			{
				for(int i=3;i>=no;i--)
				{
					System.out.print(j);
				}
			}
			System.out.println();

			ip=ip/10;
		}


	}
}
