package basic;

public class loops {

	public static void main(String[] args) {
		// for loop
		//printing table of 5 in forward direction
		
		System.out.println("==========");
		
		for(int i=5;i<=50;i=i+5)
		{
			System.out.println(i);
		}
		
		System.out.println("==========");
		
		//printing table of 5 in backward direction
		
		for(int i=50;i>=5;i=i-5)
		{
			System.out.println(i);
		}
		
		System.out.println("==========");
		
		//while loop
		//printing table of 5 in forward direction
		
		int i=5;
		while (i<=50) 
		{
          System.out.println(i);
			i=i+5;
		}
		
		System.out.println("==========");
		
		//printing table of 5 in backward direction
		
		int a=50;
		while (a>=5)
		{
			System.out.println(a);
			a=a-5;
		}
		
		System.out.println("==========");
		
		//do while loop
		//printing table of 5 in forward direction
		
		int b=5;
		do 
		{
			System.out.println(b);
			b=b+5;
		} 
		while (b<=50);
		
		System.out.println("==========");
		
		//printing table of 5 in backward direction
		
		int c=50;
		do
		{
			System.out.println(c);
			c=c-5;
		}
		while(c>=5);
		
	}

}
