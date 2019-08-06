package capgemini.oops;

// fields
class Student {
	int rollno;
	String name;
	float marks;
	final float OUT_OF_MARKS = 300;

	// constructors
	public Student() {
		rollno = 0;
		name = null;
		marks = 0.0f;
		System.out.println("default");
	}

	public Student(int i, String sname, float f) {
		this.rollno = i;
		this.name = sname;
		this.marks = f;
	}

	public void display() {
		System.out.println("rollno:" + rollno);
		System.out.println("name:" + name);
		System.out.println("marks:" + marks);
	}

	public String calgrade() {
		double percentage = calacPer();
		if (percentage > 85.0f && percentage <= 100.0f) {
			return "GradeA";
		} else if (percentage > 75.0f && percentage <= 85.0f) {
			return "GradeB";
		} else if (percentage > 650.f && percentage <= 65.0f) {
			return "GradeC";
		} else {
			return "fail";
		}
	}

	double calacPer() {
		double percentage = (marks / 300) * 100;
		return percentage;
	}

	@Override

	public String toString() {
		return "marks:" + marks + "name:" + name + "+rollno:" + rollno;
	}

	@Override
	public boolean equals(Object obj) {
		Student f = (Student) obj;
		if (this.OUT_OF_MARKS == f.marks) {
			return true;
		} else
			return false;
	}

}

public class Student_Test {
	public static void main(String[] args) {
		Student s1 = new Student(1, "pavan", 267.9f);
		Student s2 = new Student(2, "suresh", 256.0f);
		double percentage = s1.calacPer();
		System.out.println("percentage:" + percentage);
		double percentage1 = s2.calacPer();
		System.out.println("percentage:" + percentage1);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s1.equals(s2));
	}
}
