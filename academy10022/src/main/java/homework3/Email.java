package homework3;

public class Email implements Validator {

	@Override
	public boolean validate(String line) {
		if (Regex.validEmail(line) == false) {
			return false;
		} else {
			return true;
		}
	}
}
