/* Name:ZifeiSong  Lab:Section 11E */

import java.awt.GridLayout;
import javax.swing.*;

public class Date212GUI{
	
	public static void createAndShowGUI(UnsortedDate212List unsortedDateList, SortedDate212List SortedDateList) {
		//create and show the window.
		Date212Node x = unsortedDateList.first.next;
		Date212Node y = SortedDateList.first.next;
		String firstAreaText = "";
		String secondAreaText = "";
		JFrame frame = new JFrame("Project2");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		while (x != null) {
			firstAreaText = firstAreaText + x.date + "\n";
			x = x.next;
		}
		firstArea.setText(firstAreaText); // put text in first area.
		while (y != null) {
			secondAreaText = secondAreaText + y.date + "\n";
			y = y.next;
		}
		secondArea.setText(secondAreaText); // put text in second area.

		frame.pack();
		frame.setVisible(true);
	} // createAndShowGUI
} // class DateGUI
