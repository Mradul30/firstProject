package logics;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any No.");
		
		int num=sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("the given no. is Even");
		}
		else
		{
			System.out.println("the given no. is Odd");
		}

	}

	private static Object nextInt() {
		// TODO Auto-generated method stub
		return null;
	}

}
