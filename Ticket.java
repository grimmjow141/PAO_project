package my_package;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Ticket {
	private int id;
	private Movie movie;
	private Client client;
	private Room room;
	private int row;
	private int column;
	private final Date sell_date;
	private static int nr_of_tickets = 0;
	
	protected String key_code;
	protected float price;
	
	Ticket(Movie movie, Client client, int row, int column, Room room) {
		id = ++ nr_of_tickets;
		this.movie = movie;
		this.client = client;
		this.row = row;
		this.column = column;
		this.room = room;
		switch(client.getExc()) {
			case STUDENT:
				price = 9.3f;
				break;
			case RETIRED:
				price = 9.2f;
				break;
			case DISABLED:
				price = 8.5f;
				break;
			default:
				price = 10.0f;
		}
		sell_date = new Date();                  //we initialise sell_date with the current date
		String type = movie.getType().toString();//auxiliary variable, it stores the type but in string
		key_code = "#" + Utility.fill_zeros(id) + type.charAt(0) + type.charAt(1) + type.charAt(2);
	}
	
	public float getPrice () {
		return price;
	}

	public String getKey_code() {
		return key_code;
	}
}
