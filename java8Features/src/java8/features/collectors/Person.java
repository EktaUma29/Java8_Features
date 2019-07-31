package java8.features.collectors;

public class Person {
	private int personId;
	private String name;
	private Gender gender;

	public Person(int personId, String name, Gender gender) {
		super();
		this.personId = personId;
		this.name = name;
		this.gender = gender;
	}

	public boolean isMale() {
		return this.gender == Gender.MALE;
	}

	public boolean isFemale() {
		return this.gender == Gender.FEMALE;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		StringBuilder str = null;
		str = new StringBuilder();
		str.append("Id: " + getPersonId() + " Gender: " + getGender() + " Name: " + getName());
		return str.toString();
	}

	public static enum Gender {
		MALE, FEMALE
	}

}
