package Exercises_from_6_4_2022_to;

abstract class Shapes{
	public abstract void render();
	
	public void Sleep()
	{
		System.out.println("Sleeping");
	}
}

class Triangle extends Shapes{
	public void render()
	{
		System.out.println("Render a Triangle");
	}
}

class Circle extends Shapes{
	public void render()
	{
		System.out.println("Render a Circle");
	}
}

public class Shape {
	public static void main(String[] args)
	{
		Triangle tri = new Triangle();
		tri.render();
		
		Circle cir = new Circle();
		cir.render();
		tri.Sleep();
	}

}
