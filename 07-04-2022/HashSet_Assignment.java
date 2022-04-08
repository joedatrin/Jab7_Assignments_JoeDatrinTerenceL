import java.util.HashSet;
public class HashSet_Assignment {
	public static void main(String[] args) {
        HashSet<Integer> primeNumbers=new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        HashSet<Integer> evenNumbers=new HashSet<>();
         evenNumbers.add(2);
         evenNumbers.add(4);
         
         HashSet<Integer> evenNumbers2=new HashSet<>();
         evenNumbers2.add(2);
         evenNumbers2.add(4);
//       Union
         evenNumbers.addAll(primeNumbers);
         System.out.println("union is:"+evenNumbers);
         //Intersection
         evenNumbers2.retainAll(primeNumbers);
        System.out.println("Intersection is:"+evenNumbers2);
        
        
        HashSet<String> hsStr=new HashSet<>();
        hsStr.add("Happy");
        hsStr.add("Hesitant");
        hsStr.add("Horrible");
        System.out.println("1"+hsStr);
        
        HashSet<String> hsStr1=new HashSet<>();
        hsStr.add("Happy1");
        hsStr.add("Hesitant");
        hsStr.add("Horrible1");
        System.out.println("1"+hsStr1);
        
        hsStr1.addAll(hsStr);
        System.out.println("2"+hsStr1);
        
        HashSet<String> hsStr2=new HashSet<>();
        hsStr2.add("Happy1");
        hsStr2.add("Hesitant");
        hsStr2.add("Horrible1");
        System.out.println("3"+hsStr2);
        hsStr2.retainAll(hsStr);
        System.out.println("4"+hsStr2);
    }
}
