package capgemini_labbook3;
import java.util.*;  

public class lab_3_ex_1{ 
	public static int getSecondSmallest(int[] a ){  
	Arrays.sort(a);  
	return a[1];  
	}  
	public static void main(String args[]){  
	int a[]={1,2,544,622,354,234};  
	int b[]={5,7,43,768,45,3,22,79};  
	System.out.println("Second Smallest: "+getSecondSmallest(a));  
	System.out.println("Second Smallest: "+getSecondSmallest(b));  
	}}  