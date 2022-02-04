package app.entity;

public abstract class Single {
	
	private String fullName;
	private String gender;
	private short age;
	private String occupation;
	private String dominantTrait;
	private String preferredGender;
	private short agePrefUpperBound;
	private String preferredOccupation;
	private String preferredTrait;

	public Single(String fullName, String gender, short age, String occupation, String dominantTrait,
			String preferredGender, short agePrefUpperBound, String preferredOccupation, String preferredTrait) {
		super();
		this.fullName = fullName;
		this.gender = gender;
		this.age = age;
		this.occupation = occupation;
		this.dominantTrait = dominantTrait;
		this.preferredGender = preferredGender;
		this.agePrefUpperBound = agePrefUpperBound;
		this.preferredOccupation = preferredOccupation;
		this.preferredTrait = preferredTrait;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public short getAge() {
		return age;
	}

	public void setAge(short age) {
		this.age = age;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getDominantTrait() {
		return dominantTrait;
	}

	public void setDominantTrait(String dominantTrait) {
		this.dominantTrait = dominantTrait;
	}

	public String getPreferredGender() {
		return preferredGender;
	}

	public void setPreferredGender(String preferredGender) {
		this.preferredGender = preferredGender;
	}

	public short getAgePrefUpperBound() {
		return agePrefUpperBound;
	}

	public void setAgePrefUpperBound(short agePrefUpperBound) {
		this.agePrefUpperBound = agePrefUpperBound;
	}

	public String getPreferredOccupation() {
		return preferredOccupation;
	}

	public void setPreferredOccupation(String preferredOccupation) {
		this.preferredOccupation = preferredOccupation;
	}

	public String getPreferredTrait() {
		return preferredTrait;
	}

	public void setPreferredTrait(String preferredTrait) {
		this.preferredTrait = preferredTrait;
	}

	@Override
	public String toString() {
		return "Name=" + fullName + ", \nGender=" + gender + ", \nAge=" + age + ", \nOccupation=" + occupation
				+ ", \nDominantTrait=" + dominantTrait + ", \nPreferred gender=" + preferredGender + ", \nAgePrefUpperBound="
				+ agePrefUpperBound + ", \nPreferred occupation=" + preferredOccupation + ", \nPreferred trait="
				+ preferredTrait;
	}
}
