package Capgemini_io;

import java.io.Serializable;

@SuppressWarnings("serial")
class Student implements Serializable {
	private int rollNo;
	private String name;
	private float marks;
	public Student() {
		super();
	}
	public Student(int rollNo, String name, float marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public float getMarks() {
		return marks;
	}
	
	public void setMarks(float marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}
	
}
