package capgemini.collection;

import java.util.ArrayList;

public class Enhance {
	static void printArray(int intArr[]) {
		for (int arrayindex : intArr)
			System.out.println(arrayindex);
	}

	static void printCollection(ArrayList<Integer> arrList) {
		for (Object object : arrList)
			System.out.println(object);
	}

	public static void main(String[] args) {
		int intarr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		printArray(intarr);
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		arraylist.add(10);
		arraylist.add(30);
		arraylist.add(20);
		printCollection(arraylist);
	}

}
