
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {

    public static void main(String[] args) throws Exception {
        // User a = new User("a", 0);
        // User b = new User("b", 10);
        // System.out.println(a);
        // System.out.println(b.equals(a));
        // try {
        //     Product p = new Product("p", 1000);
        //     System.out.println(p);
        //     Product p1 = new Product("", -100);
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }

        List<OrderItem> order = new ArrayList<>();
        order.add(new OrderItem("Bread", 100, 30));
        order.add(new OrderItem("Butter", 100, 100));
        order.add(new OrderItem("Sugar", 150, 50));
        System.out.println(order.stream().mapToDouble(o -> o.totalPrice()).sum());
        System.out.println(order.stream()
                .max(Comparator.comparingDouble(o -> o.totalPrice())));
        

    }
}
