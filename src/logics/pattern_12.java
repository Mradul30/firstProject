package logics;

public class pattern_12 {

	public static void main(String[] args) 
	{
		int i,j;
		for (i=0;i<=5;i++)                  //row
		{
			for(j=5;j>=i;j--)               //column
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for (i=1;i<=5;i++)                   //row
		{
			for (j=0;j<=i;j++)              //column
			
				System.out.print("*");	
			
			System.out.println();
		}

	}

}
