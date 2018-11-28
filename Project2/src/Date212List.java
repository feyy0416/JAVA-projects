/* Name:ZifeiSong  Lab:Section 11E */

public abstract class Date212List{

	protected Date212Node first; 
	protected Date212Node last; 
	protected int length;
	   
    public Date212List () {
	   Date212Node ln = new Date212Node(null);
       first = ln; // first node.
       last = ln;  // last node.
       length = 0; // length 0 to empty list.
    }
	   
    public void append (Date212 s) {
	   Date212Node n = new Date212Node(s);
       last.next = n;
       last = n;
       length++;
    }
    /* method append */
}// class Date212List