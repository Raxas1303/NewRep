package homework3;

public class BelarusPhoneNumberValidator implements Validator {

	@Override
	public boolean validate(String line) {
		if (Regex.validBelarus(line) == false) {
			return false;
		} else {
			return true;
		}
	}
}