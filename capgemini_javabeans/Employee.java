package capgemini_javabeans;

public class Employee {
	private int empId;
	private String name;
	public static int SEQUENCE;
	public static int COUNT;
	static {
		SEQUENCE = 100;
		COUNT = 0;
		System.out.println("i am in static block");
	}
	public Employee() {
		empId = ++COUNT;
	}

	public Employee(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
		empId = ++COUNT;
	}

	public int getempId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getcount() {
		return COUNT;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [empId=");
		builder.append(empId);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	/*@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [empId=").append(empId).append(", name=").append(name).append("]");
		return builder.toString();
	}*/
	

	

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	public String toString_x() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		// declaration
		Employee e1, e2, e3;
		e1 = new Employee(1, "suresh");
		e2 = new Employee(2, "pavan");
		e3 = new Employee(3, "satish");
		// System.out.println(e1);
		// System.out.println(e2);
		// System.out.println(e3);
		// System.out.println(e1.getcount());
		// System.out.println(e2.getcount());
		// System.out.println(e3.getcount());
		System.out.println(e3.getempId() + "=" + e3.getName());
		System.out.println(e2.getempId() + "=" + e2.getName());
		System.out.println(e1.getempId() + "=" + e1.getName());
	}


	
}
