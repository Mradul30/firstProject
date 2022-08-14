package logics;

public class pattern_10 {

	public static void main(String[] args) 
	{
		int i,j,k;
		for ( i=0;i<=4;i++)                   //row
		{
			for (j=i;j<4;j++)                 //space
			{
			
				System.out.print(" ");
			}
			for ( k=4;k>=0;k--)               //column
			{
				System.out.print("*");
			}
			System.out.println();
			}
	}

}
