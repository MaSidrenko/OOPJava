
public class BankAccount {

    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        if (owner == null || owner.trim().isEmpty() || balance < 0) {
            throw new IllegalArgumentException("Invalid Input");
        }
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid Input");
        }
    }

    public void withdraw(double amount) {
        if (balance > 0 && balance >= amount) {
            balance -= amount;
        } else {
			System.out.println("Not enough balance");
        }
    }
	
	public void printInfo()
	{
		System.out.println("Balance: " + balance + "\nOwner: " + owner);
	}
}
