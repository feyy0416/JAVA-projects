/* Name:ZifeiSong  Lab:Section 11E */

public class Date212Node{
	
	protected Date212 date;
	protected Date212Node next; 
	/* protected access. */
	
	public Date212Node(Date212 d) {
		date = d;
		next = null; 
	} // constructor
	
	public Date212Node() {
        date = new Date212("00000000");
        next = null;
    } // empty node
	
} // class Date212Node.