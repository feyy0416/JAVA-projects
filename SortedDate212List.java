/* Name:ZifeiSong  Lab:Section 11E */

public class SortedDate212List extends Date212List{
	
	public SortedDate212List() {
		super(); // super class
	} // constructor
	
	public void add(Date212 x) {
		if(last.date != null) { 
		    if(last.date.lessThan(x)) {
		    	append(x);
		    }
		    else prepend(x);
		}
		else append(x);
	}
	/* consider 3 conditions : 1. x is bigger, add it to the last of the node.
	 *                         2. x is smaller, add it to the first of the node.
	 *                         3. node is null, add x to node directly.
	 */
} // class SortedDate212List