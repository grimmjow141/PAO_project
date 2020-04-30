package my_package;

import java.util.Date;

public class Ticket {
	
	private int id;
	private Movie movie;
	private Client client;
	private OccupiedSeat occupied_seat;
	private final Date sell_date;
	private static int nr_of_tickets = 0;
	
	protected String key_code;
	protected float price;
	
	Ticket(Movie movie, Client client, OccupiedSeat occupied_seat) {
		id = ++ nr_of_tickets;
		this.movie = movie;
		this.client = client;
		this.occupied_seat = occupied_seat;
		if (client.getExc() != null)
			switch(client.getExc()) {
				case STUDENT:
					price = 9.3f;
					break;
				case RETIRED:
					price = 9.2f;
					break;
				case DISABLED:
					price = 8.5f;
			}
		else
			price = 10.0f;
		sell_date = new Date();                  //we initialize sell_date with the current date
		String type = (movie.getType() != null) ? movie.getType().toString() : "";//auxiliary variable, it stores the type but in string
		key_code = "#" + Utility.fill_zeros(id);
		key_code += (movie.getType() != null) ? (type.charAt(0) + type.charAt(1) + type.charAt(2)) : "";
	}
	
	public Movie getMovie () {
		return movie;
	}
	
	public Client getClient () {
		return client;
	}
	
	public String getSell_date () {
		return Utility.date_format.format(sell_date);
	}
	
	public float getPrice () {
		return price;
	}
	
	public String getKey_code() {
		return key_code;
	}
	
}
