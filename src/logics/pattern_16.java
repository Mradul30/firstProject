package logics;

public class pattern_16 {

	public static void main(String[] args) 
	{
		int i,j,k;
		for ( i=1;i<=5;i++)                           //row
		{
			for (j=i;j<=4;j++)                        //space
			{
			
				System.out.print(" ");
			}
			for ( k=1;k<=i;k++)                       //column
			{
				 if( k == 1 || k == i || i == 5)
	                    System.out.print("*");
	                else
	                    System.out.print(" ");
			}
			System.out.println();
			}
		 
	}

}
