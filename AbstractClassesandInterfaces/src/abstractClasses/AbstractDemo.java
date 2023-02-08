package abstractClasses;

public class AbstractDemo {

	public static void main(String[] args) {

//		Circle c = new Circle();
//		above object cannot be created because o partial implementation of abstract class
//		therefore, the class which defines the abstract method, that classes object should be made 
		SemiCircle sc = new SemiCircle();
		
		sc.setRadius(12); //call to superClass method
		sc.calculateDiameter(); //subclass
		
		double ar = sc.area(); //semicircle
		System.out.println(ar);
		
		double p = sc.perimeter(); //subclass
		
//		Using upcasting
//		we made reference variable of circle pointing to object of Semicircle
		Circle c = new SemiCircle();
		
		c.setRadius(12);
		c.calculateDiameter();
		double ars = c.area();
		double prs = c.perimeter();
		System.out.println(ars);
		System.out.println(prs);
		
		c = new FullCircle();
		
		c.setRadius(5); //Superclass
		c.calculateDiameter(); //superclass
		double arc = c.area();
		double prc = c.perimeter(); //superClass
		
		System.out.println(arc);
		System.out.println(prc);
	}

}
