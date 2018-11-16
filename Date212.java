/* Name:ZifeiSong  Lab:Section 11E */

public class Date212{

	private int year, month, day;
	public boolean isValid;

	public Date212(String date) {
		String stringYear, stringMonth, stringDay;
		stringYear = date.substring(0,4);// get the part of year from yyyymmdd.
		stringMonth = date.substring(4,6);// get the part of month.
		stringDay = date.substring(6,8);// get the part of day.
		year = Integer.valueOf(stringYear);
		month = Integer.valueOf(stringMonth);
		day = Integer.valueOf(stringDay);
		isValid = checkValid(this);
		/* transfer string variables into integers */
	}

	private static boolean checkValid(Date212 date) {
		// check if the date is legal.
		if( (date.month < 1) || (date.month > 12) ) return false; 
		else {
			if((date.month  == 1) || (date.month == 3) ||(date.month == 5) || (date.month == 7) || (date.month == 8) || (date.month == 10)|| (date.month == 12)) {
				if((date.day <=31) && (date.day >= 1)) return true;
				else return false;
			}
			/* check the odd months */
			else { 
				if(date.month == 2 && date.year % 4 == 0) {
					if(date.day <= 29 && date.day >= 1) return true;
					else return false;
				}
				/* check Februaries in leap years which should have 29 days. */
				else { 
					if(date.month == 2 && date.year % 4 != 0) {
						if(date.day <= 28 && date.day >= 1) return true;
						else return false;
					}
					/* check Februaries not in leap years, which have 28 days. */
				}
				if(date.day <= 30 && date.day >= 1) return true;
				else return false;
				/* check the even months besides February. */
			}     
		}	
	}// checkValid

	public String toString() {
		String y, m, d;
		y = String.valueOf(year);
		m = String.valueOf(month);
		d = String.valueOf(day);
		/* declare 3 string variables equal to the value of year, month and day */
		while (y.length() < 4) y = "0" + y;
		if (month < 10) m = "0" + month;
		if (day < 10) d = "0" + day;
		return m + "/" + d + "/" + y; // form : mm/dd/yyyy
	}

	public boolean lessThan(Date212 x) {
		if(year > x.year) return false;
		else if(year < x.year) return true;
		else if(month > x.month) return false;
		else if(month < x.month) return true;
		else if(day >= x.day) return false;
		else 
			return true;
		/* create a method to compare if the date is less than the date in class Date212 */
	}// lessThan

	public boolean notEqualsTo(Date212 x) {
		if(year != x.year && month != x.month && day != x.day) {
			return true;
		}
		else return false;
		/* create a method to compare if the date is not equal to each other in class Date212 */
	}

}