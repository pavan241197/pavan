package capgemini_labbook5;
import java.util.Scanner;

public class lab5_ex_6salary {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int salary;
		System.out.println("Enter the amount");
		Scanner s = new Scanner(System.in);
		salary = s.nextInt();
		try
		{
			if(salary<=3000) throw new Exception();
			else
			{
				System.out.println("salary is greater than 3000");
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}	
	}

