package Program;

import java.util.Scanner;

public class ArmStrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int copy=num;
		int power=String.valueOf(copy).length();
		int sum=0;
		while(num!=0)
		{
		int rem=num%10;
		sum=sum+(int)Math.pow(rem,power);
		num=num/10;
		}
		if(copy==sum)
		System.out.println("its is a armStrong Num"+copy);

	}

}
