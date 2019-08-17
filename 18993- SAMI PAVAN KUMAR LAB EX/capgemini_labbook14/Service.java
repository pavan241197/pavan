package capgemini_labbook14;
public class Service implements EmployeeServiceInterface {
	@Override
	public Employee insuranceScheme(Employee e) {
		 String insuranceScheme="";
		if ((5000<e.getSalary()&&e.getSalary()<20000)&&e.getDesignation().equalsIgnoreCase("System Associate")) 
			insuranceScheme="Scheme C";
		else if ((20000<=e.getSalary()&&e.getSalary()<40000)&&e.getDesignation().equalsIgnoreCase("Programmer")) 
			insuranceScheme="Scheme B";
		 else if (40000<=e.getSalary()&&e.getDesignation().equalsIgnoreCase("Manager")) 
			insuranceScheme="Scheme A";
		 else if (e.getSalary()<5000&&e.getDesignation().equalsIgnoreCase("Clerk")) 
				insuranceScheme="No Scheme";
		e.setInsuranceScheme(insuranceScheme);
		System.out.println(e.getInsuranceScheme());
		return e;
	}

	@Override
	public String designation(Employee e) {
		if(5000<e.getSalary()&&e.getSalary()<20000)
			e.setDesignation("System Associate");
		else if(20000<=e.getSalary()&&e.getSalary()<40000)
			e.setDesignation("Programmer");
		else if(40000<=e.getSalary())
			e.setDesignation("Manager");
		else if(e.getSalary()<5000)
			e.setDesignation("Clerk");
		return e.getDesignation();
	}
}
