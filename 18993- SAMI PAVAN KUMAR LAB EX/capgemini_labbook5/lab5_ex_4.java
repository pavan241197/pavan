package capgemini_labbook5;

import java.util.Scanner;

public class lab5_ex_4 {
	public static void main(String[] args) {
		String firstname, lastname;
		System.out.println("Enter the firstname and lastname");
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		firstname = s.nextLine();
		lastname=s.nextLine();
		try
		{ 
			if(firstname.isEmpty()||(lastname.isEmpty())) throw new Exception("invalid");
		}
		catch (Exception e)
		 { System.err.println(e.getMessage());
		}
	
	
	
	}
}
