public class FileLogger implements ILogger {

	@Override
	public void log(String msg) {
		System.out.println("FILE: " + msg);
	}
	
}
