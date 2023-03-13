package Program;

public class FindStrongNumber {
	public static void main(String[] args) {
		int no=121;
		int copy=no;
		int rev=0;
		while(no!=0)
		{
			int rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
			
		}
		if(rev==copy)
			System.out.println("it is palindrome");
			
	int num=5;
	int fact=1;
	for( int i=2;i<=num;i++)
	{
		fact=fact*i;
	}
	System.out.println(fact);
}
}
