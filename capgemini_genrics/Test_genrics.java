package capgemini_genrics;

import java.util.*;

public class Test_genrics {
	 class PreGenrics {
		private Object t;

		public Object get() {
			return t;
		}

		public void set(Object t) {
			this.t = t;
		}

		public void main(String args[]) {
			PreGenrics type = new PreGenrics();
			type.set("Pankaj");
			String str = (String) type.get();
			System.out.println(str);
			type.set(1);
			int num = (int) type.get();
			System.out.println(num);
		}
	}
}

