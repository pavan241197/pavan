package capgemini_javabeans;

public class Rectangle_Test {
	public static void main (String[] args) {
		//declaration...
		Rectangle r2,r3;
		r2=new Rectangle(1.5f,3.6f);
		r3=new Rectangle(3.5f,2.7f);
		//r2.showlength..
		System.out.println("breadth="+r2.getBreadth()+"length="+r2.getLength());
		System.out.println("breadth="+r3.getBreadth()+"length="+r3.getLength());
		System.out.println(r2.calcArea());
		System.out.println(r3.calcArea());
		System.out.println(Math.round(r2.calcArea()));
		System.out.println(Math.ceil(r3.calcArea()));
	}

}
