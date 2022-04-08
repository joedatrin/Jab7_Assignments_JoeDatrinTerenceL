import java.util.EnumSet;

public class EnumSet_Assignment {
	
	enum Size
	{
		SEVEN, six, Eight​​​​​​​​
	}
    public static void main(String[] args)
    {
    	 EnumSet<Size> sizes=EnumSet.allOf(Size.class);
    	 System.out.println(sizes);
         EnumSet<Size> sizes2=EnumSet.noneOf(Size.class);
         sizes2.add(Size.six);
         System.out.println(sizes2);
         
         //sizes3.copyOf(Size.class);
           }
}
