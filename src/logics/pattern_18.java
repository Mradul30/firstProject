package logics;

public class pattern_18 {

	public static void main(String[] args) 
	{
		int i,j,k;
		for ( i=5;i>=1;i--)                   //row
		{
			for (j=i;j<5;j++)                 //space
			{
			
				System.out.print(" ");
			}
			for ( k=1;k<=i;k++)               //column
			{
				if( k == 1 || k == i || i == 5)   //space
                    System.out.print("*");
                else
                    System.out.print(" ");
			}
			System.out.println();
			}

	}

}
