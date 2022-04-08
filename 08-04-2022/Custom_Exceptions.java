package exercises_8_4_22;

import java.util.Scanner;
class Handle extends Exception
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Handle(String str)
	{
		super(str);
	}
	
}
public class Custom_Exceptions{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		int voting_age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Voting age :");
		try
		{
			voting_age = sc.nextInt();
	
		
		if(voting_age < 18)
		{
			throw new Handle("Age Should not be less than 18");
			
		}
		else
		{
			System.out.println("Age-Eligibility Satisfied");
		}
	
		}
		catch(Handle e)
		{
			
			System.out.println(e.getMessage());
		}
		
		
		sc.close();
		
		
	}
	

}
