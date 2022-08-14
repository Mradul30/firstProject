package logics;

public class pattern_17 
{

	public static void main(String[] args) 
	{
		int i,j;
		for (i=0;i<=6;i++)                     //row
		{
			for(j=5;j>=i;j--)                  //column
			{
				if( i == 0 || j == i || j == 5)   //space
                    System.out.print("*");
                else
                    System.out.print(" ");
			}
			System.out.println();
		}
	}

}
