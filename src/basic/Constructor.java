package basic;

public class Constructor {
int a;
int b;
	
	public Constructor()
	{
		System.out.println("Hello welcome");
		a = 10;
		b = 50;
	}
	public static void main(String[] args) 
	{
		Constructor L= new Constructor();
		L.addition();
		
	}
     public void addition()
     {
    	// a=20;
    	// b=30;
    	int sum=a+b;
    	
    	
    	System.out.println("The sum is "+sum);
    	 
     }
}
