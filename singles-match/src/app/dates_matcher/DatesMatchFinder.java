package app.dates_matcher;

import java.util.List;
import app.entity.CoupleMatch;
import app.entity.Single;

public class DatesMatchFinder {
	public static void findMatches(List<Single> singles, List<CoupleMatch> dates) {
		while(singles.size()>1) {
			Single single1 = singles.get(0);
			singles.remove(0);
			for(Single single2 : singles) {
				checkGendersMatch(single1, single2, dates);
			}
		}
	}
	
	private static void checkGendersMatch(Single single1, Single single2, List<CoupleMatch> dates) {
		
		// Else check for match points
		if( single1.getGender().equalsIgnoreCase(single2.getPreferredGender()) 
				&& 
			single1.getGender().equalsIgnoreCase(single2.getPreferredGender()) ) { 
			scorePoints(single1, single2, dates);
		}
		
		// If preferred genders don't match reciprocally, quit the method
		else {
			
			return; 
		}
	}
	
	private static void scorePoints(Single single1, Single single2, List<CoupleMatch> dates) {
		int points = 0;
		
		if(single1.getAge() < single2.getAgePrefUpperBound() 
				&& 
		   single1.getAgePrefUpperBound() > single2.getAge()) { points++; } 
		
		if(single1.getOccupation().equals(single2.getPreferredOccupation()) 
				&&
		   single1.getPreferredOccupation().equals(single2.getOccupation())) { points++; }
		
		if(single1.getDominantTrait().equals(single2.getPreferredTrait())
				&&
		   single1.getPreferredTrait().equals(single2.getDominantTrait())) { points++; }
		
		dates.add(new CoupleMatch(single1, single2, points));
	}
}
