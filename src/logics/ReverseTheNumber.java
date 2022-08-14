package logics;

public class ReverseTheNumber {

	public static void main(String[] args) 
	{
		int num=1234;
		
		String S=Integer.toString(num);
		String r="";
		
		for (int i=S.length()-1;i>=0;i--)
		{
			r=r+S.charAt(i);
		}
		
		int RevNumber=Integer.parseInt(r);
		
		System.out.println("The original no. is"+num);
		System.out.println("The reverse no. is "+RevNumber);
				

	}

}
