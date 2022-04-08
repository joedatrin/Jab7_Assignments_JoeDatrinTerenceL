import java.util.Vector;
import java.util.Scanner;
import java.util.Stack;

public class Vector_Assignment {
	
	public static void main(String[] args) {
	Vector<Integer> vec = new Vector<>();
	Scanner sc = new Scanner(System.in);
	int temp;
	
	for(int i=0; i<5; i++)
	{	
		System.out.println("Enter Integer values: ");
		temp = sc.nextInt();
		vec.add(temp);
	}
	System.out.println(vec);
	
	vec.set(4, 100);
	
	
	System.out.println(vec.get(4));
	
	vec.remove(3);
	
	System.out.println(vec.indexOf(3));
	System.out.println(vec);
	
	Stack<Integer> vec1 = new Stack<>();
	
	vec1.addAll(vec);
	System.out.println("new Vector"+vec1);
	
	System.out.println("Size is "+vec1.size());
	
	System.out.println("Last Occurence of 1 :"+vec1.lastIndexOf(1));
	
	vec1.toArray();
	System.out.println("new Vector-Array :"+vec1);
	
	
	sc.close();
	
}
}
