package logics;

import java.util.Scanner;

public class ToTakeUserInput {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("please enter value of number1");
		int number1 = sc.nextInt();
		
		System.out.println("please enter value of number2");
		int number2 = sc.nextInt();
		
		int add = number1+number2;
		System.out.println("The addition of number1 & number2 is "+add);
		

	}

}
