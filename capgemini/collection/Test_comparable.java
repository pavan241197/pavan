package capgemini.collection;

import java.util.*;

class Employee implements Comparable<Employee> {
	private int empId;
	private String name;

	public Employee(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}

	public int compareTo(Employee e) {
		if (this.empId == ((Employee) e).empId) {
			return 0;
		} else if (this.empId > (((Employee) e).empId)) {
			return -1;
		} else {
			return 1;
		}
	}
}

class Namecomparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		if (e1.getName().equals(e2.getName())) {
			return 0;
		} else {
			return 1;
		}
	}
}

public class Test_comparable {
	public static void main(String[] args) {
		Employee e1, e2, e3;
		e1 = new Employee(101, "Pavan");
		e2 = new Employee(102, "Suresh");
		e3 = new Employee(103, "Varun");
		Employee es[] = { e1, e3, e2 };
		Arrays.sort(es);
		System.out.println("Array sorted via Arrays.sort:" + Arrays.toString(es));
		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		Collection.sort(list.new Namecomparator());
		System.out.println("size");
	}
}
