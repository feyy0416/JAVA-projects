/* Name:ZifeiSong  Lab:Section 11E */

public class SortedDate212List extends Date212List{
	
	public SortedDate212List() {
		super(); // super class
	} // constructor
	
	public void add(Date212 d) { 
		Date212Node x = first;
        Date212Node y = first.next;
        while(y != null) {
        	Date212Node z = new Date212Node(d);
		    if(z.date.lessThan(y.date)) {
		    	x.next = z;
		    	z.next = y;
		    	length++;
		    	return;
		    }
		    x = y;
		    y = y.next;
        }
        super.append(d);
	/* consider 3 conditions : 1. x is bigger, add it to the last of the node.
	 *                         2. x is smaller, add it to the first of the node.
	 *                         3. node is null, add x to node directly.
	 */
	}
} // class SortedDate212List