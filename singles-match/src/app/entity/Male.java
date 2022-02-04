package app.entity;

public class Male extends Single{
	private short height;

	public Male(String fullName, 
				String gender, 
				short age, 
				String occupation, 
				String dominantTrait,
				String preferredGender, 
				short agePrefUpperBound, 
				String preferredOccupation, 
				String preferredTrait,
				short height) {
		
		super(fullName, 
			  gender, 
			  age, 
			  occupation, 
			  dominantTrait,
			  preferredGender, 
			  agePrefUpperBound, 
			  preferredOccupation, 
			  preferredTrait);
		this.height = height;
	}

	public short getHeight() {
		return height;
	}

	public void setHeight(short height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return super.toString() + " \nHeight=" + this.height + "\n";
	}

	
}
