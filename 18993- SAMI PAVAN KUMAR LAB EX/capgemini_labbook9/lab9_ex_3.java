package capgemini_labbook9;
import java.util.*; 
public class lab9_ex_3 {
	   // Function to sort an square array 
	    public static void sortSquares(int arr[]) 
	    { 
	        int a = arr.length; 
	          
	        // First convert each array elements 
	        // into its square 
	        for (int i = 0 ; i < a ; i++) 
	            arr[i] = arr[i] * arr[i]; 
	   
	        // Sort an array using "inbuild sort function" 
	        // in Arrays class.... 
	        Arrays.sort(arr); 
	    } 
	      
	    // Driver program to test above function 
	    public static void main (String[] args) 
	    { 
	        int arr[] = { -5 , -3 , -1 , 2 , 4 , 6 }; 
	        int a = arr.length; 
	      
	        System.out.println("Before sort "); 
	        for (int i = 0; i < a; i++) 
	            System.out.print(arr[i] + " "); 
	          
	        sortSquares(arr); 
	        System.out.println("\nAfter Sort "); 
	        for (int i = 0 ; i < a ; i++) 
	            System.out.print(arr[i] + " "); 
	  
	    } 
	} 
