import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Assignment {
	public static void main(String[] args)
	{
		ArrayList<Integer> arrlst = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int temp;
		for(int i=0; i<5; i++)
		{	
			System.out.println("Enter Integer values: ");
			temp = sc.nextInt();
			arrlst.add(temp);
		}
		System.out.println(arrlst);
		
		System.out.println(arrlst.get(4));
		
		arrlst.remove(3);
		
		System.out.println(arrlst.indexOf(3));
		System.out.println(arrlst);
		
		ArrayList<Integer> arrlst1 = new ArrayList<>();
		
		arrlst1.addAll(arrlst);
		System.out.println("new Arraylist"+arrlst1);
		
		System.out.println("Size is "+arrlst1.size());
		
		System.out.println("Last Occurence of 1 :"+arrlst1.lastIndexOf(1));
		sc.close();
	}

}