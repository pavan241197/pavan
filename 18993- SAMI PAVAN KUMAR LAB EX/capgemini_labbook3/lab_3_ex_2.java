package capgemini_labbook3;

import java.util.Arrays;
import java.util.Scanner;

public class lab_3_ex_2 {

	public static void main(String[] args) {
		int n;
		String str[];
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number of names you want to enter:");
		n = s.nextInt();
		s.nextLine();
		str = new String[n];
		for (int i = 0; i < n; i++) {
			str[i] = s.next();
		}
		stringObjects(str);
	}

	private static void stringObjects(String[] str) {
		int j;
		Arrays.sort(str);
		if (str.length % 2 != 0) {
			for (j = 0; j < str.length; j++) {
				if (j <= str.length / 2) {
					System.out.println(str[j].toUpperCase());
				} else {
					System.out.println(str[j].toLowerCase());
				}
			}
			}
		 else {
			for (j = 0; j < str.length; j++) {
				if (j < str.length / 2) {
					System.out.println(str[j].toUpperCase());
				} else
					System.out.println(str[j].toLowerCase());
			}
		}
	}
}



