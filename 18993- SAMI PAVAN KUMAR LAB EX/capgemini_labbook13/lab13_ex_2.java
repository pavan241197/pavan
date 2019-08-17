package capgemini_labbook13;

import java.util.function.Consumer;
public class lab13_ex_2 {
		public static void main(String[] args) {
			Consumer<String> consumer = (str) -> {
				for (int i = 0; i < str.length(); i++) {
					System.out.print(str.substring(i, i + 1) + " ");
				}
				;
			};
			consumer.accept("pavan");
		}

	}


