/* Name:ZifeiSong  Lab:Section 11E */

import java.util.*;

public class Project1 {


	public static Date212[] validDates; // array contain valid dates.
	public static Date212[] datesSort; // array contain sorted dates.

	public static Date212[] dates;

	public static void main(String[] args) {
		String dateLine = "";
		TextFileInput myFile = new TextFileInput(args[0]); // open the file.
		String line = myFile.readLine(); // read the file.
		while(line != null) { // if nothing is in the line, stop reading.
			dateLine = dateLine + "," + line; 
			line = myFile.readLine(); // read next line.
		}
		int numberOfTokens;
		StringTokenizer tokens = new StringTokenizer(dateLine,","); // create tokens to separate dates by ",".
		numberOfTokens = tokens.countTokens();// count tokens
		dates = new Date212[numberOfTokens]; 
		datesSort = new Date212[numberOfTokens];
		int i = 0;
		while (tokens.hasMoreTokens()) {
			dates[i]=new Date212(tokens.nextToken());
			i++;
		} // if there are more tokens increase value of i.
		/* fill the string variables into array dates. */
		int n = 0;
		for(int j = 0; j < numberOfTokens; j++) {
			if (dates[j].isValid) n++;
		}
		validDates = new Date212[n];
		n = 0;
		for(int j = 0; j < numberOfTokens; j++) {
			if (dates[j].isValid) {
				validDates[n] = dates[j];
				n++;
				/* check if the date in array dates is not legal put it out of array validDates. */
			}
			else System.out.println(dates[j].toString()); // print the date on the console
		}
		datesSort = datesSort(validDates);
		DateGUI.createAndShowGUI(validDates, datesSort); // display window
	}// main

	private static Date212[] datesSort(Date212[] dates) {
		datesSort = dates.clone(); // copy dates to datesSort.
		for (int i = 0;i < datesSort.length - 1 ;i++) { 
			int indexLowest = i; // declare a lowest index i.
			for (int j = i + 1 ;j < dates.length; j++) 
				if (datesSort[j].lessThan(datesSort[indexLowest])) 
					indexLowest = j; // update indexLowest to new value if there is some index smaller.
			if (datesSort[indexLowest].notEqualsTo(datesSort[i])) { 
				Date212 temp = datesSort[indexLowest]; 
				datesSort[indexLowest] = datesSort[i]; 
				datesSort[i] = temp; 
				/* create a temp to switch values. */
			}  // if
		} // for i 
		/* method selection sort */
		return datesSort;
	} 
}// class Project1