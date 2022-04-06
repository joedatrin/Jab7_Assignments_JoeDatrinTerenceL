package Exercises_from_6_4_2022_to;

import java.util.Scanner;

interface Polygon{
	void getArea(int a, int b);
	
	void getPerimeter(int a, int b);
	
	
}
class rectangle implements Polygon{
	public void getArea(int a, int b)
	{
		int area = a *b;
		System.out.println("The area is :"+ area);
	}
	public void getPerimeter(int a, int b)
	{	
	
		int perimeter = 2*(a+b);
		System.out.println("the perimeter is 2*(l+b): "+perimeter);
	}
}
public class Area_perimeter_Interface {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length, breadth;
		Scanner sc = new Scanner(System.in);
		length = sc.nextInt();
		breadth = sc.nextInt();
		
		rectangle rec= new rectangle();
		rec.getArea(length,breadth);
		rec.getPerimeter(length,breadth);
		sc.close();
	}
}
