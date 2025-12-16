public record Product(String name, double price) {

    public Product(String name, double price) {
		if(name == null || name.isEmpty() || price < 0)
			throw new IllegalArgumentException("Error! Illegal Argument!");
        this.name = name;
        this.price = price;
    }
	
}
