public class BankAccount {
	private String owner;
	private int balance;

    public BankAccount(String owner, int balance) throws InvalidAccountException {
		if(owner == null || owner.isEmpty())
			throw new InvalidAccountException("Owner is NULL!");

		this.balance = balance;
		this.owner = owner;
    }

	void withdraw(double amount) throws InvalidAccountException
	{
		if(amount <= 0)
			throw new IllegalArgumentException("amount < 0");
		if(amount > balance)
			throw new InvalidAccountException("Amount is bigger balance!");

		balance -= amount;
	}
}
