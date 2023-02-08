package interfaces;

public class Square implements ShapeIntf{

	double side,area,perimeter;
	
	Square(double side){
		this.side = side;
	}
	
	public double area() {
		area = side*side;
		return area;
	}
	
	public double perimeter() {
		perimeter = 4*side;
		return perimeter;
	}
	
	
	
	

}
