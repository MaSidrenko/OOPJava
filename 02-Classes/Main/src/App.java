public class App {
    public static void main(String[] args)  {
        // try {
        //     Thermometer t = new Thermometer();
        //     t.setTemp(10);
        //     System.out.println(t.getTemp());
        //     t.setTemp(-51);
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }
        // try {
        //     Thermometer t = new Thermometer();
        //     t.setTemp(51);
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }

        try {
            Product p = new Product("RTX 3080", 5);
            p.setPrice(100000);   
            System.out.println("Название: " + p.getName());
            System.out.println("Цена: " + p.getPrice());
            System.out.println("Количество: " + p.getQuantity());
            System.out.println(p.totalCost());
            p.setPrice(-1000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
