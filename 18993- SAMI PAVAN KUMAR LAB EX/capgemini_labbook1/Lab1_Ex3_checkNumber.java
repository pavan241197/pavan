package capgemini_labbook1;

import java.util.*;

public class Lab1_Ex3_checkNumber {

	private static Scanner sc;

	public static void main(String args[]) {
		int n;
		sc = new Scanner(System.in);
		n = sc.nextInt();
		boolean b = checkNumber(n);
		if (b)
			System.out.println("increasing");
		else
			System.out.println("not increasing");
	}

	private static boolean checkNumber (int n) {
		int f=0;
		List <Integer> a = new ArrayList<Integer>();
		while (n>0) {
			int t = n%10;
			a.add(t);
			n/= 10;
		}
		 for( int i=0; i<a.size() - 1; i++) {   
			 if (a.get(i) >= a.get(i+1)) {
				 f=1;
			 }
			 else {
				 f=0;
				 break;
			 }
			 }
		 if(f==0)
		return false;
		 else
			 return true;
	}
}
