public class TestAbstract {
	public static void main(String[] args) {
		Shape s1 = new Circle(2,"c1");
		System.out.println(((Circle) s1).diameter());
		
		Shape s2 = new Square(3, "s1");
		System.out.println(s2.computeArea());
		 
		
	}
}

//-----------------------------------
abstract class Shape {
	String name;

	// abstract double perimeter(){};
	abstract double perimeter();
	abstract double computeArea();
	public String getName() {
		return this.name;
	}
	
	public String toString() {
		return this.getName() + "\n\tPerimeter = " + perimeter();
	}
}

abstract class PartialShape extends Shape{
	@Override
	double perimeter() {
		return 0;
	}
}

class Circle extends Shape {
	double radius;

	public Circle(double r, String n) {
		this.radius = r;
		this.name = n;
	}

	@Override
	double perimeter() {
		return 2 * Math.PI * this.radius;
	}
	@Override
	double computeArea() {
		return Math.PI *Math.pow(radius, 2);
	}
	double diameter() {
		return 2 * this.radius;
	}
}

class Square extends Shape {
	double height;

	public Square(double h, String n) {
		this.height = h;
		this.name = n;
	}

	@Override
	double computeArea() {
		return height*height;
	}
	
	@Override
	double perimeter() {
		return 4 * this.height;
	}
}
