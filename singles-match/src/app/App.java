package app;

import java.util.ArrayList;
import java.util.List;

import app.entity.Single;
import app.input_reader.CSVReader;

public class App {

	public static void main(String[] args) {
		String csvFile = "/home/eugeny/csv-data.csv";
		List<Single> datesList = new ArrayList<Single>(); 
		CSVReader.read(csvFile, datesList);
		for(Single entry : datesList)
			System.out.println(entry);
	}
}
