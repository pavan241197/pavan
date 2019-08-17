package capgemini_labbook14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ExecuteApplication {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter id");
		String sid=br.readLine();
		int id=Integer.parseInt(sid);
		System.out.println("enter name");
		String name=br.readLine();
		System.out.println("enter salary");
		String esal=br.readLine();
		double salary=Double.parseDouble(esal);
		EmployeeServiceInterface ei=new Service();
		Employee e=new Employee(id,name,salary,"");
		String des= ei.designation(e);
	            ei.insuranceScheme(e);
	System.out.println(e.toString());

	}

}

