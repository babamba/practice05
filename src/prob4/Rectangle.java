package prob4;

public class Rectangle extends Shape{
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.height = height;
		this.width = width;
	}
	
	@Override
	public double getPerimeter() {
		return (width + height)	* 2;
	}
	
	@Override
	public double getArea() {
		return width * height;
	}


}
