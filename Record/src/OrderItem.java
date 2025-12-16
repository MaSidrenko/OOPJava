public record OrderItem(String productName, int quantity, double pricePerUnit) {
	double totalPrice()
	{
		return quantity * pricePerUnit;
	}
	
}
