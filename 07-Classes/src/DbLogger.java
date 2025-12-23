public class DbLogger implements ILogger {

	@Override
	public void log(String msg) {
		System.out.println("DB: " + msg);
	}
	
}
