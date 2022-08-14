package logics;

public class pattern_19
{

	public static void main(String[] args) 
	{
		int i,j,k;
		for (i=1;i<6;i++)                       //row
		{
			for(j=5;j>i;j--)                   //space
			{
				System.out.print(" ");
			}
			for (k=1;k<=(2*i-1);k++)              //column
			{
				if( k == 1 || k == (2*i-1) || i == 5 )   //space
                    System.out.print("*");
                else
                  System.out.print(" ");         
			}
			System.out.println();
		}

	}

}
