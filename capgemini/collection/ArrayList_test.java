package capgemini.collection;

import java.util.Iterator;
import java.util.Vector;
import java.util.*;


public class ArrayList_test {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		//Vector<String> list = new Vector<String>();

		System.out.println("Size:" + list.size() + "\t" + list);

		list.add("Sun");
		list.add("Mon");
		list.add("Wed");
		System.out.println("Size:" + list.size() + "\t" + list);

		// added based on index...
		list.add(2, "Tue");
		System.out.println("Size:" + list.size() + "\t" + list);

		list.add("Thus");
		list.add("Free");
		list.add("Sat");
		list.add("Soon");
		System.out.println("Size:" + list.size() + "\t" + list);

		// searched a string...
		if (list.contains("Free"))
			list.set(list.indexOf("Free"), "Fri");
		if (list.contains("Soon"))
			list.remove("Soon");
		System.out.println("Size:" + list.size() + "\t" + list);

		// iterating....
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		// enhanced for loop....
		for (String value : list) {
			System.out.println(value);
		}

	}
}
