import java.util.TreeSet;

public class TreeSet_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> even = new TreeSet<>();
		even.add(2);
		even.add(6);
		even.add(4);
		System.out.println(even);
		
		TreeSet<String> evenStr = new TreeSet<>();
		evenStr.add("Cat");
		evenStr.add("Apple");
		evenStr.add("Java");
		System.out.println(evenStr);
		
		TreeSet<Double> evendbl = new TreeSet<>();
		evendbl.add(4.0);
		evendbl.add(2.0);
		evendbl.add(6.0);
		System.out.println(evendbl);
		
		TreeSet<Integer> even1 = new TreeSet<>();
		even1.addAll(even);
		System.out.println(even1);
		
		System.out.println(even1.ceiling(5));
		
		System.out.println(even1.first());
		
		
	}

}
