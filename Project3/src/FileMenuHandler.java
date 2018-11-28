import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.awt.*;

public class FileMenuHandler implements ActionListener {
	JFrame jframe;
	public FileMenuHandler (JFrame jf) {
		jframe = jf;
	}
	public void actionPerformed(ActionEvent event) {
		String  menuName;
		menuName = event.getActionCommand();
		if (menuName.equals("Open"))
			openFile( ); 
		else if (menuName.equals("Quit"))
			System.exit(0);
	} //actionPerformed

	private void openFile( ) {
		JFileChooser chooser;
		int          status;
		chooser = new JFileChooser( );
		status = chooser.showOpenDialog(null);
		if (status == JFileChooser.APPROVE_OPTION) 
			readSource(chooser.getSelectedFile());
		else 
			JOptionPane.showMessageDialog(null, "Open File dialog canceled");
	} //openFile

	private void readSource(File chosenFile) {
	       String chosenFileName = chosenFile.getPath();
	       System.out.println(chosenFileName);
	       Project3.readLine(chosenFileName);
	       Project3.n.showList(Project3.unsortedDateList, Project3.sortedDateList); // display dates in GUI
	    }
}