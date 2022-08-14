package logics;

public class pattern_2 {

	public static void main(String[] args)
	{
		int i,j,k;
		for ( i=0;i<6;i++)                   //row
		{
			for (j=i;j<6;j++)               //space
			{
			
				System.out.print(" ");
			}
			for ( k=0;k<=i;k++)              //column
			{
				System.out.print("*");
			}
			System.out.println();
			}
		
					
		

	}

}
