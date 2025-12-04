public class Product {
	private String name;
	private double price;
	private int quantity;

	Product(String name, int quantity)
	{
		this.name = name;
		this.quantity = quantity;
	}
	public void setPrice(double p)
	{
		if(p <= 0)
			throw new IllegalArgumentException("Цена должна быть больше 0");
		price = p;
	}

	public String getName()
	{
		return name;
	}

	public double getPrice()
	{
		return price;
	}

	public int getQuantity()
	{
		return quantity;
	}

	public double totalCost()
	{
		return quantity * price;
	}

}
