package capgemini.oops;

class Circle {
	// field....
	float radius;

	// constructors....
	public Circle() {
		System.out.println("default constructor");
	}

	// constructor overloading...
	public Circle(float pradius) {
		radius = pradius;
		System.out.println("Circle-is parametrised");
	}

	// methods
	public void draw() {
		System.out.println("circle drawn");
	}

	public double calArea()
	{
		return radius*radius*Math.PI;
	}

	// method overloading from parent object class
	@Override // java motion
	public String toString() {
		return "Radius;" + radius;

	}

}

public class Circle_test {
	public static void main(String[] args) {
		Circle c1, c2;
		c1 = new Circle();
		c2 = new Circle(2.5f);
		c1.draw();
		c2.draw();
		System.out.println(c1.calArea());
		System.out.println(c2.calArea());
		System.out.println(c1.toString());
		System.out.println(c2.toString());

	}

}
