package capgemini_genrics;

import java.util.*;

abstract class Shape {
	abstract void draw();		
}
class Circle extends Shape {
	void draw() {
		System.out.println("circle is drawn");
	}
}
class Rectangle extends Shape {
	void draw() {
		System.out.println("rectangle is drawn");
	}
	
}

public class Test_Genrics3 {
 public static void drawshapes(List<?extends Shape>lists) {
	 for(Shape shape:lists) {
		 shape.draw();
	 }
 }
 public static void main(String[] args) {
	List<Rectangle> listRectangle =new ArrayList<Rectangle>();
	listRectangle.add(new Rectangle());
	
	List<Circle> listCircle =new ArrayList<Circle>();
	listCircle.add(new Circle());
	drawshapes(listCircle);
	drawshapes(listRectangle);
}

	
}

