package exercise8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class map_exercise {
	 // Main driver method
    public static void main(String args[])
    {
    	Scanner s = new Scanner(System.in);
        // Creating an empty HashMap
        Map<String, Integer> hm
            = new HashMap<String, Integer>();
         
        // Inserting pairs in above Map
        // using put() method
        
        ArrayList<String> name = new ArrayList<>();
        name.add("Rahane");
        name.add("Rahul");
        name.add("Kohli");
        name.add("Dhoni");
        name.add("Lokesh");
        
       int score;
        
        for(int i=0;i<=4;i++)
        {
        System.out.print(name.get(i)+" - ");
        
        score = s.nextInt();
        hm.put(name.get(i),score );
        }
        
       System.out.println("Players Who Batted:");
       for (Map.Entry<String, Integer> me :
           hm.entrySet()) {

          // Printing keys
          System.out.println(me.getKey());
       }
       
       
      //Scores by Players
       System.out.println("Scores by Players :");
 
        // Traversing through Map using for-each loop
        for (Map.Entry<String, Integer> me :
             hm.entrySet()) {
 
            // Printing keys
            System.out.print(me.getKey() + ":");
           System.out.println(me.getValue());
           
           
        }
        
        // Sum of the values
       int sum = 0;
       for(int value: hm.values())
       {
    	   sum += value;
       }
       System.out.println("Total Score : "+sum);
    
      // Maximum of Values 
       int max = Collections.max(hm.values());
       for (Map.Entry<String, Integer> me1 :
           hm.entrySet()) {

       if(me1.getValue()==max)
       
       System.out.println("Name of the Highest Scorer: " + me1.getKey());
       
     //Runs Scored by Dhoni
       if(me1.getKey()=="Dhoni")
       {
    	   System.out.println("Runs Scored by Dhoni : "+me1.getValue());
       }
       }
       
       
       
       
       s.close();
       
       
    
}

}
