package app.entity;

public class CoupleMatch {
	private Single match1;
	private Single match2;
	private int rating;
	
	public CoupleMatch(Single match1, Single match2, int rating) {
		super();
		this.match1 = match1;
		this.match2 = match2;
		this.rating = rating;
	}

	public Single getMatch1() {
		return match1;
	}

	public void setMatch1(Single match1) {
		this.match1 = match1;
	}

	public Single getMatch2() {
		return match2;
	}

	public void setMatch2(Single match2) {
		this.match2 = match2;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		return "\t>>>>>>>Match by " + this.rating + " points\n" + match1.toString() + "\t*** and ***\n" + match2.toString() + "\t<<<<<<<\n";
	}
}
