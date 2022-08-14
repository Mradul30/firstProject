package logics;

import java.util.Scanner;

public class MultiplicationWithoutOperator {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter the value of num1");
		int num1=sc.nextInt();
		
		System.out.println("Please enter the value of num2");
		int num2=sc.nextInt();
		
		int sum=0;
		
		for (int i=1;i<=num2;i++)
		{
			sum=sum+num1;
		}
		
		System.out.println("the multiple is "+sum);

	}

}
