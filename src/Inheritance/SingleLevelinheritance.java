package Inheritance;

public class SingleLevelinheritance 
{

	public static void main(String[] args) 
	{
		
		mother Q=new mother(); // classname objectname=new classname();
		son S=new son();
		
		Q.nature(); //objectname.class()
		S.mobile();
		S.nature();
		mother.look();
		son.look();
		son.laptop();

	}

}
