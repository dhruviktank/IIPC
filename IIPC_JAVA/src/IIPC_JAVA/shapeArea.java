package IIPC_JAVA;

public class shapeArea{
	public static void main(String args[]) {
		Rectangle rectangle = new Rectangle(5,10);
		System.out.println("Area of rectangle : " + rectangle.getArea());
		Triangle triangle = new Triangle(10,8);
		System.out.println("Area of triangle : " + triangle.getArea());
		Circle circle = new Circle(7);
		System.out.println("Area of circle : " + circle.getArea());
	}
}

interface Shape {
	double getArea();
}

class Rectangle implements Shape{
	double length, breadth;
	Rectangle(double l, double b){
		this.length = l;
		this.breadth = b;
	}
	@Override
	public double getArea() {
		return length*breadth;
	}
}
class Triangle implements Shape{
	double base, height;
	Triangle(double b, double h){
		this.base = b;
		this.height = h;
	}
	@Override
	public double getArea() {
		return (base*height)/2;
	}
}
class Circle implements Shape{
	double radius;
	Circle(double r){
		this.radius = r;
	}
	@Override
	public double getArea() {
		return (Math.PI*radius*radius);
	}
}