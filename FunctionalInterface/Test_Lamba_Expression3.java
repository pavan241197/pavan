package FunctionalInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test_Lamba_Expression3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("mon");
		list.add("tue");
		list.add("wed");
		list.add("thu");
		System.out.println("natural order="+list);
		/*Comparator<String>  desComparator = new Comparator <String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		};*/
	Comparator<String>  desComparator = (String o1, String o2)-> 
	{
		return o2.compareTo(o1);
	};
	Comparator<String>  AscendComparator = (String o1, String o2)-> 
	{
		return o1.compareTo(o2);
	};
	Collections.sort(list,desComparator);
	System.out.println("Descending order:"+list);
	Collections.sort(list,AscendComparator);
	System.out.println("Ascending order:"+list);
	//for each in lambda

	printAsc(list,desComparator);
	printAsc(list, (String o1, String o2)-> {return(o1.compareTo(o2));});
		
	}
	
	
	
	
	
	
	
	// passing Consumer interface implementation as 

	private static void printAsc(List<String> list, Comparator<String> desComparator) {
		
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	


	