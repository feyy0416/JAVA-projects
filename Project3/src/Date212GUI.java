/* Name:ZifeiSong  Lab:Section 11E */

import java.awt.GridLayout;
import javax.swing.*;

public class Date212GUI extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String firstAreaText = "";
	private String secondAreaText = "";
	private JTextArea firstArea = new JTextArea(8, 20);
	private JTextArea secondArea = new JTextArea(8, 20);
	
	public Date212GUI() {
		//create and show the window.
		super();
		setTitle("Project3");
		setSize(400, 200);
		setLocation (100, 100);
		setLayout(new GridLayout(1,2));
		/* 
		 * set size location and layout of the GUI.
		 */
		createFileMenu(); // create the menu.
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JScrollPane scrollPane = new JScrollPane(firstArea);
		firstArea.setEditable(false);
		getContentPane().add(scrollPane); // add scroll pane to first area.
		JScrollPane scrollPane2 = new JScrollPane(secondArea);
		secondArea.setEditable(false);
		getContentPane().add(scrollPane2); // add scroll pane to second area.
		pack();
		setVisible(true);
	}

	public void showList(UnsortedDate212List unsortedList, SortedDate212List sortedList) {
		Date212Node x = unsortedList.first.next;
		Date212Node y = sortedList.first.next;
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
		
		pack();
	    setVisible(true);
	}
	 
	private void createFileMenu() {
		JMenuItem item;
		JMenuBar menuBar  = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		FileMenuHandler fmh = new FileMenuHandler(this);

		item = new JMenuItem("Open");    //Open...
		item.addActionListener( fmh );
		fileMenu.add( item );

		fileMenu.addSeparator();           //add a horizontal separator line

		item = new JMenuItem("Quit");       //Quit
		item.addActionListener( fmh );
		fileMenu.add( item );

		setJMenuBar(menuBar);
		menuBar.add(fileMenu);

	} //createMenu

} // class DateGUI


