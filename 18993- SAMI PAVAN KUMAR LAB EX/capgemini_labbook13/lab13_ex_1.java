package capgemini_labbook13;
import java.util.function.BiConsumer;

public class lab13_ex_1 {
		public static void main(String[] args) {
			BiConsumer<Integer, Integer> power = (a, b) -> System.out.println((int) (Math.pow(a, b)));
			power.accept(5, 3);
		}
	}


