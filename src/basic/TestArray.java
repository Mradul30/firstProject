package basic;

public class TestArray {

	public static void main(String[] args)
	{
		
		
		int test[][]=new int[2][2];
		test [0][0]=12;
		test [0][1]=18;
		test [1][0]=24;
		test [1][1]=36;
		
		int test1[][]=new int [2][2];
		test1 [0][0]=102;
		test1 [0][1]=108;
		test1 [1][0]=204;
		test1 [1][1]=360;
		
		for (int i=0;i<=1;i++) 
		{
			for (int j=0;j<=1;j++)
			{
				System.out.print(test[i][j]+" ");
			}
			System.out.print("   ");
			
			for (int y=0;y<=1;y++)
			{
				System.out.print(test1[i][y]+" ");
			}
			System.out.println();
			}
		
		

	}

}
