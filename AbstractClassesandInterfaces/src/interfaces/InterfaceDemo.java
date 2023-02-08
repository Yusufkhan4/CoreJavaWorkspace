package interfaces;

public class InterfaceDemo {

	public static void main(String args[]) {
		double areac,semic,sqaurc;
		
		MyCircle circle = new MyCircle(2);
		
		System.out.println("Using Object");
		areac = circle.area();
		
		SemiCircle semicircle = new SemiCircle(2);
		semic = semicircle.area();
		
		Square square = new Square(2);
		double squarc = square.area();
		
		System.out.println("area of circle "+areac + " area of semicricle "+ semic + "area of square "+squarc);
//		interface object never gets created, we can create reference variable
		
		ShapeIntf shape;
		System.out.println("Using Object");
		shape = new MyCircle(3);
		double ac = shape.area();
		double pc = shape.perimeter();
		System.out.println("Area of circle is : " + ac);
	}
}
