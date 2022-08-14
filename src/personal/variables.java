package personal;

public class variables 
{
      int a= 10;
      int b= 20;
      
      static int x=8;
      static int y=2;
      
      public static void main(String[] args)
      {
		sun();                           //calling static method
		variables h=new variables();     //creating object
		h.planet();                      //calling non static method
		System.out.println(y);           //calling static variable
		System.out.println(h.b);         //calling non static variable
		
		
	  }
      
      public void planet()
      {
    	  int sum=a+b;
    	  System.out.println(sum);
    	  int multi=x*y;
    	  System.out.println(multi);
      }
      
      public static void sun()
      {
    	  int sub=x-y;
    	  System.out.println(sub);
    	  //int diff=b-a;
      }
}
