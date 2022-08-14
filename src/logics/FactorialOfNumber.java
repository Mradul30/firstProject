package logics;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enetr Any no.");
		int num=sc.nextInt();
		
		int fact=1;
		
		for(int i=num;i>0;i--)
		{
			fact=fact*i;
		}
		
		System.out.println("the factorial of given no. is "+fact);

	}

}
