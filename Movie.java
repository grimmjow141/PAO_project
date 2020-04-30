package my_package;

import my_package.Utility.Type;
import java.util.Date;
import java.text.ParseException;

public class Movie {
	
	private String name;
	private Type type;
	private Date start_time;
	private Date end_time;
	
	Movie(String name) {
		this.name = name;
	}
	
	Movie(String name, Type type) {
		this.name = name;
		this.type = type;
	}
	
	Movie(String name, String start_time, String end_time) {
		this.name = name;
		try {
			this.start_time = Utility.hour_format.parse(start_time);
			this.end_time = Utility.hour_format.parse(end_time);
		} catch (ParseException e) {
			System.out.println("Invalid date format!");
		} catch (NullPointerException e) {
			this.start_time = null;
			this.end_time = null;
		}
	}
	
	Movie(String name, Type type, String start_time, String end_time) {
		this.name = name;
		this.type = type;
		
		try {
			this.start_time = Utility.hour_format.parse(start_time);
			this.end_time = Utility.hour_format.parse(end_time);
		} catch (ParseException e) {
			System.out.println("Invalid date format!");
		}
	}

	@Override
	public String toString() {
//		System.out.print(name);
//		System.out.print(type.toString());
//		System.out.println(getStart);
		return String.format("%s [%s]: %s - %s", name, (type == null)?" ":type.toString(), getStart_time(), getEnd_time());
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getStart_time() {
		try {
			String aux = Utility.hour_format.format(start_time);
			return aux;
		} catch (NullPointerException e) {
			return " ";
		}
	}

	public void setStart_time(String start_time) {
		try {
			this.start_time = Utility.hour_format.parse(start_time);
		} catch (ParseException e) {
			System.out.println("Invalid date format!");
		}
	}

	public String getEnd_time() {
		try {
			String aux = Utility.hour_format.format(end_time);
			return aux;
		} catch (NullPointerException e) {
			return " ";
		}
	}

	public void setEnd_time(String end_time) {
		try {
			this.end_time = Utility.hour_format.parse(end_time);
		} catch (ParseException e) {
			System.out.println("Invalid date format!");
		}
	}
	
}
