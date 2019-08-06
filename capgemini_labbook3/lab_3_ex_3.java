package capgemini_labbook3;
import java.util.*;
public class lab_3_ex_3 {
	    static void reverse(Integer a[]) 
	    { 
	        Collections.reverse(Arrays.asList(a)); 
	        System.out.println(Arrays.asList(a)); 
	    } 
	  
	    public static void main(String[] args) 
	    { 
	        Integer [] arr = {78, 27, 39, 45, 60}; 
	        reverse(arr); 
	    } 
	} 
