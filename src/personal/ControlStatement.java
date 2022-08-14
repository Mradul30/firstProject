package personal;

public class ControlStatement {

	public static void main(String[] args)
	{
		
		// if Statement-----Single Condition
		
		char grade='A';
		
		if (grade=='A')
		{
			System.out.println("the grade is "+grade);
		}
		System.out.println("----------------------");
		
		//if else condition-----Double statement
		
		String password="Qwerty@12";
		
		if (password=="Qwerty")
		{
			System.out.println("password is correct");
		}
         
		else 
		{
			System.out.println("insert correct password");
		}
		
		System.out.println("----------------------");
		
		// else if statement----- Multiple Conditions
		
		String season="jhdsj";
		
		if (season=="Summer")
		{
			System.out.println("Its very Hot");
		}
		
		else if (season=="winter")
		{
			System.out.println("its cold outside");
		}
		
		else if (season=="Rainy")
		{
			System.out.println("Its raining heavily");
		}
		
		else
		{
			System.out.println("Invalid season");
		}
		
		System.out.println("----------------------");


		//nested if ------ multiple conditions --- if in if
		
		Boolean card=true;
		
		if (card==false)
		{
			System.out.println("Enter pin");
			
			int pin=1234;
			if (pin==1234)
			{
				System.out.println("Correct pin ");
			}
			else
			{
				System.out.println("Enter correct pin");
			}
			
		}
		else
		{
			System.out.println("please insert card");
		}
		
		System.out.println("----------------------");
	
		
		//Switch statement----multiple condition----key---directly jump 
		
		String day = "monday";
		switch(day)
		{
		case "sunday":System.out.println("Its the seventh day ");
		break;
		
		case "monday":System.out.println("Its the first day ");
		break;
		
		case "Tuseday":System.out.println("Its the second day ");
		break;
		
		case "wednesday":System.out.println("Its the third day ");
		break;
		
		case "thusday":System.out.println("Its the forth day ");
		break;
		
		case "friday":System.out.println("Its the fifth day ");
		break;
		
		case "saturday":System.out.println("Its the sixth day ");
		break;
		
		default:System.out.println("invalid day");
		break;
		}
	
	}
	
}
