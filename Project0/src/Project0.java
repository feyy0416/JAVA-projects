/* Name:ZifeiSong  Lab:Section 11E */

import javax.swing.*;
public class Project0 {
	
	public static void main(String[] args) {
		while (true){
		/* Make sure to repeat the process */
		
		    String sentenceByUser = JOptionPane.showInputDialog(null, "Please type in a random sentence.");
			/* Ask the user to type in a sentence */
			
			if (sentenceByUser.equalsIgnoreCase("STOP")){
			    System.exit(0);
		    }
			/* Quit if user types in "Stop" whether it's upper case or lower case */
			
            int TimeOfUpperE = upperCaseCount(sentenceByUser, sentenceByUser.length());
		    int TimeOfLowerE = lowerCaseCount(sentenceByUser, sentenceByUser.length());
			/* declare two variables which equal to the numbers of upper case e and lower case e */
			
		    JOptionPane.showMessageDialog(null, "Number of lower case e's: " + TimeOfLowerE + "\nNumber of upper case e's: " + TimeOfUpperE);
		    /* tell the user how many upper and lower case e's were in the string. */
		
		} 
		/* while(true) */
		
	}
	/* main */
	
	public static int upperCaseCount(String mySentence, int size){
		int sum = 0;
		for (int i = 0; i < size; i++){
			if (mySentence.charAt(i) == 'E'){            
			sum = sum + 1;
			/* if no.i char in the sentence is "E"， add 1 on sum */
			
            }
        }
        return sum;
		/* return the sum of the upper case e */
		
    }
    /* upperCaseCount */
	
    public static int lowerCaseCount(String mySentence, int size){
		int sum = 0;
		for (int i = 0; i < size; i++){
			if (mySentence.charAt(i) == 'e'){
                sum = sum + 1;
			/* if no.i char in the sentence is "e"， add 1 on sum */	
				
            }
        }
        return sum;
		/* return the sum of lower case e */
		
    }
	/* lowerCaseCount */
	
}
/* Project0 */