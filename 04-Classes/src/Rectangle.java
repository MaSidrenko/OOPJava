
public class Rectangle extends Shape {

    private double width;
	private double  height;

    public Rectangle(double width, double heidht) {
		this.width = width;
		this.height = heidht;
    }
	double area()
	{
		return  width * height;
	}
	
}
