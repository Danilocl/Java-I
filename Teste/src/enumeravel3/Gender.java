package enumeravel3;

public enum Gender {

	FEMALE("f"), MALE("M");

	private final String value;

	private Gender(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
