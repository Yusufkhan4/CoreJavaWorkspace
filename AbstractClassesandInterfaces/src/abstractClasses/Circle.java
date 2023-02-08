package abstractClasses;

public abstract class Circle {

	private double radius;
	public double diameter;
	public static final double pie;
	static {
		pie = 3.14;
	}
	
	public Circle() {
		
	}
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double area() {
		System.out.println("In super class method");
		return pie*radius*radius;
	}
	
//	any class having abstract method, that class must be abstract too
	
	abstract double perimeter();
	
	public abstract void calculateDiameter();
	
	@Override
	public String toString() {
		return "Circle [radius = " + radius + "]";
	}
	
}
