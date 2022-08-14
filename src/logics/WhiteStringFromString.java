package logics;

public class WhiteStringFromString {

	public static void main(String[] args)
	{
		String S="this program is to calculate the white space present in the string";
		int Counter =0;
		
		for(int i=0;i<=S.length()-1;i++)
		{
			char blank = S.charAt(i);
			if(blank==' ')
			{
				Counter++;
			}
		}
			System.out.println("The white space present in the String is "+Counter);
			

	}

}
