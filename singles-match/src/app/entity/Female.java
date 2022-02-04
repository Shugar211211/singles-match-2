package app.entity;

public class Female extends Single{
	private String hairColor;

	public Female(String fullName, 
				  String gender, 
				  short age, 
				  String occupation, 
				  String dominantTrait,
				  String preferredGender, 
				  short agePrefUpperBound, 
				  String preferredOccupation, 
				  String preferredTrait,
				  String hairColor) {
		
		super(fullName, 
			  gender, 
			  age, 
			  occupation, 
			  dominantTrait, 
			  preferredGender, 
			  agePrefUpperBound, 
			  preferredOccupation,
			  preferredTrait);
		this.hairColor = hairColor;
	}

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}

	@Override
	public String toString() {
		return super.toString() + " \nHair color=" + this.hairColor + "\n";
	}
}
