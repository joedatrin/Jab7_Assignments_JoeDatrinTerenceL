package exercises_8_4_22;

public class MutipleCatch_Blocks {
	public static void main(String[] args)
	{
		try {
			int array[] = new int[10];
			array[10] = 30/5;
		}
		catch(ArithmeticException e)
		{
			System.out.print(e.getMessage());
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.print(e.getMessage());
			
		}
	}


}
