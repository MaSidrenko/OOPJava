public class PushNotification extends Notification {

	private int deviceID;

	public PushNotification(String recipient, int deviceID) {
		super(recipient);
		this.deviceID = deviceID;
	}

	@Override
	public void send() {
		System.out.println("Push на устройство: <" + deviceID + ">");
	}
	@Override
	public void printInfo()
	{
		super.printInfo();
		System.out.println(deviceID);
	} 
	
}
