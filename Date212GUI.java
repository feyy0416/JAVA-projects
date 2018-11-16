/* Name:ZifeiSong  Lab:Section 11E */

import java.awt.GridLayout;
import javax.swing.*;

public class DateGUI{

	public static void createAndShowGUI(Date212[] dates, Date212[] datesSort) {
		//create and show the window.
		String firstAreaText = "";
		String secondAreaText = "";
		JFrame frame = new JFrame("Project1");
		frame.setSize(400, 200); //width:400 height:200
		frame.setLocation(100, 100); //set the location.
		frame.setLayout(new GridLayout(1,2)); //set 1 row and 2 columns.
		JTextArea firstArea = new JTextArea(8, 20);
		JScrollPane scrollPane = new JScrollPane(firstArea);
		firstArea.setEditable(false);
		frame.getContentPane().add(scrollPane); // add scroll pane to first area.
		JTextArea secondArea = new JTextArea(8, 20);
		JScrollPane scrollPane2 = new JScrollPane(secondArea);
		secondArea.setEditable(false);
		frame.getContentPane().add(scrollPane2); // add scroll pane to second area.
		for (int i = 0; i < dates.length; i++) {
			firstAreaText = firstAreaText + dates[i].toString() + "\n";
		}
		firstArea.setText(firstAreaText); // put text in first area.
		for (int i = 0; i < datesSort.length; i++) {
			secondAreaText = secondAreaText + datesSort[i].toString() + "\n";
		}
		secondArea.setText(secondAreaText); // put text in second area.

		frame.pack();
		frame.setVisible(true);
	} // createAndShowGUI
} // class DateGUI
