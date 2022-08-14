package logics;

import java.util.Scanner;

public class ReverseNumberWitoutStringConveter {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any no. to reverse");
		int num=sc.nextInt();
		int revNum=0;
		
//		System.out.println(num/10);
//		System.out.println(num%10);
//		System.out.println(123/10);
//		System.out.println(123%10);
		
		for (int i=num;i>0;i=i/10)
		{
			int rem=i%10;
			revNum=revNum*10+rem;
		}
		
		System.out.println("the reverse of the no. is "+revNum);

	}

}
