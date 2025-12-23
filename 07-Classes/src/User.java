public class User {
	private String name;
	private int age;
	// Поля класса должны быть не public
	
	public void setName(String name) {
		if(name == "" || name.isEmpty())
			throw new IllegalArgumentException("Name can`t be null or empty");
		this.name = name;
	}
	public void setAge(int age) {
		if(age < 0)
			throw new IllegalArgumentException("Age < 0");
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

	
}
