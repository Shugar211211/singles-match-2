package app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import app.dates_matcher.DatesMatchFinder;
import app.entity.CoupleMatch;
import app.entity.Single;
import app.input_reader.CSVReader;

public class App {

	public static void main(String[] args) {
		
		// Data file path
		String csvFile = "/home/eugeny/git/singles-match-2/csv-data.csv";
		
		// List of all singles, extracted from data file
		List<Single> singles = new ArrayList<Single>(); 
		
		// List of all matches, ordered by points
		List<CoupleMatch> dates = new ArrayList<CoupleMatch>();
		
		// Extract data from file into array list
		CSVReader.read(csvFile, singles);
//		for(Single entry : singles)
//			System.out.println(entry);
		
		// Fing matches and calculate points
		DatesMatchFinder.findMatches(singles, dates);
		
		// Sort matches
		List<CoupleMatch> datesSortedByPoints = dates.stream()
				.sorted( (e1, e2) -> (e1.getRating()>e2.getRating()?-1:1))
				.collect(Collectors.toList());
		
		// Print sorted list of matches
		datesSortedByPoints.forEach(e -> System.out.println(e));
	}
}
