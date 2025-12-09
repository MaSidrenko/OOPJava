public class EmailNotification extends Notification {

	private String email;

	public EmailNotification(String recipient, String email) 
	{
		super(recipient);
		this.email = email;
	}
	@Override
	public void send() {
		System.out.println("Отправка на email: <" + email + ">");
	}
	@Override
	public void printInfo()
	{
		super.printInfo();
		System.out.println(email);
	}
	
}
