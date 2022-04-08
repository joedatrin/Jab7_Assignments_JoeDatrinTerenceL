package exercises_8_4_22;

import java.util.ArrayList;
import java.util.Scanner;

class Gen3<T>
{
	T data;
	Gen3(T data)
	{
		this.data = data;
	}
	public T getData()
	{
		return this.data;
	}
}
public class GenericClass_Assignment {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> arr = new ArrayList<>();
		int temp;
		for(int i=0; i<5; i++)
		{	
			System.out.println("Enter Integer values: ");
			temp = sc.nextInt();
			arr.add(temp);
		}
		
		Gen3<ArrayList<Integer>> arrObj = new Gen3<>(arr);
		System.out.println("Generic Class Returns" + " "+arrObj.getData());
		
		sc.close();
	}

}
