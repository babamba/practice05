package prob4;

public class RectTriangle extends Shape {
	private double width;
	private double height;
	
	
	public RectTriangle(double width, double height) {
		this.height = height;
		this.width = width;
	}
	
	@Override
	public double getPerimeter() {
		return width + height + Math.sqrt(width*width + height*height);  //(width*width) + (height*height);
	}
	
	@Override
	public double getArea() {
		return (width + height) / 2;
	}
}
