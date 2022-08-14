package basic;

public class study {

	public static void main(String[] args) {
//		char grade;
//		String name;
//		
//		grade='A';
//		name="Dell";
		
		System.out.println("Hello this is Main method");
		
	//	System.out.println(grade);
	//	System.out.println(name);
		
		computer();                   // static method same class
		Nonstatic.qwerty();           // static from another class
		study p=new study();          //non static method object create same class
		p.mouse();                    //non static method from same class
		Nonstatic q= new Nonstatic();  // non static method object create from another class
		q.market();                     // non static from another class
	}
    public static void computer()
    {
    	System.out.println("This is static regular method");
    }
    public void mouse()
    {
    	System.out.println("this is non static method");
    }
}
