package online;

//import personal.vision;

public class variable_study
{
   
	int a= 10;   //non static global variable
	int b= 20;
	 
	
	static int x=50; //static global variable
	static int y=90;

	public static void main(String[] args)
	{
		rest();
		System.out.println(x);
		System.out.println(y);	
		
		variable_study T=new variable_study();
		T.work();
		
		System.out.println(T.a);
		System.out.println(T.b);
		
		
//         vision yt=new vision();
//        // System.out.println("value of D "+yt.D);
//	System.out.println(vision.);
		
	}
    
	public static void rest()
	{
		int sum=x+y;
		//int add=a+b;
		System.out.println(sum);
	}
	
	public void work()
	{
		int sum =a+b;
		System.out.println(sum);
		
		int add=x+y;
		System.out.println(add);
	}
}
