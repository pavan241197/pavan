package capgemini.oops;
class Rectangle {
	// fields
	float length, breadth;

	// constructors...
	public Rectangle(float f, float g) {
		length = f;
		breadth = g;
		System.out.println("this is parameterised");
	}

	// constructor overloading
	public Rectangle() {
		System.out.println("this is default rectangle");
	}

	// methods
	public void draw() {
		System.out.println("method drawn");
	}

	public double calArea() {
		return length * breadth;
	}
	@Override
	public String toString(){
		return "Length:"+length+"\tBreadth:"+breadth;
		
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
	Rectangle otherRectangle=(Rectangle) obj;
	if(this.length==otherRectangle.length && this.breadth== otherRectangle.breadth)
		return true;
	else {
		return false;
	}
	
		
	}
	
} 
public class Rectangle_test {
	public static void main(String[] args) {
		Rectangle r1, r2;
		r1 = new Rectangle(3.5f, 2.6f);
		r2 = new Rectangle(3.5f, 2.6f);
		r1.draw();
		r2.draw();
		System.out.println(r1.calArea());
		System.out.println(r2.calArea());
		System.out.println(r1.toString());
		System.out.println(r2.toString());
	}

}
