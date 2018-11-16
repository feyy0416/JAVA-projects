/* Name:ZifeiSong  Lab:Section 11E */

import java.util.*;

public class Project2 {

	public static UnsortedDate212List unsortedDateList = new UnsortedDate212List();
	public static SortedDate212List sortedDateList = new SortedDate212List();
	  
	public static void main(String[] args) {
	    readLine(args[0]);
	    Date212GUI.createAndShowGUI(unsortedDateList, sortedDateList); // display lists in GUI.
	} // main
	 
	private static void readLine(String fileName) {
		String dateLine = "";
		TextFileInput myFile = new TextFileInput(fileName); // open the file.
		String line = myFile.readLine(); // read the file.
		while(line != null) { // if nothing is in the line, stop reading.
			dateLine = dateLine + "," + line; 
			line = myFile.readLine(); // read next line.
		}
		StringTokenizer tokens = new StringTokenizer(dateLine,","); // create tokens to separate dates by ",".
		int n = tokens.countTokens();
		for (int i = 0; i < n; i++) { 
		    Date212 temp = new Date212(tokens.nextToken());
	            if (temp.isValid) {
	                unsortedDateList.add(temp); 
	                sortedDateList.add(temp);
	            } // add legal dates to both lists.
	        else System.out.println(temp.toString()); // print the date.
		}
	}// readLine

} // class Project2