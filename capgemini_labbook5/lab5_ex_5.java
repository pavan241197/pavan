package capgemini_labbook5;

import java.util.Scanner;

public class lab5_ex_5 {
	public static void main(String[] args) {
		int age;
		System.out.println("Enter the age");
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		age = s.nextInt();
		if(age<=15){
			System.out.println("age is below 15");
		}else
		{
			System.out.println("age is above 15");
		}
	}
}
