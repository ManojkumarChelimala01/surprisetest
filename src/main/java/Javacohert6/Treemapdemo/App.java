package Javacohert6.Treemapdemo;

import java.util.*;
import java.util.TreeMap;
public class App 
{
	

	public static void main(String[] args) {
        
        Map<String,Integer> sub = new TreeMap<String,Integer>();

        // Add technology-project mappings
        sub.put("maths", 99);
        sub.put("english", 78);
        sub.put("science",67);

       
        System.out.println("student marks:");
        for (Map.Entry<String,Integer> entry : sub.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

	


