package logics;

public class pattern_21 {

	public static void main(String[] args) 
	{
		int i,j;
		for (i=1;i<6;i++)                        //row
		{
			for(j=5;j>i;j--)                    //space
			{
				System.out.print(" ");
			}
			for (j=0;j<(2*i-1);j++)              //column
			{
				if(j==0||j==(2*i-1)||i==j)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		int a,b,c;
		for (a=4;a>0;a--)                         //row
		{
			for(b=4;b>=a;b--)                     //space
			{
				System.out.print(" ");
			}
			for (c=0;c<(2*a-1);c++)               //column
			{
				if(c==0||c==(2*a-1)||a==(2*c-1))
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	

	}

}
