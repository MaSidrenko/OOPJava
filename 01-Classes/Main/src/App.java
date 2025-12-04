
public class App {

    public static void main(String[] args) {
        System.out.println("First task: ");
        Point p = new Point(10, 20);
        p.print();

        System.out.println("Second task: ");
        Rectangle rect = new Rectangle(5, 10);
        Rectangle baseRect = new Rectangle();

        System.out.println("Rectangle: ");
        System.out.println("Area: " + rect.area());
        System.out.println("Perimeter: " + rect.perimeter());
        System.out.println("Base Rectangle: ");
        System.out.println("Area: " + baseRect.area());
        System.out.println("Perimeter: " + baseRect.perimeter());
        System.out.println("Third task: ");
        try {
            BankAccount bank = new BankAccount("Maxim", 30000);
            bank.printInfo();
            bank.deposit(100);
            bank.printInfo();
            bank.withdraw(100);
            bank.printInfo();
            BankAccount bank0 = new BankAccount("", -10);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
