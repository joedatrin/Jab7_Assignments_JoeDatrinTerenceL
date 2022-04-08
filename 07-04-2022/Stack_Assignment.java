import java.util.Stack;

import java.util.Scanner;
public class Stack_Assignment {

public static void main(String[] args) {
		
		Stack<Integer> stk = new Stack<>();
		Scanner sc = new Scanner(System.in);
		int temp;
		for(int i=0; i<5; i++)
		{	
			System.out.println("Enter Integer values: ");
			temp = sc.nextInt();
			stk.add(temp);
		}
		System.out.println(stk);
		
		stk.set(4, 100);
		
		
		System.out.println(stk.get(4));
		
		stk.remove(3);
		
		System.out.println(stk.indexOf(3));
		System.out.println(stk);
		
		Stack<Integer> stk1 = new Stack<>();
		
		stk1.addAll(stk);
		System.out.println("new Stack"+stk1);
		
		System.out.println("Size is "+stk1.size());
		
		System.out.println("Last Occurence of 1 :"+stk1.lastIndexOf(1));
		
		stk1.toArray();
		System.out.println("new Stack-Array :"+stk1);
		
		System.out.println(stk.contains(2));
		stk.pop();
		System.out.println(stk);
		stk.push(65);
		System.out.println(stk);
		sc.close();
		
}
}
