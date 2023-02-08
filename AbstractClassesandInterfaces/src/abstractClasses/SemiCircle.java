package abstractClasses;

public class SemiCircle extends Circle{
	
	@Override
	public double area() {
		System.out.println("In subclass method");
		return 0.5*pie*getRadius()*getRadius();
	}

	@Override
	public double perimeter() {
		return pie*getRadius()+2*getRadius();
	}
	
	@Override
	public void calculateDiameter() {
		diameter = 2*getRadius();
	}
	
	public void ownMethod() {
		System.out.println("This is own property of semicircle");
	}
}
