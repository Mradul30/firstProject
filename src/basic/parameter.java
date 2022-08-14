package basic;

public class parameter {

	public static void main(String[] args) {
		parameter SI = new parameter();
        SI.studentinfo();
        SI.studentinfo(50,"Mradul", 26, 'M', 60.24f, 170, 78952222);
        SI.studentinfo(50, "mradul", 45, 'm', 54.36f, 415, 13650);
	}
public void studentinfo ()    // without parameter
{
	String name="Mradul";
	int age=26;
	char gender='M';
    float weight=60.2f;
    float height=170f;
    int rollno=123546;
    int physics=50;
    
    System.out.println("--------------------------");
    System.out.println("Marks in physics is "+physics);
System.out.println("My name is "+name);
System.out.println("My age is "+age);
System.out.println("My gender is "+gender);
System.out.println("My weight "+weight+" kg");
System.out.println("My height is "+height+" cm");
System.out.println("My rollno is "+rollno);
System.out.println("--------------------------");
}


    public void studentinfo(int physics,String name, int age, char gender,float weight,float height, int rollno)
    {
    	System.out.println("--------------------------");
    	System.out.println("Marks in physics is "+physics);
    	System.out.println("My name is "+name);
    	System.out.println("My age is "+age);
    	System.out.println("My gender is "+gender);
    	System.out.println("My weight "+weight+" kg");
    	System.out.println("My height is "+height+" cm");
    	System.out.println("My rollno is "+rollno);	
    	
    }

}
