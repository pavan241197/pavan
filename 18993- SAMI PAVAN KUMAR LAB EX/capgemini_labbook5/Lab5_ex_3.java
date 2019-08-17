  package capgemini_labbook5;

import java.util.Scanner;

public class Lab5_ex_3 {
	public static void main(String[] args) {
		int n;
		System.out.println("enter number");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		prime(n);
	}
	private static void prime(int n) {
		for (int i=1; i<=n; i++) 
			{
				int count = 0;
				for (int j = 1; j <=i; j++) {
					if (i%j == 0) {
						count++;
				}
				}
				if (count == 2) {
					System.out.println(i+"");
				}
			}
		}

	}


