
public class App {

    public static void main(String[] args) throws Exception {
        // Calculator calc = new Calculator();
        // int a = 5;
        // int b = 5;
        // int res = calc.add(a, b);
        // System.out.println(res);
        // double x = 5.5;
        // double y = 4.3;
        // System.out.println(calc.add(x, y));
        // System.out.println(calc.add("Hello ", "World!"));

        Shape[] shapes = new Shape[] {
            new Circle(5),
            new Rectangle(5, 10)
        };

        for(int i = 0; i < shapes.length; i++)
        {
            System.out.println(shapes[i].area());
        }

        ShapeUtils su =new ShapeUtils();
        su.printArea(shapes[0]);
        su.printArea(shapes[1]);
    }
}
