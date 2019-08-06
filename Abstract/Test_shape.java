package Abstract;

abstract class shape {
	public shape() {
		super(); // will call def constructor of obj class...
		System.out.println("shape is drawn");
	}

	public void draw() {
		System.out.println("shape is drawn");
	}

	public abstract double calcArea();

	@Override
	public String toString() {
		return "shape";
	}

}

class Circle extends shape {
	// fields
	float radius;

	// default constructor
	public Circle() {
		super();
		System.out.println("circle->def");
	}

	// parameterised constructors....
	public Circle(float radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void draw() {
		super.draw();
		System.out.println("circle is drawn");
	}

	@Override
	public String toString() {
		return super.toString() + "Radius =" + radius;
	}

	// equals..
	public boolean equals(Object obj) {
		Circle c = (Circle) obj;
		if (c.calcArea() == this.calcArea())
			return false;
		return true;
	}

	@Override
	public double calcArea() {
		return radius * radius * Math.PI;
	
	}
	public void circleshape(){
		System.out.println("iam a circle");
	}
}

	public class Test_shape {
		public static void main(String[] args) {
			// Shape shape;
			Circle c1 = new Circle(5.0f);
			Circle c2 = new Circle(4.0f);
			//Shape Shape = new Circle();
			//Shape.draw();
			//Shape.calcArea();
			//Shape.showCircle();
			System.out.println(c1.calcArea());
			System.out.println(c1.equals(c2));
		}
	}

