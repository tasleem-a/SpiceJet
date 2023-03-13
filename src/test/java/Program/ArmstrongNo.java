package Program;

public class ArmstrongNo {
	public static void main(String[] args) {
		for(int i=1;i<=500000;i++)
		{
			int num=i;
		int copy=num;
		int len = String.valueOf(copy).length();
		int sum=0;
		while(num!=0)
		{
			int rem=num%10;
			sum=sum+(int)Math.pow(rem, len);
			num=num/10;		
		}
		if(sum==copy)
		System.out.println(sum);
		}
	}
	

}
