package exercises_8_4_22;
import java.util.ArrayList;
import java.util.Scanner;
class Gen2{
	public <T> void genericMethod(T data)
	{
		System.out.println("Data Passed " + " "+data);
	}
}
public class GenericMethod_Assignment {

	public static void main(String[] args)
	{	Scanner sc = new Scanner(System.in);
		Gen2 genM2 = new Gen2();
		ArrayList<Integer> arr = new ArrayList<>();
		int temp;
		for(int i=0; i<5; i++)
		{	
			System.out.println("Enter Integer values: ");
			temp = sc.nextInt();
			arr.add(temp);
		}
		genM2.<ArrayList<Integer>>genericMethod(arr);
		sc.close();
	}
}
