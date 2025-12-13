
public class App {

    public static void main(String[] args) throws Exception {

        // Scanner in = new Scanner(System.in);
        // int userInput = in.nextInt();
        // int del = 100;
        // try {
        //     System.out.println(del / userInput);
        // } catch (ArithmeticException e) {
        //     System.out.println(e.getMessage());
        // }
        // try {
        //     System.out.println(parseAge("22"));
        //     System.out.println(parseAge("-1"));
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }
        // System.out.println(parseAge("Abc"));
        try {
           BankAccount ba = new BankAccount("Maxim", 20000);
           ba.withdraw(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            BankAccount n = new BankAccount("", 100);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            BankAccount ba = new BankAccount("Ivan", 1000);
            ba.withdraw(1001);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



    }

    static int parseAge(String input) {
        try {
            int num = Integer.parseInt(input);
            if (num < 0 || num > 150) {
                throw new IllegalArgumentException("Age < 0 or Age > 150");
            }
            return num;
        } catch (NumberFormatException e) {
            System.out.println("Error! " + e.getMessage());
        }
        return 0;
    }
}
