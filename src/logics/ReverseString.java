package logics;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args)
	{
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Enter any word to reverse it");
			String S=sc.next();
			
			String r="";
			for(int i=S.length()-1;i>=0;i--)
			{
				r=r+S.charAt(i);
			}
			System.out.println("The reverse word is "+r);
		}
		
		
		

	}

	private static String println(String r) {
		// TODO Auto-generated method stub
		return null;
	}

}
