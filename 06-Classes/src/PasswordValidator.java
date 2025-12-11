public class PasswordValidator implements IValidator {

	@Override
	public boolean isValid(String input) {
		return input.length() >= 8 ? true : false;
	}
	
}
