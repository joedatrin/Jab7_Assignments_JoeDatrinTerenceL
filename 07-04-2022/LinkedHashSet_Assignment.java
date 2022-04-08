import java.util.LinkedHashSet;

public class LinkedHashSet_Assignment {
	
	public static void main(String[] args) {
        LinkedHashSet<Integer> primeNumbers=new LinkedHashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        LinkedHashSet<Integer> evenNumbers=new LinkedHashSet<>();
         evenNumbers.add(2);
         evenNumbers.add(4);
         
         LinkedHashSet<Integer> evenNumbers2=new LinkedHashSet<>();
         evenNumbers2.add(2);
         evenNumbers2.add(4);
//         union
         evenNumbers.addAll(primeNumbers);
         System.out.println("union is:"+evenNumbers);
         //Intersection
         evenNumbers2.retainAll(primeNumbers);
        System.out.println("Intersection is:"+evenNumbers2);
        
        LinkedHashSet<String> lhsStr =new LinkedHashSet<>();
        lhsStr.add("Hello");
        lhsStr.add("Hey");
        System.out.println(lhsStr);
        LinkedHashSet<String> lhsStr2 =new LinkedHashSet<>();
        lhsStr2.add("Bye");
        lhsStr2.add("TakeCare");
        System.out.println(lhsStr2);
        
        System.out.println(lhsStr2.hashCode());
        
        System.out.println(lhsStr2.parallelStream());

    }

}
