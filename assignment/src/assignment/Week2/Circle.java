package assignment.Week2;

public class Circle extends Shape {//inheriting Shape class
	protected Point center;
	protected double radius;
	
	public Circle(double x, double y ,double radius) { //constructor
		super("Circle");
		this.center = new Point(x,y);
		this.radius = radius;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() { // implement the getArea method of Shape class for calculating area of circle
		// TODO Auto-generated method stub
		double area = radius*radius* Math.PI;
		return area;
	}
//getter & setter
	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
//toString
	public String toString(){
		return "Center = "+center.toString()+"; Radius = "+radius+" ";
	}
}
