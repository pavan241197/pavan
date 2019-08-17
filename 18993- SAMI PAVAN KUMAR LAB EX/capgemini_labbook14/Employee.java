package capgemini_labbook14;

public class Employee {
	private int empid;
	private String ename;
	private double salary;
	private String designation;
	private String insuranceScheme;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empid, String ename, double salary, String designation) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
		this.designation = designation;

	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", salary=" + salary + ", designation=" + designation
				+ ", insuranceScheme=" + insuranceScheme + "]";
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getInsuranceScheme() {
		return insuranceScheme;
	}

	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
}
