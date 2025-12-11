public class EmailValidator implements IValidator {

	@Override
	public boolean isValid(String input) {
		for (char c : input.toCharArray()) {
			if(c == '@')
				return true;
		}
		return false;
	}
	
}
