package my_package;

import java.text.SimpleDateFormat;
import java.util.Date;
//just an auxiliary class to store different utility functions and often used variables
public final class Utility {
	private Utility() { }    //to prevent instantiation
	
	public static enum Exc {STUDENT, RETIRED, DISABLED;}           //exception, used in Client class
	public static enum Type {ACTION, ADVENTURE, THRILLER, COMEDY, DRAMA;} //type of a movie, used in Movie class
	
	public static SimpleDateFormat date_format = new SimpleDateFormat("E dd.MM hh:mm a"); //custom date format
	
	public static String fill_zeros (int id) {           //it fills with 0s in the format: #CCC
		String nr = String.valueOf(id); 
		if (id > 99)
			return nr;
		else
			if (id > 9)
				return "0" + nr;
			else
				return "00" + nr;
	}
}
