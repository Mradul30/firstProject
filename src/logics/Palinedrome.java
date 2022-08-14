package logics;

import java.util.Scanner;

public class Palinedrome {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter any word");
		String A=sc.next();
		
		String B="";
		
		for(int i=A.length()-1;i>=0;i--)
		{
			B=B+A.charAt(i);
		}
		
		System.out.println("the reverse of the word is "+B);
		
		if (A.equalsIgnoreCase(B))
		{
			System.out.println("The word is Pelendrome");
		}
		
		else
		{
			System.out.println("the word is not Pelendrome");
		}

	}

}
