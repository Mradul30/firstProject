package casting;

public class UpCasting {

	public static void main(String[] args) 
	{
		father f= new father();
		son s=new son();
		
		f.bike();
		f.car();
		System.out.println("===============");
		
		s.bike();
		s.car();
		s.degree();
		System.out.println("===============");
		
		father f1=new son();
		f1.bike();
		f1.car();
		

	}

}
