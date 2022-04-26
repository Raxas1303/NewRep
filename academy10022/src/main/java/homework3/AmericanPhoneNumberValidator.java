package homework3;

public class AmericanPhoneNumberValidator implements Validator {

	@Override
	public boolean validate(String line) {
		if (Regex.validAmerican(line) == false) {
			return false;
		} else {
			return true;
		}
	}

}
