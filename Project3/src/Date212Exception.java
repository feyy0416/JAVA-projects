/* Name:ZifeiSong  Lab:Section 11E */
 
/*
 * Handle a NumberFormatException with a messageDialog
 */
public class Date212Exception extends IllegalArgumentException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Date212Exception(){
	       super();
    }
	public Date212Exception(String message){
	       super(message);
    }
	public Date212Exception(Throwable cause){
	       super(cause);
    }
	public Date212Exception(String message, Throwable cause){
	       super(message, cause);
    } 
}