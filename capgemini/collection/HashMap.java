package capgemini.collection;

import java.util.*;
import java.util.Iterator;;

public class HashMap {
	public static void main(String[] args) {
		java.util.HashMap<Integer,String> hashmap = new java.util.HashMap<Integer, String>();
		System.out.println("size:"+hashmap.size()+"\t"+hashmap);
		hashmap.put(null,null);
		hashmap.put(null,null);
		hashmap.put(0,null);
		hashmap.put(1,"Jan");
		hashmap.put(2,"Feb");
		hashmap.put(3,"Mar");
		hashmap.put(4,"Apr");
		System.out.println("size:"+hashmap.size()+"\t"+hashmap);
		
		Iterator<String>itrValues= hashmap.values().iterator();
		System.out.println("Printing values");
		Iterator<Integer>itrkeys2 = hashmap.keySet().iterator();
		while(itrValues.hasNext()) {
			Integer key= itrkeys2.next();
			System.out.println(key +":"+hashmap.get(key));
		}
 		
	}

}
