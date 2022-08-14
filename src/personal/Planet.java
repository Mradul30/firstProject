package personal;

public class Planet
{
	int q=5;
	int w=4;
	
	static int r=4;
	static int y=3;
	

	public static void main(String[] args) 
	{
//		int a=10;
//		int b=20;
//		int sum = a+b;
//		 System.out.println(sum);
		 
		 market();     // static method call from same class     methodname();
		 anotherclass.bus(); //static from another class classname.methodname();
		 
		 Planet T=new Planet();  //created object classname objectname=new classname();
		 T.sun();  // non static method call from same class
		 
		 anotherclass R=new anotherclass(); // created object for another          
		 R.cricket();     //objectname.methodname();

	}
	
	public static void market()
	{
		int sub=r-y;
		//int sum=q+w;
		int t=2;
		System.out.println("sub of 2 no is "+sub);
	}
	
	public void sun()
	{
		int sum=r+y;
		int add=q+w;
		System.out.println("sum of two no. is "+sum);
		System.out.println("hello welcome to my world");
	}

}
