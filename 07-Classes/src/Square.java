


public class Square implements IShape {

    private double side;

    public Square(double side) {
        if (side < 0) {
            throw new IllegalArgumentException("side < 0");
        }
        this.side = side;
    }

    @Override
    public double area() {
		return Math.pow(side, side);
    }

    // void setSide(int side) {
    // width = side;
    // height = side;
    // }
}
