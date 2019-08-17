package capgemini_labbook9;
import java.util.*; 

public class lab9_ex_2 { 
	    static void characterCount(String inputString) 
	    { 
	        // Creating a HashMap containing char 
	        // as a key and occurrences as  a value 
	        HashMap<Character, Integer> charCountMap 
	            = new HashMap<Character, Integer>(); 
	  
	        // Converting given string to char array 
	  
	        char[] strArray = inputString.toCharArray(); 
	  
	        // checking each char of strArray 
	        for (char a : strArray) { 
	            if (charCountMap.containsKey(a)) { 
	  
	                // If char is present in charCountMap, 
	                // incrementing it's count by 1 
	                charCountMap.put(a, charCountMap.get(a) + 1); 
	            } 
	            else { 
	  
	                // If char is not present in charCountMap, 
	                // putting this char to charCountMap with 1 as it's value 
	                charCountMap.put(a, 1); 
	            } 
	        } 
	  
	        // Printing the charCountMap 
	        for (Map.Entry entry : charCountMap.entrySet()) { 
	            System.out.println(entry.getKey() + " " + entry.getValue()); 
	        } 
	    } 
	  
	    // Driver Code 
	    public static void main(String[] args) 
	    { 
	        String str = "pavankumar"; 
	        characterCount(str); 
	    } 
	} 


