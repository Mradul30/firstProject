package basic;

public class ArrayStudy {

	public static void main(String[] args)
	{
		
		int anynum[]= {1,2,3,4,5};
		
		System.out.println(anynum[2]);
		System.out.println("=================");
		
		for (int i=0;i<=anynum.length-1;i++)
		{
			System.out.println(anynum[i]);
			
			
		}
		System.out.println("===============");
		
		for (int i=0;i<=anynum.length-1;i++)
		{
		System.out.println(i);
		}
		
		System.out.println("===============");
		
		for (int i=anynum.length-1;i>=0;i--)
		{
			System.out.println(anynum[i]);
		}
		
		System.out.println("===============");
		
		char age[]= {'A','B','C'};
		
		System.out.println(age.length);
		System.out.println(age[2]);
		System.out.println("=================");
		for (int i=0;i<=age.length-1;i++)
		{
		System.out.println(i);
		}
		
		System.out.println("===============");
		
		for (int i=age.length-1;i>=0;i--)
		{
			System.out.println(age[i]);
		}
		
		System.out.println("===============");
		
		}
	}


