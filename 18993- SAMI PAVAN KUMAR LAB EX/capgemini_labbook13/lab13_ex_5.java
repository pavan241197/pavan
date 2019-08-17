package capgemini_labbook13;

import java.util.function.Consumer;

public class lab13_ex_5 {

		public static void fact(int a){
			int fac = 1;
			for (int i = 1; i <= a; i++) {
				fac = fac * i;
			}
			System.out.println(fac);
		}
		public static void main(String[] args) {
			Consumer<Integer> a = lab13_ex_5::fact;
			a.accept(6);
		
		}
	}

