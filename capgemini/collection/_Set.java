package capgemini.collection;
import java.util.*;

public class _Set {
		public static void main(String[] args) {
			HashSet<String> hashset = new HashSet<String>();
			System.out.println("size:"+hashset.size()+"\t"+hashset);
			hashset.add("Jan");
			hashset.add("Jan");		// no duplicates allowed....
			hashset.add("null");
			hashset.add("null");	// onlyone null is allowed....
			hashset.add("Feb");
			hashset.add("Mar");		// insertion order not maintained......
			System.out.println("size:"+hashset.size()+"\t"+hashset);
			hashset.remove("Mar");
			System.out.println("size:"+hashset.size()+"\t"+hashset);
			Iterator<String> iterator =hashset.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			}
			for(String val:hashset)
			{
				System.out.println(val);
			}
			
		}
}
