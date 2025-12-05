public class Animal {
	protected String name;

    public Animal(String name) {
		this.name = name;
	}

	
	void Sound()
	{
		System.out.println("Animal make the sound");
	}

	void Info()
	{
		System.out.println(name);
	}
}
