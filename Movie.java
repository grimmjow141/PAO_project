package my_package;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Movie {
	private String name;
	private Utility.Type type;
	private Date start_time;
	private Date end_time;
	
	Movie(String name) {
		this.name = name;
	}
	
	Movie(String name, Utility.Type type) {
		this.name = name;
		this.type = type;
	}
	
	Movie(String name, Utility.Type type, String start_time, String end_time) {
		this.name = name;
		this.type = type;
		try {
			this.start_time = Utility.date_format.parse(start_time);
			this.end_time = Utility.date_format.parse(end_time);
		} catch (ParseException e) {
			System.out.println("Invalid date format!");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Utility.Type getType() {
		return type;
	}

	public void setType(Utility.Type type) {
		this.type = type;
	}

	public Date getStart_time() {
		return start_time;
	}

	public void setStart_time(String start_time) {
		try {
			this.start_time = Utility.date_format.parse(start_time);
		} catch (ParseException e) {
			System.out.println("Invalid date format!");
		}
	}

	public Date getEnd_time() {
		return end_time;
	}

	public void setEnd_time(String end_time) {
		try {
			this.end_time = Utility.date_format.parse(end_time);
		} catch (ParseException e) {
			System.out.println("Invalid date format!");
		}
	}
}
