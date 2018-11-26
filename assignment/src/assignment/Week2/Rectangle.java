/**
 * 
 */
package assignment.Week2;

/**
 * @author ko
 *
 */
public class Rectangle extends Shape{//inheriting Shape class
	
	protected Point topLeft;
	protected double length;
	protected double width;

	public Rectangle(double x, double y,double length,double width) { //constructor
		super("Rectangle");
		this.topLeft = new Point(x, y);
		this.length = length;
		this.width = width;
		// TODO Auto-generated constructor stub
	}
//getter & setter
	public Point getTopLeft() {
		return topLeft;
	}

	public void setTopLeft(Point topLeft) {
		this.topLeft = topLeft;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double getArea() { // implement the getArea method of Shape class for calculating area of rectangle
		// TODO Auto-generated method stub
		double area = length*width;
		return area;
	}
	//toString
	public String toString() {
		return "TopLeft = "+topLeft.toString()+"; Length = "+length+"; Width = "+width;
	}

}
