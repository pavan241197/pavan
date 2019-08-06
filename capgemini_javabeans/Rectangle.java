package capgemini_javabeans;

public class Rectangle {
	// field...
	private float length, breadth;

	// default..
	public Rectangle() {
		// to call another constructor...
		this(5.3f, 4.f); // will call parameter constructor...
		System.out.println("Rectangle->def");

	}

	public Rectangle(float length, float breadth) {
		// this.length = length;
		setLength(length);
		// this.breadth+breadth;
		setBreadth(breadth);
		System.out.println("Rectangle->param");
	}

	private void showLength() {
		System.out.println("Length:" + length);
	}

	private void showBreadth() {
		System.out.println("Breadth:" + breadth);
	}

	// setter method
	public void setLength(float length) {
		if (length > 0)
			this.length = length;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}

	// getter method..
	public float getLength() {
		return length;
	}

	public float getBreadth() {
		return breadth;
	}

	public double calcArea() {
		return length * breadth;
	}

	// equals method
	@Override
	public boolean equals(Object obj) {
		if (this == obj) // r1.equals (r1)
			return true;
		if (obj == null) // r1.equals(null)
			return false;
		if (getClass() != obj.getClass()) // r1.equals("abc")
			return false;
		Rectangle other = (Rectangle) obj;
		if (Float.floatToIntBits(length) != Float.floatToIntBits(other.length))
			return false;
		return true;
	}

	public static void main(String[] args) {
		// declaration...
		Rectangle r1;
		// object instantation..
		r1 = new Rectangle();
		// accessing field of an object...
		r1.length = 5.5f;
		// accessing method of an object...
		r1.showLength();
		r1.showBreadth();
	}

}
