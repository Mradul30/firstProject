package logics;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{
        Scanner sc= new Scanner(System.in);
		
		System.out.println("Enetr Any no.");
		int num=sc.nextInt();
		
		int counter=0;
		
		for (int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				counter++;
				break;
			}
		}
		if(counter==1)
		{
			System.out.println("the no. is not a prime number");
		}
		else {
			System.out.println("the no. is prime number");
		}

	}

}
