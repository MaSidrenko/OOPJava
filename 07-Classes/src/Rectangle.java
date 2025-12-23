
public class Rectangle implements IShape {

    private double width;
    private double height;

    public Rectangle(double  width, double  height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("width or/and < 0");
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

}
