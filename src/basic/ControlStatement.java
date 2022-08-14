package basic;

public class ControlStatement 
{

	public static void main(String[] args)
	{
	{
			// if Statement
		//if my grade is A I got above 90% marks
		
		char grade='A';
		
		if (grade=='A')
		{
			System.out.println("I got 90% marks");
		}
		
	}
	{
			//if else statement
		//If my grade is A I got above 90% marks I got below 90%
		
		char grade='B';
		
		if (grade=='A')
		{
		System.out.println("I got 90% marks");
		}
		else
		{
			System.out.println("I got below 90%");
		}
	}System.out.println("========================");
	{
		// else if statement
		/*if its summer then it is very hot
		 * if its rainy then its raining heavily
		 * if its winter then it is very cold
		 * invalid season
		 */
		
		String season="rainy";
		
		if (season=="Summer")
		{
			System.out.println("It is very hot");
		}
		
		else if (season=="winter")
		{
			System.out.println("it is very cold");
		}
		else if (season=="rainy")
		{
			System.out.println("its raining heavily");
		}
		else
		{
			System.out.println("Invalid season");
		}
			
	}
	System.out.println("========================");
	{
		/*Switch case study statement
		 * if today is monday then it is first day of the week
		 * if today is tuesday then it is second day of the week
		 * if today is wednesday then it is third day of the week
		 * if today is thrusday then it is forth day of the week
		 * if today is friday then it is fifth day of the week
		 * if today is saturday then it is sixth day of the week
		 * if today is sunday then it is seventh day of the week
		 */
		
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
	}System.out.println("========================");
	//switch statement
	/*if my grade is A then my marks is above 90
	 * if my grade is B then my marks is 66<90
	 * if my grade is C then my marks is 33<66
	 * if my grade is D then my marks is 33<1
	 */
	
	char Grade='A';
	switch (Grade)
	{
	case 'A':System.out.println("My marks is above 90");
	break;
	
	case 'B':System.out.println("My marks is 66<90");
	break;
	
	case 'C':System.out.println("My marks is 33<66");
	break;
	
	case 'D':System.out.println("MY Marks is 1<33");
	break;
	
	default:System.out.println("invalid grade");
	break;
	
	}
	System.out.println("========================");
	{
		//nested if statement
		/*print welcome to high security app
		 * if correct user id then enter password
		 * if password is correct then login successful
		 * else incorrect password enter correct password
		 * else enter correct user name
		 */
		
		String userid="Qwerty";
		String password="qwerty@123";
		
		System.out.println("Welcome to high Security App");
		
		if(userid=="Qwerty")
	    {
			System.out.println("Correct User Id, Enter password");
			
		    if(password=="qwerty@1")
		  {
			System.out.println("Correct password login Successful");
		  }
		    else
		  {
			System.out.println("Please enter correct password");
		  }
	    }
		else
		{
		    System.out.println("Please enter correct UserId");
		}
	}
	System.out.println("========================");
	}
}
