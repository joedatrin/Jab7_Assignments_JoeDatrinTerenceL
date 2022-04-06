package Exercises_from_6_4_2022_to;
class rect{
	public rect()
	{
		
	}
	int length, breadth;
	public rect(int length, int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}

	public int area()
	{
		return length*breadth;
	}
	}

class Box extends rect {
public Box(){
		
	}
	

	public Box(int length, int breadth)
	
	{
		super(length,breadth);
	}
	public int perimeter()
	{
		int perimeter = 2*(length*breadth);
		return perimeter;
	}
}
public class this_super {
	public static void main(String[] args)
	{
		
		int perimeter, area;
		rect r = new rect(10,20);
		area = r.area();
		System.out.println("Area is "+ area);
		Box b = new Box(10,10);
		perimeter = b.perimeter();
		System.out.println("Perimeter is "+ perimeter);
		
	}
}
