
import java.util.LinkedList;
//import java.util.List;
import java.util.Scanner;
public class LinkedList_Assignment {

	public static void main(String[] args) {
		
		LinkedList<Integer> linlst = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		int temp;
		for(int i=0; i<5; i++)
		{	
			System.out.println("Enter Integer values: ");
			temp = sc.nextInt();
			linlst.add(temp);
		}
		System.out.println(linlst);
		
		linlst.set(4, 100);
		
		
		System.out.println(linlst.get(4));
		
		linlst.remove(3);
		
		System.out.println(linlst.indexOf(3));
		System.out.println(linlst);
		
		LinkedList<Integer> linlst1 = new LinkedList<>();
		
		linlst1.addAll(linlst);
		System.out.println("new LinkedList"+linlst1);
		
		System.out.println("Size is "+linlst1.size());
		
		System.out.println("Last Occurence of 1 :"+linlst1.lastIndexOf(1));
		
		linlst1.toArray();
		System.out.println("new LinkedList-Array :"+linlst1);
		
		System.out.println(linlst.contains(2));
		linlst.pop();
		System.out.println(linlst);
		
		linlst.push(65);
		System.out.println(linlst);
		sc.close();
		
		// TODO Auto-generated method stub

	}

}
