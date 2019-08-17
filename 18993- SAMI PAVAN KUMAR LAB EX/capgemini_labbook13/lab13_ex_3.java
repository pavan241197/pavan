package capgemini_labbook13;
import java.util.Scanner;
import java.util.stream.Stream;
public class lab13_ex_3 {
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the User Name :");
			Stream<String> stream = Stream.of(sc.next());
			System.out.println("Enter the Password:");
			Stream<String> stream2 = Stream.of(sc.next());
			boolean resultPass = stream2.anyMatch((str2) -> {
				if (str2.equals("Vijay")) {
					return true;
				} else {
					return false;
				}
			});
			boolean result = stream.anyMatch((str1) -> {
				if (str1.equals("Pavan")) {
					return resultPass;
				} else {
					return false;
				}
			});
			if (result) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}
		}

	}

