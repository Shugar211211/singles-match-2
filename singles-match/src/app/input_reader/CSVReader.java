package app.input_reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import app.entity.Female;
import app.entity.Male;
import app.entity.Single;

public class CSVReader {
	public static final String delimiter = ",";
	  public static void read(String csvFile, List<Single> singles) {
	    try {
	      File file = new File(csvFile);
	      FileReader fr = new FileReader(file);
	      BufferedReader br = new BufferedReader(fr);
	      String line = " ";
	      String[] tempArr;
	      Single tempEntry;
	      
	      while ((line = br.readLine()) != null) {
	        tempArr = line.split(delimiter);
	        if(tempArr[1].equalsIgnoreCase("male")) {
	    	   tempEntry = new Male(tempArr[0],
	    			   					 tempArr[1],
	    			   					 Short.parseShort(tempArr[2]),
	    			   					 tempArr[3],
	    			   					 tempArr[4],
	    			   					 tempArr[5],
	    			   					 Short.parseShort(tempArr[6]),
	    			   					 tempArr[7],
	    			   					 tempArr[8],
	    			   					 Short.parseShort(tempArr[9]));
	        }
	        else {
	    	   tempEntry = new Female(tempArr[0],
	   					 					 tempArr[1],
	   					 					 Short.parseShort(tempArr[2]),
	   					 					 tempArr[3],
	   					 					 tempArr[4],
	   					 					 tempArr[5],
	   					 					 Short.parseShort(tempArr[6]),
	   					 					 tempArr[7],
	   					 					 tempArr[8],
	   					 					 tempArr[9]);
	       }
	       singles.add(tempEntry);
	      }
	      br.close();
	    }
	    catch(IOException ioe) {
	      ioe.printStackTrace();
	    }
	}
}
