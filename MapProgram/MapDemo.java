package myPack;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Creating an empty HashMap 
        Map<String, Integer> hm 
            = new HashMap<String, Integer>(); 
  
        // Inserting pairs in above Map 
        // using put() method 
        hm.put("a", 100); 
        hm.put("b", 200); 
        hm.put("c", 300); 
        hm.put("d", 400); 
  
        // Traversing through Map using for-each loop 
        for (Map.Entry<String, Integer> me : 
             hm.entrySet()) { 
  
            // Printing keys 
            System.out.print(me.getKey() + ":"); 
            System.out.println(me.getValue()); 
        } 
        
        System.out.println(hm);
        
        System.out.println(hm.containsKey("a"));
        System.out.println(hm.containsValue(100));
        
        System.out.println(hm.get("c"));
        
	}

}
