package interfaces;

public class SemiCircle implements ShapeIntf {

	
	double radius;
	double perimeter;
	double area;
	
	SemiCircle(double radius){
		this.radius = radius;
	}
	public double area() {
		area = (pie*radius*radius)/2;
		return area;
	}
	
	public double perimeter() {
		perimeter =  pie*radius + 2*radius;
		return perimeter;
	}
	
	public double getdiameter() {
		return radius*2;
	}
	
	public double getRadius() {
		return radius;
		
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
		
	}
	
	@Override
	public String toString() {
		return "I am semicircle and my area is "+ area+ " and perimeter is " + perimeter + " with radius = "+ radius;
	}
	
}
