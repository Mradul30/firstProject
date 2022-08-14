package logics;

import java.util.Scanner;

public class ArmStringNumbe {

	public static void main(String[] args) 
	{
        Scanner sc= new Scanner(System.in);
		
		System.out.println("Enetr Any no.");
		int num=sc.nextInt();
		
		int sum=0;
		for (int i=num;i>0;i=i/10)
		{
			int rem=i%10;
			sum=sum+(rem*rem*rem);
		}
		
		if (num==sum)
		{
			System.out.println("the given no. is ArmStrong no");
		}
		else
		{
			System.out.println("the given no. is not an ArmStrong no");
		}

	}

}
